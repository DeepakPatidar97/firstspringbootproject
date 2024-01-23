
<%@ include file="common/navigation.jspf" %>
<%@ include file="common/header.jspf" %>
<div class="container ">
		<h1>Enter Your Contact Details</h1>
		<form:form method="post" action="add-contacts"
			modelAttribute="contact">
			<div class="mb-3">
				<label for="exampleInputName" class="form-label">Name </label>
				<form:input type="text" class="form-control" path="name"
					id="exampleInputName" aria-describedby="emailHelp"
					required="required" />
				<div id="emailHelp" class="form-text">We'll never share your
					datails with anyone else.</div>
			</div>
			<div class="mb-3">
				<label for="exampleInputNumber" class="form-label">Mobile
					Number </label>
				<form:input type="number" class="form-control" path="mobile"
					id="exampleInputName" required="required" />
				<form:errors path="mobile" cssClass="text-warning" />
			</div>

			<div class="mb-3">
				<label for="exampleInputDate" class="form-label">Date Of
					Birth</label>
				<form:input type="date" class="form-control" path="date"
					id="exampleInputName" required="required" />
			</div>

			
			<form:input type="hidden" class="form-control" path="username"
					/>
			
			<!-- <div class="mb-3">
				<label for="exampleInputNumber" class="form-label">Date of birth </label> <input type="date" class="form-control" name="date"
					id="exampleInputName">
			</div> -->

			<!-- <div class="mb-3 form-check">
				<input type="checkbox" class="form-check-input" id="exampleCheck1">
				<label class="form-check-label" for="exampleCheck1">Check me
					out</label>
			</div> -->
			<input type="submit" class="btn btn-primary" />
			</button>
		</form:form>

	</div>



	<script type="text/javascript">
		$('#date').datepicker({
			format : 'yyyy-mm-dd'
		});
	</script>
<%@ include file="common/footer.jspf" %>