package com.jpszenyczniak

class Shift {

	String timeOfDay
	String dayOfWeek
	int numberOfHours
	String startingTime

	static hasMany=[teams:Team, tasks:Task, employees:Employee]

	static belongsTo=[Task, Team]

	String toString(){
	return timeOfDay
	}

    static constraints = {

	timeOfDay nullable:false, blank:false 
	dayOfWeek nullable:false, blank:false
	numberOfHours nullable:false, blank:false
	startingTime nullable:false, blank:false
	
    }
}
