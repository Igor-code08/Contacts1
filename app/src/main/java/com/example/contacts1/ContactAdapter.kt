package com.example.contacts1

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class ContactAdapter(private val onDeleteClick: (Contact) -> Unit) :
    RecyclerView.Adapter<ContactAdapter.ContactViewHolder>() {

    private var contacts = emptyList<Contact>()

    class ContactViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val lastName: TextView = itemView.findViewById(R.id.lastName)
        val initials: TextView = itemView.findViewById(R.id.initials)
        val phoneNumber: TextView = itemView.findViewById(R.id.phoneNumber)
        val createdAt: TextView = itemView.findViewById(R.id.createdAt)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ContactViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.list_item, parent, false)
        return ContactViewHolder(view)
    }

    override fun onBindViewHolder(holder: ContactViewHolder, position: Int) {
        val contact = contacts[position]
        holder.lastName.text = contact.lastName
        holder.initials.text = contact.initials
        holder.phoneNumber.text = contact.phoneNumber
        holder.createdAt.text = contact.createdAt

        // Удаление контакта по клику на элемент списка
        holder.itemView.setOnClickListener {
            onDeleteClick(contact)
        }
    }

    override fun getItemCount() = contacts.size

    fun setContacts(contacts: List<Contact>) {
        this.contacts = contacts
        notifyDataSetChanged()
    }
}