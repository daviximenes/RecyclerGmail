package com.example.recyclergmail.model

import android.text.BoringLayout

data class Email (
    val userName: String,
    val emailSubject: String,
    val preview :String,
    val date: String,
    val star:Boolean,
    val unread:Boolean,
    var selected : Boolean = false
)

class EmailBuilder {
    var userName: String = ""
    var emailSubject: String= ""
    var preview :String= ""
    var date: String= ""
    var star:Boolean= false
    var unread:Boolean= false
    var selected : Boolean = false

    fun build(): Email = Email(userName,emailSubject,preview,date,star,unread,false)

}

fun email(block: EmailBuilder.()-> Unit) : Email = EmailBuilder().apply(block).build()

fun fakeEmails() = mutableListOf(
    email {
        userName = "Google"
        emailSubject = "Pipipopopiipi Pipipopopiipi PipipopopiipiPipipopopiipi"
        preview = "Bla bla bla bla bla bla bla bla bla bla"
        date = "19 dez"
        star = true
    },
    email {
        userName = "Facebook"
        emailSubject = "Pipipopopiipi Pipipopopiipi PipipopopiipiPipipopopiipi"
        preview = "Bla bla bla bla bla bla bla bla bla bla"
        date = "19 dez"
        star = false
        unread = true
    },
    email {
        userName = "IBM"
        emailSubject = "Pipipopopiipi Pipipopopiipi PipipopopiipiPipipopopiipi"
        preview = "Bla bla bla bla bla bla bla bla bla bla"
        date = "19 dez"
        star = false
    },
    email {
        userName = "Android"
        emailSubject = "Pipipopopiipi Pipipopopiipi PipipopopiipiPipipopopiipi"
        preview = "Bla bla bla bla bla bla bla bla bla bla"
        date = "19 dez"
        star = true
    },
    email {
        userName = "Apple"
        emailSubject = "Pipipopopiipi Pipipopopiipi PipipopopiipiPipipopopiipi"
        preview = "Bla bla bla bla bla bla bla bla bla bla"
        date = "19 dez"
        star = false
    },
    email {
        userName = "iOs"
        emailSubject = "Pipipopopiipi Pipipopopiipi PipipopopiipiPipipopopiipi"
        preview = "Bla bla bla bla bla bla bla bla bla bla"
        date = "19 dez"
        star = false
    },
    email {
        userName = "Java"
        emailSubject = "Pipipopopiipi Pipipopopiipi PipipopopiipiPipipopopiipi"
        preview = "Bla bla bla bla bla bla bla bla bla bla"
        date = "19 dez"
        star = false
        unread = true

    },email {
        userName = "Kotlin"
        emailSubject = "Pipipopopiipi Pipipopopiipi PipipopopiipiPipipopopiipi"
        preview = "Bla bla bla bla bla bla bla bla bla bla"
        date = "19 dez"
        star = true
        unread = true

    },email {
        userName = "KKKKKKKKKKKKKKKK"
        emailSubject = "Pipipopopiipi Pipipopopiipi PipipopopiipiPipipopopiipi"
        preview = "Bla bla bla bla bla bla bla bla bla bla"
        date = "19 dez"
        star = false
    }



)