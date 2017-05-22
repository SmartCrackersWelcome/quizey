'use strict';

// Controller when the main page/view loads

angular.module('userApp').controller("SpaCtrl", [ '$scope', function($scope) {

} ]);

// Controller for All Users View

angular.module('userApp').controller(
		"UsersCtrl",
		[ '$scope', 'userservice', '$route', '$routeParams', '$location',
				function($scope, userservice, $route, $routeParams, $location) {

					userservice.getUsers($scope);

				} ]);

// Controller for New User View

angular.module('userApp').controller(
		"NewUserCtrl",
		[ '$scope', 'userservice', '$route', '$routeParams', '$location',
				function($scope, userservice, $route, $routeParams, $location) {

					console.log("new controller started. rout: "+$route+" routeParam: "+$routeParams);

					userservice.getUsers($scope); 
					/*userservice.updateUser($scope);*/
					/*console.log($scope.users);*/
					
					var newuser = {
							'firstname' : 'RITESH',
							'lastname' : 'SINGH',
							'address' : 'MAXICO',
							'email' : 'cool@gmail.com'
						};

						userservice.createUser(newuser, $scope);

					$scope.createNewUser = function() {

						var newuser = {
							'firstname' : $scope.firstname,
							'lastname' : $scope.lastname,
							'address' : $scope.address,
							'email' : $scope.email
						};

						userservice.createUser(newuser, $scope);

						//$scope.users.push(newuser);

						$scope.firstname = '';

						$scope.lastname = '';

						$scope.address = '';

						$scope.email = '';

					};

				} ]);

// Controller for Individual User View

angular.module('userApp').controller(
		"UsersByIdCtrl",
		[ '$scope', 'userservice', '$routeParams',
				function($scope, userservice, $routeParams) {

					userservice.getUser($routeParams.userId, $scope);

				} ]);