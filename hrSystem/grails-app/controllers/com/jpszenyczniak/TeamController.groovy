package com.jpszenyczniak

import grails.converters.*

class TeamController {

static allowedMethods = [index: "GET", show:"GET"]

    def scaffold = Team

def show(Team team)
	{

		if(params.id && Team.exists(params.id)){

		render Team.findByTeamName(params.id) as XML
	}

	else{

		render Team.list() as XML


	}
	}
	}

