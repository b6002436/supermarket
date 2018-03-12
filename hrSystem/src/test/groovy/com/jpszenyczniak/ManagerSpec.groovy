package com.jpszenyczniak

import grails.testing.gorm.DomainUnitTest
import spock.lang.Specification

class ManagerSpec extends Specification implements DomainUnitTest<Manager> {

    def setup() {
    }

    def cleanup() {
    }

    void mergeData() {

when:" A manager has fullname, office, department."

	def janet = new
	Manager (
	fullName:'Janet Smith',
	office:'A3-000',
	department:'Grocery'
	)
then:" the toString method will merge them." 

janet.toString()=='Janet Smith, A3-000, Grocery'
       
    }
}
