package com.jpszenyczniak

class Shift {

	String timeOfDay
	String dayOfWeek
	int numberOfHours
	String startingTime
	String team
	String employee
	String task

    static constraints = {

	timeOfDay nullable:false, blank:false 
	dayOfWeek nullable:false, blank:false
	numberOfHours nullable:false, blank:false
	startingTime nullable:false, blank:false
	team nullable:false, blank:false
	employee nullable:false, blank:false
	task nullable:false, blanl:false
	
    }
}
