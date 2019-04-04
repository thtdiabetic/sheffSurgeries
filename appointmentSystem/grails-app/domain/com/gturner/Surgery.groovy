package com.gturner

class Surgery {
String name
String address
String postcode
String telephone
String numberOfpatients
String description
String openingTime

static hasMany= [receptionists:Receptionist, doctors:Doctor, nurses:Nurse, patients:Patient, appointments: Appointment]

    static constraints = {
name nullable: false, blank: false
address nullable: false, blank: false
postcode nullable: false, blank: false
telephone nullable: false, blank: false
numberOfpatients nullable: false, blank: false
description nullable: false, blank: false, maxSize: 5000, widget: 'textarea'
openingTime nullable: false, blank: false
    }
}
