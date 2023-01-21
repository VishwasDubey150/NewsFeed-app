package com.example.newsfeed

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity(),NewsItemClicked {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var rv=findViewById<RecyclerView>(R.id.rv)
        rv.layoutManager=LinearLayoutManager(this)
        val items=fetchData()
        val adapter:newslistAdapter= newslistAdapter(items,this)
        rv.adapter=adapter
    }

    private fun fetchData(): ArrayList<String> {
        val list=ArrayList<String>()
        for (i in 0 until 100)
        {
            list.add("Item $i")
        }
    return list
    }

    override fun onItemClicked(item:String)
    {
        Toast.makeText(this,"clicked item is $item",Toast.LENGTH_SHORT).show()
    }
}