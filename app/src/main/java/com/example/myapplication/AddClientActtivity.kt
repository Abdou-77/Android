package com.example.myapplication

import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.RadioGroup
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

private const val TAG = "AddClientActtivity"
class AddClientActtivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_add_client)

        // Add your code here
        val editText = findViewById<EditText>(R.id.last_name)
        val editText2 = findViewById<EditText>(R.id.first_name)
        val genderRadioGroup = findViewById<RadioGroup>(R.id.client_gender_radiogroup)

        val button= findViewById<Button>(R.id.add_button_client)
        button.setOnClickListener {
            Log.i("EPF","Nom :${editText.text} Prénom :${editText2.text} \n")
            var gender=if (genderRadioGroup.checkedRadioButtonId==R.id.add_client_gender_man_radiobutton)
                "Homme"
            else
                "Femme"
            Log.i("EPF","Genre :$gender")
            

        }

    }
}