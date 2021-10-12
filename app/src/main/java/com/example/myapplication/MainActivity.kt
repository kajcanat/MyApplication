package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import com.google.gson.GsonBuilder

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        // todo some content
        val gson = GsonBuilder().create()

        val strUtil = StringUtility()
        println(strUtil.getAsString())
        // 2021-10-12 11:21:00.217 17222-17222/com.example.myapplication I/System.out: new str

        // comment right ctrl + /
        // move ctrl + shift arrow
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return super.onOptionsItemSelected(item)
    }
}