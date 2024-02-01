package com.example.sunnyweather_jiang

import android.annotation.SuppressLint
import android.app.Application
import android.content.Context

class SunnyWeatherApplication : Application() {

    override fun onCreate() {
        super.onCreate()
        conext = applicationContext
    }

    companion object{
        @SuppressLint("StaticFieldLeak")
        lateinit var conext : Context
        const val key = "8c7772a5b6596b68104b3cdd5a3d39b1"
    }

}