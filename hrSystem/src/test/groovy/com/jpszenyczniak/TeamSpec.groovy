package com.jpszenyczniak

import grails.testing.gorm.DomainUnitTest
import spock.lang.Specification

class TeamSpec extends Specification implements DomainUnitTest<Team> {

    def setup() {
    }

    def cleanup() {
    }

    void  validatingTeam() {

	when:"Team is created with teamName and number of employees"
	def team1 = new Team(teamName:'Team1', numberOfEmployees:20)
	then: 'Validation should fail'
	team1.validate()
       
    }
}
