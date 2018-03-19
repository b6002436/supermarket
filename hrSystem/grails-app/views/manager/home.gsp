<!doctype html>
<html>
<head>
    <meta name="layout" content="main"/>
    <title>SuperMarket | HomePage</title>
	<asset:stylesheet src="home.css"/> 
</head>
<body>
    

    <div id="content" role="main">
	<div class="row">

<div class="first"> 
	<h3> Managers </h3> 
<p> This is to show the managers. </p>

	<button type="button" class="btn btn-success">

	<g:link controller="course" action="create"> Add Manager</g:link> 

	</button>

</div> 

<div class="second"> 
	<h3> Team Leaders </h3> 
<p> This is to show the team leaders. </p>

	<button type="button" class="btn btn-success">

	<g:link controller="Manager" action="create"> Add Team Leader</g:link> 

	</button>

</div> 


<div class="first"> 
	<h3> Employee </h3> 
<p> This is to show the employees. </p>

	<button type="button" class="btn btn-success">

	<g:link controller="Employee" action="create"> Add Employee</g:link> 

	</button>

</div> 

<div class="second"> 
	<h3> Team </h3> 
<p> This is to show the team. </p>

	<button type="button" class="btn btn-success">

	<g:link controller="Team" action="create"> Add Team</g:link> 

	</button>

</div> 

<div class="first"> 
	<h3> Task </h3> 
<p> This is to show the Task </p>

	<button type="button" class="btn btn-success">

	<g:link controller="Task" action="create"> Add Task</g:link> 

	</button>

</div> 


<div class="second"> 
	<h3> Shifts </h3> 
<p> This is to show the Shifts. </p>

	<button type="button" class="btn btn-success">

	<g:link controller="Shift" action="create"> Add Shifts</g:link> 

	</button>

</div> 

</div>

</div> 

</body> 

</html>
