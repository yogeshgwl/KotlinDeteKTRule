package com.example.detektexample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }

    fun add(a: Int, b: Int, c: Int, d: Int, e: Int, f: Int) {
        val sum = a + b + c + d + e
    }
    fun add2( c: Int, d: Int, e: Int, f: Int) {
        val sum =  c + d + e
    }

    fun add3(b: Int, c: Int, d: Int, e: Int, f: Int) {
        val sum =  b + c + d + e
    }

    fun subtract(a: Int, b: Int, c: Int, d: Int, e: Int, f: Int) {
        val sum = a - b - c - d - e
    }

    fun subtract2(a: Int, b: Int, c: Int, d: Int, e: Int, f: Int) {
        val sum = a - b - c - d - e
    }

    fun subtract3(a: Int, b: Int, c: Int, d: Int, e: Int, f: Int) {
        val sum = a - b - c - d - e
    }
}
