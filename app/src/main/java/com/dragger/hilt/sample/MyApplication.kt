package com.dragger.hilt.sample

import android.app.Application
import com.dragger.hilt.data.UserData
import dagger.hilt.android.HiltAndroidApp
import javax.inject.Inject

@HiltAndroidApp
class MyApplication : Application(){
    @Inject lateinit var userData: UserData
}