package com.kotlin.steps_tracker

import android.app.Application
import dagger.hilt.android.HiltAndroidApp
import timber.log.Timber

/**
 * Created by Vishakha Sharma on 22-07-2021.
 */
@HiltAndroidApp
class StepsTrackerApplication : Application() {

    override fun onCreate() {
        super.onCreate()
        Timber.plant(Timber.DebugTree())
    }
}