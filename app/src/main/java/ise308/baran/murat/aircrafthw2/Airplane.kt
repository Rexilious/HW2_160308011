package ise308.baran.murat.aircrafthw2

import android.util.Log

open class Airplane(brand: String, aModel: String, avgAirSpeed: Double):Aircraft(brand, aModel, avgAirSpeed) {
    // I just created this class to inherit and create different types of planes.


    companion object {
        const val TAG = "Airplane"
    }

}