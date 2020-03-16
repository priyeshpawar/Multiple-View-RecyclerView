package com.example.mutlipleviewrecyclerview

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    private lateinit var rv_list: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        init();
        setDefault();
    }

    fun init() {
        rv_list = findViewById(R.id.rv_list);
        rv_list.layoutManager = LinearLayoutManager(this);
    }

    fun setDefault() {
        val modelList: ArrayList<Model> = ArrayList()

        modelList.add(Model("https://cdn.pixabay.com/photo/2018/01/14/23/12/nature-3082832__340.jpg"))

        modelList.add(
            Model(
                "https://www.gstatic.com/tv/thumb/persons/67369/67369_v9_bb.jpg",
                "Robert Downey, Jr.",
                "American actor",
                "Robert John Downey Jr. is an American actor, producer, and singer. His career has been characterized by critical and popular success in his youth, followed by a period of substance abuse and legal troubles, before a resurgence of commercial success in middle age."
            )
        )

        modelList.add(Model("https://cdn.pixabay.com/photo/2015/04/23/22/00/tree-736885__340.jpg"))

        modelList.add(
            Model(
                "https://www.gstatic.com/tv/thumb/persons/67369/67369_v9_bb.jpg",
                "Robert Downey, Jr.",
                "American actor",
                "Robert John Downey Jr. is an American actor, producer, and singer. His career has been characterized by critical and popular success in his youth, followed by a period of substance abuse and legal troubles, before a resurgence of commercial success in middle age."
            )
        )

        modelList.add(Model("https://cdn.mos.cms.futurecdn.net/8qsCQQpvEhq4Y8T2czH7qY.jpg"))

        modelList.add(
            Model(
                "https://www.gstatic.com/tv/thumb/persons/67369/67369_v9_bb.jpg",
                "Robert Downey, Jr.",
                "American actor",
                "Robert John Downey Jr. is an American actor, producer, and singer. His career has been characterized by critical and popular success in his youth, followed by a period of substance abuse and legal troubles, before a resurgence of commercial success in middle age."
            )
        )

    }
}
