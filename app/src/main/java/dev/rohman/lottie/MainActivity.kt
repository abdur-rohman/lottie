package dev.rohman.lottie

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import com.airbnb.lottie.LottieAnimationView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val lavLove = findViewById<LottieAnimationView>(R.id.lav_love)
        val ivLove = findViewById<ImageView>(R.id.iv_love)

        ivLove.setOnClickListener {
            lavLove.pauseAnimation()
            lavLove.playAnimation()
        }
    }
}