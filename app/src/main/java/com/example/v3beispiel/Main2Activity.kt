package com.example.v3beispiel

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast

class Main2Activity : AppCompatActivity() {
    companion object{
        val INT_VALUE="ein Integer Wert"
        val STRING_VALUE="ein String"
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        var intent= getIntent()
        val intWert=intent.getIntExtra(INT_VALUE,0)//default 0
        var stringWert=intent.getStringExtra(STRING_VALUE)
        Toast.makeText(this,"$intWert $stringWert", Toast.LENGTH_SHORT).show()
    }
}
