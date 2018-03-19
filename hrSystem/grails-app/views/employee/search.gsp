<!doctype html>
<html>
<head>
    <meta name="layout" content="main"/>
    <title> Emplpoyees | Simple Search</title>
	<asset:stylesheet src="home.css"/>
</head>
<body>
	<div class="row"> 

	<h1>Employees</h1> 

<formset> 
	<legend>Search for Employees(Simple)</legend> 

	<g:form action="results"> 


	<label for="fullName">Employee Name</label> 

	<g:textField fullName="fullName"/> 

	<g:submitButton fullName="search" value="Search"/> 

	</g:form>

</formset>

</div> 
</body>
</html> 
