package com.jpszenyczniak

class TeamLeaderController {

    def scaffold = TeamLeader

def loginTL(){


}

def validate(){

def user = TeamLeader.findByLeaderEmail(params.leaderEmail)

if(user && user.password == params.password){

	session.user = user 

	render view:'home'

}

else {

	flash.message="Invalid email and password"
	
	render view:'loginTL'
}

}

def logout = { 

	session.user = null 

	redirect(uri:'/')

}
}

