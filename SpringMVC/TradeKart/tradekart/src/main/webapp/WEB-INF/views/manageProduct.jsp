<%@taglib prefix="sf" uri="http://www.springframework.org/tags/form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<div class="container">

	<c:if test="${not empty message}">
		<div class="row">
			<div class="col-xs-12 col-md-offset-2 col-md-8">
				<div class="alert alert-info fade in">${message}</div>
			</div>
		</div>
	</c:if>

	<div class="row">

		<div class="col-md-offset-2 col-md-8">

			<div class="panel panel-primary">

				<div class="panel-heading" style="background-color: #400040">

					<h4>Product Auction Details</h4>

				</div>

				<div class="panel-body">
					<sf:form class="form-horizontal" modelAttribute="product"
						action="${contextRoot}/manage/product" method="POST"
						enctype="multipart/form-data">
						<div class="form-group">
							<label class="control-label col-md-4">Name</label>
							<div class="col-md-8">
								<sf:input type="text" path="name" class="form-control"
									placeholder="Product Name" />
								<sf:errors path="name" cssClass="help-block" element="em" />
							</div>
						</div>

						<div class="form-group">
							<label class="control-label col-md-4">Brand</label>
							<div class="col-md-8">
								<sf:input type="text" path="brand" class="form-control"
									placeholder="Brand Name" />
								<sf:errors path="brand" cssClass="help-block" element="em" />
							</div>
						</div>

						<div class="form-group">
							<label class="control-label col-md-4">Description</label>
							<div class="col-md-8">
								<sf:textarea path="description" class="form-control"
									placeholder="Enter your description here!" />
								<sf:errors path="description" cssClass="help-block" element="em" />
							</div>
						</div>

						<div class="form-group">
							<label class="control-label col-md-4">Unit Price</label>
							<div class="col-md-8">
								<sf:input type="number" path="unitPrice" class="form-control"
									placeholder="Enter Unit Price" />
								<sf:errors path="unitPrice" cssClass="help-block" element="em" />
							</div>
						</div>

						<div class="form-group">
							<label class="control-label col-md-4">Quantity</label>
							<div class="col-md-8">
								<sf:input type="number" path="quantity" class="form-control"
									placeholder="Enter Quantity" />
								<sf:errors path="quantity" cssClass="help-block" element="em" />
							</div>
						</div>


						<div class="form-group">
							<label class="control-label col-md-4">Upload a file</label>
							<div class="col-md-8">
								<sf:input type="file" path="file" class="form-control" />
								<sf:errors path="file" cssClass="help-block" element="em" />
							</div>
						</div>


						<div class="form-group">
							<label class="control-label col-md-4">Category</label>
							<div class="col-md-8">
								<sf:select path="categoryId" items="${categories}"
									itemLabel="name" itemValue="id" class="form-control" />

								<div class="text-right">
									<br />
									<sf:hidden path="id" />
									<sf:hidden path="code" />
									<sf:hidden path="supplierId" />
									<sf:hidden path="active" />
									<button type="button" class="btn btn-warning btn-xs"
										data-toggle="modal" data-target="#myCategoryModal">
										New Deal</button>
								</div>
							</div>

						</div>



						<div class="form-group">

							<div class="col-md-offset-4 col-md-4">

								<input type="submit" name="submit" value="Trade"
									class="btn btn-primary" />

							</div>
						</div>

					</sf:form>

				</div>

			</div>

		</div>

	</div>

	<!-- Modal -->
	<div class="modal fade" id="myCategoryModal" tabindex="-1"
		role="dialog" aria-labelledby="myModalLabel">
		<div class="modal-dialog" role="document">
			<div class="modal-content">
				<div class="modal-header">
					<button type="button" class="close" data-dismiss="modal"
						aria-label="Close">
						<span aria-hidden="true">&times;</span>
					</button>
					<h4 class="modal-title" id="myModalLabel">New Deal</h4>
				</div>
				<div class="modal-body">

					<sf:form id="categoryForm" class="form-horizontal"
						modelAttribute="category" action="${contextRoot}/manage/category"
						method="POST">

						<div class="form-group">
							<label class="control-label col-md-4">Name</label>
							<div class="col-md-8 validate">
								<sf:input type="text" path="name" class="form-control"
									placeholder="Deal" />
							</div>
						</div>

						<div class="form-group">
							<label class="control-label col-md-4">Description</label>
							<div class="col-md-8 validate">
								<sf:textarea path="description" class="form-control"
									placeholder="Enter description here!" />
							</div>
						</div>


						<div class="form-group">
							<div class="col-md-offset-4 col-md-4">
								<input type="submit" name="submit" value="Save"
									class="btn btn-primary" />
							</div>
						</div>
					</sf:form>
				</div>
			</div>
		</div>
	</div>

	<hr />
	<h1>
		<sf:form id="excelForm" class="form-horizontal"
			action="${contextRoot}/manage/export" method="GET">
		Available Products <input type="submit" name="submit"
				value="Export Into Excel" class="btn btn-primary"
				style="float: right;" />
		</sf:form>
	</h1>


	<hr />

	<div class="row">


		<div class='col-xs-12'>


			<table id="productsTable"
				class="table table-condensed table-bordered">

				<thead>
					<tr>
						<th>Id</th>
						<th>&#160;</th>
						<th>Name</th>
						<th>Brand</th>
						<th>Qty. Avail</th>
						<th>Unit Price</th>
						<th>Activate</th>
						<th>Edit</th>
					</tr>
				</thead>

				<tfoot>
					<tr>
						<th></th>
						<th></th>
						<th></th>
						<th></th>
						<th></th>
						<th></th>
						<th></th>
						<th></th>
					</tr>
				</tfoot>


			</table>


		</div>


	</div>

</div>