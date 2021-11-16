package com.tranconguet.gradledemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.tranconguet.androidlib1.DemoAndroidLib
import com.tranconguet.lib1.DemoClass

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val demoLib1 = DemoClass()
        val demoAndroidLib1 = DemoAndroidLib()
        Log.d("DemoLog","demoLib " + demoLib1.demoVariable)
        Log.d("DemoLog","demoAndroidLib " + demoAndroidLib1.demoVariable)

    }
}