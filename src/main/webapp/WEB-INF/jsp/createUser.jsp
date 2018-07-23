<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<c:set var="pageTitle" value="Book Reviews" />
<%@include file="common/header.jspf"%>

<h2 style="text-align: center">Create a New User</h2>

<c:url var="createUserUrl" value="/createUser"/>
<form action="${createUserUrl}" method="POST">
	<div class="form-group">
		<label for="firstName">First Name</label>
		<input type="text" name="firstName" class="form-control"/>
	</div>
	<div class="form-group">
		<label for="lastName">Last Name</label>
		<input type="text" name="lastName" class="form-control"/>
	</div>

	<button type="submit" class="btn btn-primary">Save</button>
</form>
	
<%@include file="common/footer.jspf"%>