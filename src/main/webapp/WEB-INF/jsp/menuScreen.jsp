<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<c:set var="pageTitle" value="Book Reviews" />
<%@include file="common/header.jspf"%>

<c:url var="logGameUrl" value="/logGame"/>

<h1 style="text-align: center">Who's the Best?</h1>
<form action="${logGameUrl}" method="GET">
<button type="submit" class="btn btn-success btn-lg btn-block">Create a New Game</button>
</form>
<br>
<br>
<c:url var="createUserUrl" value="/createUser"/>
<form action="${createUserUrl}" method="GET">
<button type="submit" class="btn btn-success btn-lg btn-block">Create a new user login </button>
</form>
<br>
<br>
<form action="${viewReportsUrl}" method="GET">
<button type="submit" class="btn btn-success btn-lg btn-block">View Reports</button>
</form>
	
<%@include file="common/footer.jspf"%>