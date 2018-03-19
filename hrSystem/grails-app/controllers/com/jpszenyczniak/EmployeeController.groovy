package com.jpszenyczniak

class EmployeeController {

    def scaffold = Employee

def search(){

}

def results(String fullName){

	def employees=Employee.where{

		fullName=~fullName

	}.list()

return[employees:employees, 
	term:params.name, 
	totalEmployees: Employee.count()]
}
def advSearch(){ 
}

def advResults(){ 

def employeeProps = Employee.metaClass.properties*.name

def employees = Employee.withCriteria{ 

	"${params.queryType}"{ 

params.each{field, value-> 

if(employeeProps.grep(field)&&value){
ilike(field,value) 

}

}

}

}

return [employees: employees]

}

}

