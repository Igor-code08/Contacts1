package com.example.contacts1

import androidx.lifecycle.LiveData
import androidx.room.*

@Dao
interface ContactDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insert(contact: Contact)

    @Query("SELECT * FROM contacts ORDER BY id DESC")
    fun getAllContacts(): LiveData<List<Contact>>

    @Delete
    suspend fun delete(contact: Contact)
}