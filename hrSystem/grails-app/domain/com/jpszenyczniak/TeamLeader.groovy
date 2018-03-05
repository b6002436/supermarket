package com.jpszenyczniak

class TeamLeader {

	String fullName
	String department
	String employeeID
	String sectionName
	int officePhone
	String leaderEmail
	String password
	String manager
	String team
	String employee

    static constraints = {

	fullName nullable:false, blank:false

	department nullable:false, blank:false

	employeeID nullable:false, blank:false, unique:true

	sectionName nullable:false, blank:false

	officePhone nullable:false, blank:false

	leaderEmail nullable:false, blank:false, email:true

	password nullable:false, blank:false

	manager nullable:false, blank:false

	team nullable:false, blank:false

	employee nullable:false, blank:false
    }
}
