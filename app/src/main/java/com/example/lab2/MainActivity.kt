package com.example.lab2

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.lab2.databinding.ActivityMainBinding
import com.example.lab2.model.data
import com.example.lab2.model.RecyclerAdapter
import com.example.lab2.model.ViewHolder
import com.google.android.material.snackbar.Snackbar

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        this.binding.recyclerView.run {
            layoutManager = LinearLayoutManager(this@MainActivity)
            setHasFixedSize(true)
            adapter = RecyclerAdapter(Datas)
        }


        



//        binding = ActivityMainBinding.inflate(layoutInflater)
//        binding.fabAdd.setOnClickListener {
//            val intent = Intent(this, AddItem::class.java)
//            startActivity(intent)
//        }

        val fab: View = findViewById(R.id.fabAdd)
        fab.setOnClickListener {
            val intent = Intent(this@MainActivity, AddItem::class.java)
            startActivity(intent)
        }
    }

//    private fun addInfo() {
//        val inflter = LayoutInflater.from(this)
//        val v = inflter.inflate(R.layout.add_item,null)
//        /**set view*/
//        val name = v.findViewById<EditText>(R.id.edt_name)
//        val singer = v.findViewById<EditText>(R.id.edt_singer)
//
//        val addDialog = AlertDialog.Builder(this)
//
//        addDialog.setView(v)
//        addDialog.setPositiveButton("Ok"){
//                dialog,_->
//            val names = name.text.toString()
//            val singers = singer.text.toString()
//            nameList.add(data("name: $names","singer : $singers"))
//        }
//    }

//    companion object {
//        val Datas = mutableListOf<data>()
//    }

    override fun onResume() {
        super.onResume()
        binding.recyclerView.adapter?.notifyDataSetChanged()
    }

    companion object {
        val Datas = mutableListOf<data>()
    }


}