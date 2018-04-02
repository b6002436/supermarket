package com.jpszenyczniak

import grails.converters.*

class TaskController {

static allowedMethods = [index: "GET", show:"GET"]

    def scaffold = Task

def advSearchTL(){ 
}

def advResultsTL(){ 

def taskProps = Task.metaClass.properties*.name

def tasks = Task.withCriteria{ 

	"${params.queryType}"{ 

params.each{field, value-> 

if(taskProps.grep(field)&&value){
ilike(field,value) 
}

}

}

}

return [tasks: tasks]

}

def show(Task task)
	{

		if(params.id && Task.exists(params.id)){

		render Task.findByTaskName(params.id) as XML
	}

	else{

		render Task.list() as XML


	}
	}
	}
