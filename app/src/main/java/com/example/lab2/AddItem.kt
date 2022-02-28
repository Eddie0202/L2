package com.example.lab2

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity
import com.example.lab2.model.data

class AddItem: AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.add_item)

        val save:Button = findViewById(R.id.btn_save)

        save.setOnClickListener {

            val names:String = findViewById<EditText>(R.id.edt_name).toString()
            val singers:String = findViewById<EditText>(R.id.edt_singer).toString()

            val name = names
            val singer = singers

            val Data = data(name, singer)

            MainActivity.Datas.add(Data)


            finish()
        }


    }

//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//        setContentView(R.layout.add_item)
//        title = "KotlinApp"
//        val button: Button = findViewById(R.id.btn_save)
//        button.setOnClickListener {
//            val i = Intent(this@AddItem, MainActivity::class.java)
//            startActivity(i)
//        }
//    }

}