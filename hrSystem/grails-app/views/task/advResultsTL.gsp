<!doctype html>
<html>
<head>
    <meta name="layout" content="main"/>
    <title> Supermarket | Advanced Search</title>
	<asset:stylesheet src="home.css"/>
</head>
<body>

<div class="row">

	<h1>Tasks</h1>

<h3> Advanced Results</h3> 

<p> Searched

	for tasks matching <em>${term}</em>.

	Found <strong>${tasks.size()}</strong>tasks.
</p>

<ul> 

	<g:each var="task" in="${tasks}"> 

	<li><g:link controller="task" action="show"
	id="${task.id}">${task.taskName}</g:link></li> 

	</g:each>
</ul>

<g:link action='advSearchTL'>Search Again</g:link> 

</div> 

</body> 

</html> 
