var app = angular.module('CustomerApp', []);

app.controller('CustomerController', function($scope, $http) {
	console.log('CustomerController....');
	$scope.customers = [];
	$scope.customer = {};
	$http({
		url : '/api/customers/all',
		method : 'get',
		header : 'application/json'
	}).success(function(response) {
		//console.log(response);
		$scope.customers = response;
	});

	$scope.save = function() {
		$http({
			url : '/api/customers/save',
			method : 'post',
			header : 'application/json',
			data : {
				id : $scope.customer.id,
				firstname : $scope.customer.firstname,
				lastname : $scope.customer.lastname,
				city : $scope.customer.city
			}
		}).success(function(response) {
			console.log(response);
			alert('Customer information have been saved.');
			$scope.customer = {};
		});
	}

	$scope.edit = function(customer) {
		$scope.showFlag = true;
		$scope.editCustomer = angular.copy(customer);
	}

	$scope.editSaveCustomer = function() {
		$http({
			url : '/api/customers/save',
			method : 'post',
			header : 'application/json',
			data : {
				id : $scope.editCustomer.id,
				firstname : $scope.editCustomer.firstname,
				lastname : $scope.editCustomer.lastname,
				city : $scope.editCustomer.city
			}
		}).success(function(response) {
			console.log(response);
			var index;
			for(i = 0; i < $scope.customers.length; i++) {
				if($scope.customers[i].id == response.id) {
					index = i;
				}
			}
			$scope.customers.splice(index, 1);
			$scope.customers.splice(index, 0, response);
			$scope.showFlag = false;
		});
	}

	$scope.delete = function(customer) {
		var index = $scope.customers.indexOf(customer);
		if(confirm('Do you want to remove the Customer ' + 
			       customer.firstname + ' ' + customer.lastname + ' ?')) {
			$http({
				url : '/api/customers/delete',
				method : 'post',
				header : 'application/json',
				data : {
					id : customer.id,
					firstname : customer.firstname,
					lastname : customer.lastname,
					city : customer.city
				}
			}).success(function(response) {
				console.log(response);
				$scope.customers.splice(index, 1);
			});
		}
	}
});
