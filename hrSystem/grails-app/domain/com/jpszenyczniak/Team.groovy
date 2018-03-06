package com.jpszenyczniak

class Team {
	
	String teamName
	int numberOfEmployees
	String sectionName
	String description
	String shift
	TeamLeader teamLeader
	String employee
	String task

	static hasMany=[tasks:Task, employees:Employee]

	static belongsTo=[Shift]

    static constraints = {

	teamName nullable:false, blank:false
	numberOfEmployees nullable:false, blank:false, max:90
	sectionName nullable:false, blank:false
	description nullable:false, blank:false, widget:'textarea'
	shift nullable:false, blank:false
	teamLeader nullable:false, blank:false
	employee nullable:false, blank:false
	task nullable:true, blank:true
	
    }
}
