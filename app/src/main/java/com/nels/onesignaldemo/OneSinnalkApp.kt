package com.nels.onesignaldemo

import android.app.Application
import com.onesignal.OneSignal

const val ONE_SIGNAL_APP_ID = "1c171f33-2b2c-4fa9-a978-1dc82073094d"
class OneSinnalkApp: Application() {
    override fun onCreate() {
        super.onCreate()
        OneSignal.setLogLevel(OneSignal.LOG_LEVEL.VERBOSE, OneSignal.LOG_LEVEL.NONE)
        //OneSignal.setLogLevel(OneSignal.LOG_LEVEL.DEBUG, OneSignal.LOG_LEVEL.DEBUG);

        // OneSignal Initialization
        OneSignal.initWithContext(this)
        OneSignal.setAppId(ONE_SIGNAL_APP_ID)
    }
}