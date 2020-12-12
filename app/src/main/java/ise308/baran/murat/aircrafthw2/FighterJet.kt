package ise308.baran.murat.aircrafthw2

import android.util.Log

class FighterJet(brand: String, aModel: String, avgAirSpeed: Double, val maxAirSpeed: Double,
                  val maxAltitude: Int ):Airplane(brand, aModel, avgAirSpeed) {


    override fun displayInfo() {
        //super.displayInfo()   I commended this line because it was creating logs with "Aircraft" tag
        Log.i(TAG, "displayInfo: This plane can flight $maxAltitude maximum altitude with an $maxAirSpeed maximum speed")


    }

    override fun calcETA(distance: Int, avgAirSpeed: Double) {
        Log.i(TAG, "calcETA: If you could fly in an $aModel, it will just take ${distance/avgAirSpeed} hours.")
    }

    companion object {
        const val TAG = "FighterJet"
    }

}

