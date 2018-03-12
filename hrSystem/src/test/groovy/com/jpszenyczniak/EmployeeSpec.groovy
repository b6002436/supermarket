package com.jpszenyczniak

import grails.testing.gorm.DomainUnitTest
import spock.lang.Specification

class EmployeeSpec extends Specification implements DomainUnitTest<Employee> {

    def setup() {
    }

    def cleanup() {
    }

    void horlyRate() {

	when: "A Employee has fullName and horlyRate"
	def employee= new Employee(fullName:'Test1', horlyRate:7)
	then:"The calculatehorlyRate method will total fees"
	employee.calculatehorlyRate()==140
       
    }
}
