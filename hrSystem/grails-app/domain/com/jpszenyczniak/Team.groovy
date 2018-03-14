package com.jpszenyczniak

class Team {
	
	String teamName
	int numberOfEmployees
	String sectionName
	String description
	TeamLeader teamLeader

	static hasMany=[tasks:Task, employees:Employee]

	static belongsTo=[Shift]

    static constraints = {

	teamName nullable:false, blank:false
	numberOfEmployees nullable:false, blank:false, max:90, min:5
	sectionName nullable:false, blank:false
	description nullable:false, blank:false, widget:'textarea'
	teamLeader nullable:false, blank:false
	
    }
}
