package com.example.listviewproj2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ListView

class MainActivity : AppCompatActivity() {

   lateinit var userArrayList : ArrayList<User>
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val name = arrayOf("soumya","Arishfakhan","prabhas","ImanGadzhi")

        val lastmssg = arrayOf("Educator","Actor,crush","Pan India Actor","Motivator and enterpenuer")

        val lasttime = arrayOf("7:30pm","12:00am","4:00pm","10:00pm")

        val imgId = intArrayOf(R.drawable.sowmyaedu,R.drawable.arshifacrush,R.drawable.prabhasfan,R.drawable.imanmentor)

        userArrayList = ArrayList()

        for(eachIndex in name.indices){
           val user = User(name[eachIndex],lastmssg[eachIndex], lasttime[eachIndex],imgId[eachIndex])

               userArrayList.add(user)
        }
        val listview  = findViewById<ListView>(R.id.listview)
        listview.isClickable = true
        listview.adapter = MyAdapter(this,userArrayList)

    }


}
