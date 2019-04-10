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

def Doctor1 =new Doctor(
	fullName: 'Mandeep Singh',
	qualification: 'Medicine',
	position: 'General Practitioner',
	doctorEmail: 'mandeepsinging@mailhost.com',
	password: 'letmein790',
	doctorOffice: 'room 16',
	doctorPhone: '07743449724',
	bio: 'Lorem ipsum Im a good doctor ipsum lorem.'
).save()

def Doctor2 =new Doctor(
	fullName: 'Norman Hart',
	qualification: 'Medicine',
	position: 'Heart Surgeon',
	doctorEmail: 'normanlovesit@mailhost.com',
	password: 'password12345',
	doctorOffice: 'room 17',
	doctorPhone: '07740654563',
	bio: 'I operate on peoples hearts.'
	).save()

def Nurse1 =new Nurse(
	nurseName: 'Catherine Buckshill',
	qualifications: 'Nursing',
	nurseEmail: 'cattyb123@mailhost.com',
	nurseOffice: 'room 3',
	nursePhone: '07234359543'
	).save()

def Nurse2 =new Nurse(
	nurseName: 'William Hill',
	qualifications: 'Nursing',
	nurseEmail: 'willyhilly@mailhost.com',
	nurseOffice: 'room 3',
	nursePhone: '07742359344'
	).save()

def Prescrip1 =new Prescription(
pharmacyName: 'Chesterfield Road pharmacy',
prescripNumber: 1,
medicine: 'Percocet',
totalCost: 8,
dateIssued: new Date ('26/12/2018'),
patientPaying: 'yes'
).save()

def Prescrip2 =new Prescription(
pharmacyName: 'Baslow Road pharmacy',
prescripNumber: 2,
medicine: 'Prozac',
totalCost: 8,
dateIssued: new Date ('22/8/2018'),
patientPaying: 'yes'
).save()

def Recep1 =new Receptionist(
recepName: 'Johnny Doeson',
recepEmail: 'jonndoesntdo@john.com',
recepUsername: 'johnnyvegas',
recepPassword: 'johnnygoddit',
recepPhone: '077936548372'
).save()

def Recep2 =new Receptionist(
recepName: 'Ariana Smith',
recepEmail: 'coolgirltwirl13@gmail.com',
recepUsername: 'cooldoctor9',
recepPassword: 'ilovejohnny',
recepPhone: '077865263642'
).save()

def Surgery1 =new Surgery(
name: 'Woodseats Surgery',
address: '11 Cobnar Crescent',
postcode: 'S8 APX',
telephone: '0114 2977 871',
numberOfpatients: '60',
description: 'Lorem ipsum',
openingTime: '9:00'
).save()

def Surgery2 =new Surgery(
name: 'Totley Surgery',
address: '11 Baslow Crescent',
postcode: 'S17 BAX',
telephone: '0114 2987 814',
numberOfpatients: '60',
description: 'Lorem ipsum',
openingTime: '9:00'
).save()




    }
    def destroy = {
    }
}
