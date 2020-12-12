package ise308.baran.murat.aircrafthw2

import android.util.Log

class Helicopter(brand: String, aModel: String, avgAirSpeed: Double, val usingPurpose: String):Aircraft(brand,aModel,avgAirSpeed) {

    override fun displayInfo() {
        //super.displayInfo()  I commended this line because it was creating logs with "Aircraft" tag and uncess
        Log.i(TAG, "displayInfo: $aModel is an $usingPurpose helicopter that is made by $brand ")

    }

    companion object {
        const val TAG = "Helicopter"
    }
}