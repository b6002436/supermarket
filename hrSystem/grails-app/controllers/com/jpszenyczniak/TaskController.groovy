package com.jpszenyczniak

class TaskController {

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

}
