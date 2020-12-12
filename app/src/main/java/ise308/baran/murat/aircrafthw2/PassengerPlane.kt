package ise308.baran.murat.aircrafthw2

import android.util.Log

class PassengerPlane(brand: String, aModel: String, avgAirSpeed: Double, val numofSeat: Int,val isCargo: Boolean,
                     val from: String,val to: String,val flightCode: String):Airplane(brand, aModel, avgAirSpeed) {  // numofSeat : Number of seats in the plane

    fun displayInfo(brand: String ) {
        Log.i(TAG, "displayInfoOverloaded: This is a $brand plane!")   // I overload the function displayInfo

    }

    override fun calcETA(distance: Int, avgAirSpeed: Double) {
        if(isCargo == false) {   //  isCargo variable for checking the type of plane, it means this is a passenger plane.
            Log.i(TAG, "calcETA: You're flying with $flightCode from $from to $to it has $numofSeat seats.") // I could concatenate these 2 logs but I didn't do it because it was going to give a long log output.
            Log.i(TAG, "calcETA: Your flight will take ${distance / avgAirSpeed} hours by $aModel. Have a safe flight.")
        }
        else {              // it means cargo plane
            Log.i(TAG, "calcETA: This plane is carrying items from $from to $to" +
                    " and this delivery will arrive ${distance / avgAirSpeed} hours from now on.")

        }
    }

    override fun setModel(b: String) {   // I overrided the setter of a property.
        super.setModel(b)
    }

    companion object {
        const val TAG = "PassengerPlane"
    }
}