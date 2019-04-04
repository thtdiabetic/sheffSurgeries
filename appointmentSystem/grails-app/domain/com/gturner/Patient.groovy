package com.gturner

class Patient {
String patientName
String patientAddress
String patientResidence
String patientDob
String patientID
String dateRegistered
String patientPhone

static hasMany =[doctors:Doctor, surgerys:Surgery]

    static constraints = {
patientName nullable: false, blank: false
patientAddress nullable: false, blank: false
patientResidence nullable: false, blank: false
patientDob nullable: false, blank: false
patientID nullable: false, blank: false, unique: true
dateRegistered nullable: false, blank: false
patientPhone nullable: false, blank: false
    }
}
