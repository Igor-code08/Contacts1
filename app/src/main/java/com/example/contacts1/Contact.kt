package com.example.contacts1

import androidx.room.Entity
import androidx.room.PrimaryKey
import java.text.SimpleDateFormat
import java.util.Date
import java.util.Locale

@Entity(tableName = "contacts")
data class Contact(
    @PrimaryKey(autoGenerate = true) val id: Int = 0,
    val lastName: String,
    val initials: String,
    val phoneNumber: String,
    val createdAt: String = SimpleDateFormat("dd-MM-yyyy HH:mm", Locale.getDefault()).format(Date())
)