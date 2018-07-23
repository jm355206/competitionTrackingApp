<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<c:set var="pageTitle" value="Book Reviews" />
<%@include file="common/header.jspf"%>

<h1>Log Game Results</h1>
<c:url var="logResultsUrl" value="/logGame"/>
<form action="${logResultsUrl}" method="POST">
	
	<div>
		<label for="competitorOne">Competitor One</label>
		<select name="competitorOne">
			<c:forEach var="competitorOne" items="${competitors}">{
				<option value="${competitorOne.playerId}"><c:out value = "${competitorOne.firstName} ${competitorOne.lastName}"/></option>
			</c:forEach>
			</select>
		<label for="competitorOneScore">Score</label>
		<input type="text" name="competitorOneScore" />
	</div>
	
	<div>
		<label for="competitorTwo">Competitor Two</label>
		<select name="competitorTwo">
			<c:forEach var="competitorTwo" items="${competitors}">{
				<option value="${competitorTwo.playerId}"><c:out value = "${competitorTwo.firstName} ${competitorTwo.lastName}"/></option>
			</c:forEach>
			</select>
		<label for="competitorTwoScore">Score</label>
		<input type="text" name="competitorTwoScore" />
	</div>
	
	<div>
		<label for="game">Which Game</label> 
		<select name="game">
				<option value="1">Ping-Pong</option>
				<option value="2">Pool</option>
				<option value="3">Darts</option>
				<option value="4">Pop-a-Shot</option>
		</select> 
	</div>
	
	<button type="submit" class="btn btn-primary">Save</button>


</form>



	
<%@include file="common/footer.jspf"%>


<%-- 

<label for="competitorOne>Player One</label>
<select name="competitorOne id="competitorOne">
	<c:forEach var="competitorOne" items="${

		<label for="competitorTwo">Player Two</label>
		<input type="text" name="competitorTwo" />
		<label for="competitorTwoScore">Score</label>
		<input type="text" name="competitorOneScore" />


<c:url var="createUserUrl" value="/createUser"/>
<form action="${createUserUrl}" method="POST">


--%>