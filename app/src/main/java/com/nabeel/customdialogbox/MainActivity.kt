package com.nabeel.customdialogbox

import android.app.Dialog
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.*
import androidx.appcompat.app.AlertDialog
import java.util.jar.Attributes

class MainActivity : AppCompatActivity() {
    lateinit var tvName: TextView
    lateinit var tvEmail:TextView
    lateinit var btnLogin:Button
    lateinit var btnok: Button
    lateinit var rg: Button
    lateinit var rb1: Button
    lateinit var rb2: Button
    lateinit var rb3: Button

    lateinit var AlertDialog:AlertDialog
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        tvName = findViewById(R.id.tvName)
        tvEmail = findViewById(R.id.tvEmail)
        btnLogin = findViewById(R.id.login)
        rg = findViewById(R.id.radioGroup)
        rb1 = findViewById(R.id.rb1)
        rb2= findViewById(R.id.rb2)
        rb3 = findViewById(R.id.rb3)



            btnLogin.setOnClickListener {
                val dialog = Dialog(this)
                dialog.setCancelable(false)
                dialog.setContentView(R.layout.login_dialog)
                var etName: EditText? = null
                var etEmail: EditText? = null

                etName = dialog.findViewById(R.id.etName)
                etEmail = dialog.findViewById(R.id.etEmail)


                dialog.show()

                val btnok = dialog.findViewById(R.id.btnok) as Button
                btnok.setOnClickListener {
                    tvName.setText(etName.getText().toString())
                    tvEmail.setText(etEmail.getText().toString())

                    fun onRadioButtonClicked(view: View){
                       if (view is RadioButton){
                           val checked = view.isChecked

                           when(view.getId()){
                               R.id.rb1-->
                                       if  (checked){
                                       }
                               R.id.rb2-->
                                       if(checked){
                           }
                               R.id.rb3-->
                                       if (checked){

                    dialog.dismiss()
                }
                           }

            }

                    }
                }
            }
    }
}


