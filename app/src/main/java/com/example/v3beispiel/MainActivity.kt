package com.example.v3beispiel

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity : AppCompatActivity() {

    companion object{
        val INT_VALUE="ein Integer Wert"
        val STRING_VALUE="ein String"
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun onClick(view: View) {
        var impIntent = Intent(Intent.ACTION_VIEW, Uri.parse("https://www.tu-freiberg.de/"))
        startActivity(impIntent);
        /*var intent= Intent(this@MainActivity,Main2Activity::class.java)

        intent.putExtra(INT_VALUE,1000)
        intent.putExtra(STRING_VALUE,"greetings")
        startActivity(intent)*/

    }
}
