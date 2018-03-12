package com.jpszenyczniak

class BootStrap {

    def init = { servletContext ->

	def manager1 = new
	Manager(
		fullName:'Jade Pszenyczniak', 
		usermame:'Manager1',
		password:'password',
		managerEmail:'manager1@manager.com',
		office: 'A0-000',
		department: 'Electronics'
	).save()

	def Manager2 = new
	Manager(
		fullName:'Kyle Davies',
		username:'Manager2',
		password:'password',
		managerEmail:'manager2@manager.com',
		office:'A1-000',
		department:'Computing'
	).save()

	def TeamLeader1 = new
	TeamLeader(	
		fullName:'Emma Smith', 
		department:'Electronics',
		employeeID:'A0000',
		sectionName:'Computers',
		officePhone:'01111111111', 
		leaderEmail:'leader1@leader.com',
		password:'password'
	).save()

	def TeamLeader2 = new
	TeamLeader(
		fullName:'Steve Smith', 
		department:'Clothing',
		employeeID:'A1000',
		sectionName:'Tailor',
		officePhone:'0222222222', 
		leaderEmail:'leader2@leader.com',
		password:'password'
	).save()

	def Employee1 = new
	Employee(
		fullName:'Susan Smith',
		dateOfBirth:'19/04/1998',
		residence:'Chesterfield',
		horlyRate:'7.50',
		employeeID:'A2000',
		dateEmployed:'26/02/2018',
		taxCode:'TX000',
		contract:'Full-Time'
	).save()

	def Employee2 = new
	Employee(
		fullName:'Peter Smith',
		dateOfBirth:'05/09/1955',
		residence:'Chesterfield',
		horlyRate:'7.50',
		employeeID:'A3000',
		dateEmployed:'25/01/2018',
		taxCode:'TX100',
		contract:'Part-Time'
	).save()

	def Team1 = new
	Team (
		teamName:'TeamOne',
		numberOfEmployees:'20',
		sectionName:'Tailor',
		description:'Adjusting Clothes'
	).save()

	def Team2 = new
	Team (
		teamName:'TeamTwo',
		numberOfEmployees:'10',
		sectionName:'Computers',
		description:'IT support'
	).save()

	def Shift1 = new
	Shift(
		timeOfDay:'Morning',
		dayOfWeek:'Tuesday',
		numberOfHours:'6',
		startingTime:'8:00am'
	).save()

	def Shift2 = new
	Shift(
		timeOfDay:'Afternoon',
		dayOfWeek:'Monday',
		numberOfHours:'8',
		startingTime:'7:00am'
	).save()
		
    }
    def destroy = {
    }
}
