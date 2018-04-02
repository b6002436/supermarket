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

def index(Task task) 

{ 
render Task.list()as JSON
} 

def show(Task task)
	{

		if(params.id && Task.exists(params.id)){

		render Task.findById(params.id) as JSON
	}

	else{

		render Task.list() as JSON


	}
	}
	}
