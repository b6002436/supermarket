package com.jpszenyczniak

class Employee {
	
	String fullName
	Date dateOfBirth
	String residence
	String horlyRate
	String employeeID
	Date dateEmployed
	String taxCode
	String contract
	String manager
	String teamleader
	String team
	String task
	String shift

    static constraints = {

	fullName nullable:false, blank:false

	dateOfBirth nullable:false, blank:false

	residence nullable:false, blank:false

	horlyRate nullable:false, blank:false, scale:2

	employeeID nullable:false, blank:false

	dateEmployed nullable:false, blank:false

	taxCode nullable:false, blank:false

	contract nullable:false, blank:false

	manager nullable:false, blank:false

	teamleader nullable:false, blank:false

	team nullable:false, blank:false

	task nullable:false, blank:false

	shift nullable:false, blank:false
    }
}
