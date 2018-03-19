package com.jpszenyczniak

class Manager {

	String fullName
	String username
	String password
	String managerEmail
	String office
	String department

	static hasMany=[employees:Employee, teamleaders:TeamLeader]

	String toString(){
	"$fullName, $office, $department"
	}



    static constraints = {

	fullName nullable:false, blank:false

	username nullable:false, blank:false, unique:true

	password nullable:false, blank:false

	managerEmail nullable:false, blank:false, email:true

	office nullable:false, blank:false

	department nullable:false, blank:false

	
    }
}
