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
	<h3> Shifts </h3> 
<p> This is to show the Shifts. </p>

	<button type="button" class="btn btn-success">

	<g:link controller="Shift" action="create"> Add Shifts</g:link> 

	</button>




<div class="second">

	<h3> Advanced Search Employees</h3>

	<p>Lorem Ipsum hi hi hi hi hi hi hi hi hi hi hi </p> 

		<button type="button" class="btn btn-success"> 

			<g:link controller="Employee" action="advSearch">Search</g:link>

		</button>



</div>


</div> 

</div>

</div> 

</body> 

</html>
