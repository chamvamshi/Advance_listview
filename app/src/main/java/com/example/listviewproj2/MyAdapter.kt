package com.example.listviewproj2

import android.app.Activity
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.TextView
import de.hdodenhof.circleimageview.CircleImageView

class MyAdapter (val context : Activity, val arrayList:ArrayList<User>):
    ArrayAdapter<User>(context,R.layout.eachitem,arrayList){

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        val inflater = LayoutInflater.from(context)
        val view  = inflater.inflate(R.layout.eachitem,null)

        val image = view.findViewById<CircleImageView>(R.id.profile_image)
        val name= view.findViewById<TextView>(R.id.textname)
        val lastmssg = view.findViewById<TextView>(R.id.textsubmssg)
        val lastseen = view.findViewById<TextView>(R.id.texttime)

        name.text= arrayList[position].name
        lastmssg.text = arrayList[position].lastmssg
        lastseen.text = arrayList[position].lasttime
        image.setImageResource(arrayList[position].imageId)

        return view
    }
}