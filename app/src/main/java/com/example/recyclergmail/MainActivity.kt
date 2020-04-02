package com.example.recyclergmail

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.recyclergmail.model.email
import com.example.recyclergmail.model.fakeEmails
import com.mooveit.library.Fakeit
import kotlinx.android.synthetic.main.activity_main.*
import java.text.SimpleDateFormat
import java.util.*

class MainActivity : AppCompatActivity() {

    private lateinit var adapter: EmailAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Fakeit.init()
        setContentView(R.layout.activity_main)

        adapter = EmailAdapter(fakeEmails())
        recycler_view_main.adapter = adapter
        recycler_view_main.layoutManager = LinearLayoutManager(this)

        floatingActionButton.setOnClickListener {
            addEmail()
            recycler_view_main.scrollToPosition(0)
        }
    }
    private fun addEmail(){
        val fakeDate = SimpleDateFormat("MM/DD/YYYY", Locale("en","us")).parse(
            Fakeit.dateTime().dateFormatter()
        )
        adapter.email.add(0,
            email {
                star = false
                unread = true
                userName = Fakeit.name().firstName()
                emailSubject = Fakeit.company().name()
                date = SimpleDateFormat("d MM",Locale("en","us")).format(fakeDate!!)
                preview = mutableListOf<String>().apply {
                    repeat(10){
                        add(Fakeit.lorem().words())
                    }
                }.joinToString(" ")
            })
        adapter.notifyItemInserted(0)
    }
}
