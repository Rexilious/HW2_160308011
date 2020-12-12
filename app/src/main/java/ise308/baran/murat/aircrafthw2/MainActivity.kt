package ise308.baran.murat.aircrafthw2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        displayOutputs() // this is the function which is displaying the outputs I have made. I just wanted to make the code looking tidy.
    }

    private fun displayOutputs() {
        var Boeing777 = PassengerPlane("Boeing","777-300ER",500.0,550,false,"Ankara","İzmir","TK2020")
        var A380F = PassengerPlane("Airbus","A380F",500.0,5,true,"Ankara","İzmir","TK1919")


        Boeing777.displayInfo()   // normal display info
        Boeing777.displayInfo("BOEING");  // overloaded version of displayInfo function this line will create Aircraft tag log message.

        Boeing777.calcETA(590,500.0);
        A380F.calcETA(590,500.0)

        var F16 = FighterJet("General Dynamics","F-16",2000.0, 2175.0,12190)
        F16.calcETA(590,2000.0);

        var T129 = Helicopter("TUSAŞ", "T-129 ATAK", 269.0, "Attacking")
        T129.displayInfo();

    }
}