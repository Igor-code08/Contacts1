package com.example.contacts1

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.launch

class ContactViewModel(application: Application) : AndroidViewModel(application) {
    private val contactDao = ContactDatabase.getDatabase(application).contactDao()
    val allContacts: LiveData<List<Contact>> = contactDao.getAllContacts()

    fun insert(contact: Contact) {
        viewModelScope.launch {
            contactDao.insert(contact)
        }
    }

    fun delete(contact: Contact) {
        viewModelScope.launch {
            contactDao.delete(contact)
        }
    }
}
