package com.example.contacts1

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    private lateinit var viewModel: ContactViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setSupportActionBar(findViewById(R.id.toolbar))
        val lastNameInput = findViewById<EditText>(R.id.lastNameInput)
        val initialsInput = findViewById<EditText>(R.id.initialsInput)
        val phoneNumberInput = findViewById<EditText>(R.id.phoneNumberInput)
        val saveButton = findViewById<Button>(R.id.saveButton)
        val recyclerView = findViewById<RecyclerView>(R.id.recyclerView)

        recyclerView.layoutManager = LinearLayoutManager(this)
    }
}