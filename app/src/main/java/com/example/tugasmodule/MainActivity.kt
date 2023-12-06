package com.example.tugasmodule

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    private  lateinit var newRecyclerview : RecyclerView
    private lateinit var newArrayList : ArrayList<Title>
    lateinit var imageId : Array<Int>
    lateinit var heading : Array<String>


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        imageId = arrayOf(
            R.drawable.apaya,
            R.drawable.apaya,
            R.drawable.apaya,
            R.drawable.apaya,
            R.drawable.apaya,
            R.drawable.apaya,
            R.drawable.apaya,
            R.drawable.apaya,
            R.drawable.apaya,
            R.drawable.apaya,
            R.drawable.apaya,
            R.drawable.apaya,
            R.drawable.apaya,
            R.drawable.apaya,
            R.drawable.apaya,

        )

        heading = arrayOf(
            "TES 1",
            "TES 2",
            "TES 3",
            "TES 4",
            "TES 5",
            "TES 6",
            "TES 7",
            "TES 8",
            "TES 9",
            "TES 10",
            "TES 11",
            "TES 12",
            "TES 13",
            "TES 14",
            "TES 15",




        )

        newRecyclerview = findViewById(R.id.recyclerView)
        newRecyclerview.layoutManager = LinearLayoutManager(this)
        newRecyclerview.setHasFixedSize(true)

        newArrayList = arrayListOf<Title>()
        getUserdata()



    }

    private fun getUserdata() {
        for(i in imageId.indices){

            val title = Title(imageId[i],heading[i])

            newArrayList.add(title)
        }

        newRecyclerview.adapter = MyAdapter(newArrayList)

    }
}