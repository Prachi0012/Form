package com.example.form

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class RecyclerView : AppCompatActivity() {

    lateinit var rcv:RecyclerView
    var list :ArrayList<String> = ArrayList()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_recycler_view)
        initview()
    }

    private fun initview() {



    }
}