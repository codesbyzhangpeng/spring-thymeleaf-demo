# spring-thymeleaf-demo

Syntax using Thymlead template

Code in the employee-list:

<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
<div class="container">

<table class ="table table-bordered table-striped">
	<thead class="thead-dark">
		<tr>
			<th>First Name</th>
			<th>Last Name</th>
			<th>Email</th>
		</tr>
	</thead>
	<tbody>
		<tr th:each="tempEmployee: ${employees}">
			<td th:text="${tempEmployee.firstName}"></td>
			<td th:text="${tempEmployee.lastName}"></td>
			<td th:text="${tempEmployee.email}"></td>
		</tr>
	</tbody>

</table>
</div>

<link rel="stylesheet" th:href="@{css/words.css}"/>

    <p th:text="'hello ' + ${message} + ' !!'" class="funny">Welcome to our grocery store!</p>

