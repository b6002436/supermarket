<!doctype html>
<html>
<head>
    <meta name="layout" content="main"/>
    <title>SuperMarket TeamLeader | HomePage</title>
	<asset:stylesheet src="home.css"/> 
</head>
<body>
    

    <div id="content" role="main">
	<div class="row">


</div> 

<div class="second"> 
	<h3> Tasks </h3> 
<p> This is to add the Tasks </p>

	<button type="button" class="btn btn-success">

	<g:link controller="Task" action="create"> Add Task</g:link> 

	</button>

</div> 


<div class="first"> 
	<h3> Employee </h3> 
<p> This is to show the employees. </p>

	<button type="button" class="btn btn-success">

	<g:link controller="Employee" action="index"> Show Employees</g:link> 

	</button>

</div> 

<div class="second"> 
	<h3> Team </h3> 
<p> This is to show the team. </p>

	<button type="button" class="btn btn-success">

	<g:link controller="Team" action="index"> Show Team</g:link> 

	</button>

</div> 



<div class="first"> 
	<h3> Tasks </h3> 
<p> This is to show Tasks. </p>

	<button type="button" class="btn btn-success">

	<g:link controller="Task" action="index"> Show Tasks</g:link> 

	</button>

</div> 


<div class="second">

	<h3> Advanced Search Tasks</h3>

	<p>Lorem Ipsum hi hi hi hi hi hi hi hi hi hi hi </p> 

		<button type="button" class="btn btn-success"> 

			<g:link controller="Task" action="advSearchTL">Search</g:link>

		</button>
</div>


<div class="first">
<h3> Tasks as JSON objects (Show action) </h3> 
<p> This is to show Tasks as JSON objects. </p>

	<button type="button" class="btn btn-success">

	<g:link controller="Task" action="show"> Show Tasks</g:link> 

	</button>

</div> 

<div class="second">
<h3> Tasks as JSON objects( Index Action)</h3> 
<p> This is to show Tasks as JSON objects. </p>

	<button type="button" class="btn btn-success">

	<g:link controller="Task" action="index"> Show Tasks</g:link> 

	</button>

	
</div>


</div> 

</div>

</div> 

</body> 

</html>
