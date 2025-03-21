package com.example.myapplication

import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.RadioGroup
import android.widget.SeekBar
import android.widget.SeekBar.OnSeekBarChangeListener
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import com.example.myapplication.model.Client
import com.example.myapplication.model.Gender

private const val TAG = "AddClientActivity"
class AddClientActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_add_client)

        // Add your code here
        val editText = findViewById<EditText>(R.id.last_name)
        val editText2 = findViewById<EditText>(R.id.first_name)
        val genderRadioGroup = findViewById<RadioGroup>(R.id.client_gender_radiogroup)
        val button= findViewById<Button>(R.id.add_button_client)
        val AgeTextView = findViewById<TextView>(R.id.client_age_textview)
        val SeekBarAge = findViewById<SeekBar>(R.id.client_age_seekbar)


        button.setOnClickListener {
            val lastname = editText.text.toString()
            Log.i("EPF","Nom :$lastname Prenom :${editText2.text} \n")
            var Gender=if (genderRadioGroup.checkedRadioButtonId==R.id.add_client_gender_man_radiobutton)
                Gender.MAN
            else
                Gender.WOMAN
            Log.i("EPF","Genre :$Gender")
            val client = Client(lastname.toString(),"", Gender)
            Log.i( "EPF", "client : ${client}")
            finish()
            Toast.makeText(this, R.string.Toast_Ajoute, Toast.LENGTH_SHORT).show()
        }
        SeekBarAge.setOnSeekBarChangeListener(object: OnSeekBarChangeListener {
            override fun onProgressChanged(seekBar: SeekBar, progress: Int, fromUser: Boolean) {
                AgeTextView.text = progress.toString()
            }
            override fun onStartTrackingTouch(seekBar: SeekBar) {

            }
            override fun onStopTrackingTouch(seekBar: SeekBar) {

            }
        })


    }
}