controllers.controller('ApartmentDetailController',['$scope','UserName',function($scope,UserName){
    $scope.UserName=UserName;
    $scope.Items=[1,2,3,4,5];
    $('#ApartmentDetail .collapse').collapse({
        toggle: false
    });
    $('#ApartmentDetail .accordion').on('show hide', function (e) {
        $(e.target).siblings('.accordion-heading').find('.accordion-toggle .ico-pull i').toggleClass('icon-chevron-down icon-chevron-up');
    });
}]);