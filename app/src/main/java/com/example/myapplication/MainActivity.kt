package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.MenuItem
import android.widget.Toast
import com.google.gson.GsonBuilder

const val TAG = "my_log_tag"

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
        // ctrl + d
        println("Duplication")
        println("Duplication")
        println("Duplication")

        // shift + f6
        val newVar = "this is a string"
        println(newVar)

        saySth()

        Toast.makeText(this, "new msg", Toast.LENGTH_SHORT).show()

        Log.i(TAG, "onCreate: a custom msg")
        // 2021-10-12 11:52:41.332 19560-19560/com.example.myapplication I/my_log_tag: onCreate: a custom msg
    }

    private fun saySth() {
        println("Sth")
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return super.onOptionsItemSelected(item)
    }


}