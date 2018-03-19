<!doctype html>
<html>
<head>
    <meta name="layout" content="main"/>
    <title> Supermarket | Advanced Search</title>
	<asset:stylesheet src="home.css"/>
</head>
<body>

<div class="row">

	<h1>Employees</h1>

<h3> Advanced Results</h3> 

<p> Searched

	for employees matching <em>${term}</em>.

	Found <strong>${employees.size()}</strong>employees.
</p>

<ul> 

	<g:each var="employee" in="${employees}"> 

	<li><g:link controller="employee" action="show"
	id="${employee.id}">${employee.fullName}</g:link></li> 

	</g:each>
</ul>

<g:link action='advSearch'>Search Again</g:link> 

</div> 

</body> 

</html> 
