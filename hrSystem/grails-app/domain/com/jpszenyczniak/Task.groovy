package com.jpszenyczniak

class Task {

	String taskName
	int numberOfPeople
	String sectionName
	String department
	String timeRequired
	String description
	String taskCompleted

	static hasMany=[shifts:Shift, teams:Team, employees:Employee]

	static belongsTo=[Team, Employee]

	String toString(){
	return taskName
	}

    static constraints = {

	taskName nullable:false, blank:false
	numberOfPeople nullable:false, blank:false 
	sectionName nullable:false, blank:false
	department nullable:false, blank:false
	timeRequired nullable:false, blank:false
	description nullable:false, blank:false, widget:'textarea'
	taskCompleted nullable:false, blank:false
    }
}
