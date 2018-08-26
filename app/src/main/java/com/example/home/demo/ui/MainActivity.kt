package com.example.home.demo.ui

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.app.AlertDialog
import android.widget.Toast
import com.example.home.demo.R
import com.example.home.demo.util.toast
import kotlinx.android.synthetic.main.activity_main.*

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
            toast("Nhap sai roi kia")
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

