package com.example.my_contact_list_app
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.ContactsContract.Contacts
import android.view.LayoutInflater
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.contactsapp.R

//import com.example.contactsapp.databinding.ActivityMainBinding
//import com.example.my_contact_list_app.databinding.ActivityMainBinding
class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        binding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.toString())
    }

    private fun setContentView(root: Any) {
        TODO("Not yet implemented")
    }

    override fun onResume(){
        super.onResume()
        displayContacts("Leila", "078837383", "leila@gmail.com", "")
    }
    fun displayContacts(s: String, s1: String, s2: String, s3: String) {
        var name1=displayContacts("angela","078837383","angela@gmail.com","")
        var name2 =displayContacts(" ken  ","0746833030","ken@gmail.com","")
        var name3=displayContacts(" Ckthy ","07354674788","ckthy@gmail.com","")
        var name4=displayContacts("  Cynthia","0715634748","mumbuacynthia@g.com","")
        var name7 =displayContacts("ahj ","074657589","ahj@gmail.com","")
        var names = listOf(name1,name2,name3,name4,name7)
//        val contactAdapter= Contacts(listOf(names))
//        binding.rvname.layoutManager =LinearLayoutManager(this)
//        binding.rvContact.adapter= contactAdapter
    }

//    private fun listOf(names: List<Unit>): Any {
//
//    }
//
//    private fun listOf(element: List<Unit>): List<List<Unit>> {
//
//    }
//
//    private fun listOf(element: List<Unit>): List<List<Unit>> {
//
//    }
//}
//
//class ActivityMainBinding {
//    val root: Any
//
//    companion object {
//        fun inflate(layoutInflater: LayoutInflater): ActivityMainBinding {
//
//        }
//    }

}

class ActivityMainBinding {
    companion object {
        fun inflate(layoutInflater: LayoutInflater): ActivityMainBinding {
            TODO("Not yet implemented")
        }
    }

}




















