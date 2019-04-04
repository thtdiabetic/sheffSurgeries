package com.gturner

class BootStrap {

    def init = { servletContext ->
//Define objects here
def GeorgeTurner =new Patient(
patientName: 'George Turner',
patientAddress: '11 Woodbank Crescent',
patientResidence: 'Sheffield',
patientDob: new Date ('25/10/1997'),
patientID: '1',
dateRegistered: new Date ('25/11/2016'),
patientPhone: '07723439724'
).save()

def AliceWilde =new Patient(
patientName: 'Alice Wilde',
patientAddress: '11 Colver Road',
patientResidence: 'Sheffield/Stockton',
patientDob: new Date ('26/11/1998'),
patientID: '2',
dateRegistered: new Date ('25/10/2016'),
patientPhone: '07723439725'
).save()

def Appointment1 =new Appointment(
appDate: new Date ('08/08/2019'),
appTime: '15:00',
appDuration: '15',
roomNumber: '6'
).save()

def Appointment2 =new Appointment(
appDate: new Date ('09/09/2019'),
appTime: '14:00',
appDuration: '15',
roomNumber: '5'
).save()




    }
    def destroy = {
    }
}
