package com.example.home.demo

import android.content.Context
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.app.AlertDialog
import android.text.Selection.selectAll
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import kotlin.system.exitProcess

/*
 - 2 cai EditText: user name (username, password (******)
 - 2 cai Button: Login, Exit
 - btnLogin: to den het o password
 - btnExit: thoat app

 */
class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        login.setOnClickListener {
            passWordH.setSelectAllOnFocus(true)
            passWordH.selectAll()
            Toast.makeText(this, "Nhap sai roi kia", Toast.LENGTH_LONG).show()
        }
        exit.setOnClickListener {
            val builder = AlertDialog.Builder(this@MainActivity)
            //set title
            builder.setTitle("Exit")
            builder.setMessage("Are you sure?")
            // Set a positive button and its click listener on alert dialog
            builder.setPositiveButton("Yes"){ _, _ ->
                finish()
            }
            builder.setNegativeButton("Cancel"){_,_ ->

            }
            val dialog: AlertDialog = builder.create()
            dialog.show()

        }

    }
}

