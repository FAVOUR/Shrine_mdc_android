package com.example.shrine_mdc_android.application

import android.app.Application
import androidx.appcompat.app.AppCompatDelegate

class ShrineApplication :Application(){
 companion object{
     lateinit var instance: ShrineApplication
     private set
 }

    override fun onCreate() {
        super.onCreate()
        instance=this
        AppCompatDelegate.setCompatVectorFromResourcesEnabled(true)
    }
}