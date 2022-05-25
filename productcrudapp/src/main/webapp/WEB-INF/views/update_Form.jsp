<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<%@include file="./base.jsp"%>
</head>
<body>
	<div class="container mt-3">
		<div class="row">
			<div class="col-md-6 offset-md-3">
				<h1 class="text-center mb-3">Change Product Details</h1>

				<form action="${pageContext.request.contextPath}/handle-product" method="post">
				<div>
				<input type="hidden" name="id" value="${product.id }">
				
				</div>
					<div class="form-group">
						<label for="name">Product Name</label><input type="text"
							class="form-control" id="name" aria-described-by="emailHelp"
							name="name" value="${product.name }" placeholder="Enter the Product name here">
					</div>

					<div class="form-group">
						<label for="description">Product Description</label>
						<textarea  class="form-control" id="description" name="descriptions" 
							aria-described-by="emailHelp"  rows="5"
							placeholder="Enter the Product description here">${product.description }</textarea>
					</div>

					<div class="form-group">
						<label for="price">Product Price</label><input type="text"
							class="form-control" id="price" value="${product.price }" aria-described-by="emailHelp"
							name="price" placeholder="Enter the Product price here">
					</div>

					<div class="container" class="text-center">
						<a href="${pageContext.request.contextPath }/"
							class="btn btn-outline-danger">Back</a>
						<button type="submit" class="btn btn-warning">Update</button>



					</div>




				</form>

			</div>

		</div>

	</div>
</body>
</html>