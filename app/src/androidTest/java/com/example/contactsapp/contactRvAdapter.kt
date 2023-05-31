//package com.example.my_contact_list_app
//import android.provider.ContactsContract.Contacts
//import android.view.LayoutInflater
//import android.view.ViewGroup
//import androidx.recyclerview.widget.RecyclerView
//import androidx.recyclerview.widget.RecyclerView.ViewHolder
//
//private val ContactsContract.Contacts.phonenumber: Any
//    get() {}
//private val LayoutInflater.tvphonenumber: Any
//    get() {}
//private val LayoutInflater.tvemail: Any
//    get() {
//        TODO("Not yet implemented")
//    }
//private val LayoutInflater.tvimg: Any
//    get() {
//        TODO("Not yet implemented")
//    }
//
////import com.example.contactsapp.databinding.ContactListItemBinding
////import com.example.my_contact_list_app.databinding.ContactListItemBinding
//class ContactsRvAdapter(var contactData: List<Contacts>):RecyclerView.Adapter<ContactsRvAdapter.ContactsViewHolder>(){
//    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ContactsViewHolder {
//        val binding =ContactsViewHolder(LayoutInflater.from(parent.context),parent,false)
//        return ContactsViewHolder(binding, parent, false)
//    }
//    override fun onBindViewHolder(holder: ContactsViewHolder, position: Int) {
//        val currentContact = contactData.get(position)
//        val binding=holder.binding
//        binding.tvimg.text=currentContact.toString()
//        binding.tvemail.toString()=currentContact.email
//        binding.tvname=currentContact.name
//        binding.tvphonenumber.text =currentContact.phonenumber
//    }
//    override fun getItemCount(): Int {
//        return  contactData.size
//    }
//    class ContactsViewHolder(var binding: LayoutInflater, parent: ViewGroup, b: Boolean): ViewHolder(binding.root)
//}
//
//class ContactListItemBinding {
//
//}











