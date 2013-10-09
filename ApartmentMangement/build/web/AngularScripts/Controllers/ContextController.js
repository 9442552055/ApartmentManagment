
controllers.controller('ContextController',['$scope',function($scope){
    $scope.templateUrl="../About.jspf";

    $scope.ContextItems=['Apartments','Tenants','Amenities','Contacts'];

    $scope.createApartment = function(currentContext){
        alert(currentContext);
        $scope.templateUrl="../AMS_Masters/ApartmentDetail.jspf";
        return false;
    }

    $scope.listApartment = function(currentContext){
        alert(currentContext);
        $scope.templateUrl="../Home.jspf";
        return false;
    }
    $('.collapse').collapse({
        toggle: false
    })
    $('.accordion').on('show hide', function (e) {
        $(e.target).siblings('.accordion-heading').find('.accordion-toggle i').toggleClass('icon-chevron-down icon-chevron-up');
    });
   
}]);

controllers.controller('ApartmentDetailController',['$scope','UserName',function($scope,UserName){
    $scope.UserName=UserName;
    $scope.Items=[1,2,3,4,5];
}]);


