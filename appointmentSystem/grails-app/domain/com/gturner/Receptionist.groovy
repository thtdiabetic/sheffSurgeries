package com.gturner

class Receptionist {
String recepName
String recepEmail
String recepUsername
String recepPassword
String recepPhone

static belongsTo =[Surgery]

    static constraints = {
recepName nullable: false, blank: false
recepEmail nullable: false, blank: false
recepUsername nullable: false, blank: false
recepPassword nullable: false, blank: false
recepPhone nullable: false, blank: false
    }
}
