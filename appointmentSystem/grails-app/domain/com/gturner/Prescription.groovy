package com.gturner

class Prescription {
String pharmacyName
int prescripNumber
String medicine
int totalCost
Date dateIssued
boolean patientPaying

static belongsTo =[Patient]

    static constraints = {
pharmacyName nullable: false, blank: false
prescripNumber nullable: false, blank: false
medicine nullable: false, blank: false
totalCost nullable: false, blank: false
dateIssued nullable: false, blank: false
patientPaying nullable: false, blank: false
    }
}
