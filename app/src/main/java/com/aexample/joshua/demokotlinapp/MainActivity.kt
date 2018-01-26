package com.aexample.joshua.demokotlinapp

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val javaBook = BookJava("The Mind's i", 780659876585)
        val kotlinBook1 = BookKotlin1("Quantum Gravity",567446464786)
        val kotlinBook2 = BookKotlin2("Quantum Gravity",567446464786)

        javaBookName.text = "Book: ${javaBook.title}"
        javaISBN.text = "ISBN: ${javaBook.isbn}}"
        kotlinName1.text = "Book: ${kotlinBook1.title}"
        kotlinISBN1.text = "ISBN: ${kotlinBook1.isbn}"
        kotlinName2.text = "Book: ${kotlinBook2.title}"
        kotlinISBN2.text = "ISBN: ${kotlinBook2.isbn}"
    }
}
