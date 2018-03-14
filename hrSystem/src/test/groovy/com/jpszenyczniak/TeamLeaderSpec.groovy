package com.jpszenyczniak

import grails.testing.gorm.DomainUnitTest
import spock.lang.Specification

class TeamLeaderSpec extends Specification implements DomainUnitTest<TeamLeader> {

    def setup() {
    }

    def cleanup() {
    }

      void  validatingEmail() {

	when:"Team Leader is created with fullName and email"
	def teamleader1 = new TeamLeader(fullName:'teamleader1', leaderEmail:'test')
	then: 'Validation should fail'
	!teamleader1.validate()
       
    }
}
