package com.wtf.deviceinfo

import android.content.Context
import android.content.res.Configuration
import android.os.Bundle
import android.util.DisplayMetrics
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        showScreenInfo(this)
    }

    private fun showScreenInfo(context: Context) {
        val dm: DisplayMetrics = context.resources.displayMetrics
        val screenWidth = dm.widthPixels / dm.xdpi
        val screenHeight = dm.heightPixels / dm.ydpi
        val config: Configuration = context.resources.configuration
        findViewById<TextView>(R.id.text).text =
            "屏幕信息：screenWidth：$screenWidth screenHeight:$screenHeight 最小宽度为：${config.smallestScreenWidthDp} config:$config"
    }
}