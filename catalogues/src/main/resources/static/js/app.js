var app=angular.module("MyApp",[]);
app.controller("MyController", function($scope,$http){
	$scope.pageProduits=null;
	$http.get("http://localhost:8080/all")
	.success(function(data){
		$scope.pageProduits=data;
	})
	.error(function(err){
		console.log(err);
	});
});