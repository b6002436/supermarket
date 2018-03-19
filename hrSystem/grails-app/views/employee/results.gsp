<!doctype html>
<html>
<head>
    <meta name="layout" content="main"/>
    <title> Employees | Simple Search</title>
	<asset:stylesheet src="home.css"/>
</head>
<body>

<div class="row"> 
	<h1>Employees</h1> 
	<h3> Search Results</h3> 

<p> 
	Searched${totalEmployees} records 
	for items matching <em>${term}</em> 
	Found <strong>${employees.size()}</strong> employees.

</p>

<ul> 

	<g:each var="employee" in="${employees}"> 

	<li><g:link controller="employee" action="show" 
	id="${employee.ID}">${employee.fullName}</g:link></li> 

	</g:each> 

</ul> 

	<button type="button" class="btn btn-success"> 

	<g:link action='search'>Search Again</g:link> 

</button> 

</div> 

</body>

</html>
