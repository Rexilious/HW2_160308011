package ise308.baran.murat.aircrafthw2

import android.util.Log

open class Aircraft(val brand: String, val aModel: String, val avgAirSpeed: Double) {  // aModel represent "aircraft model"


    var current: String = "It will set aga."
    constructor(brand: String, aModel: String, avgAirSpeed: Double, current: String):this(brand, aModel, avgAirSpeed) {
        this.current = current

    }
    init {
        println("----------INIT BLOCK-------------") //  I used this block to read the code easily.
    }

    open fun setModel(b: String) {
        current = b

    }
    open fun displayInfo() {     // this is the method for displaying general info about aircraft
        Log.i(TAG, "displayInfo: You're flying with $aModel that is a $brand brand.")
    }

    open fun calcETA(distance: Int, avgAirSpeed: Double){     // this is the method for calculating estimated flight time and I overrided it several times.
        Log.i(TAG, "calcETA: Your trip will take ${distance/avgAirSpeed} hours by $aModel. Have a safe trip.")
    }

    companion object {
        const val TAG = "Aircraft"
    }


}