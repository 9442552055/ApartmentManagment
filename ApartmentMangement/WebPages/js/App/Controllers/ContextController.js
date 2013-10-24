controllers.controller('ContextController',['$scope','$routeParams',function($scope,$routeParams){
   
    $scope.templateUrl='';
    $scope.contextUrl='AMS_Masters/MastersContextView.jspf';

    $scope.currentModule=$routeParams.master;
    $scope.currentAction=$routeParams.action;


    $scope.ContextItems=[
    {
        Text:'Apartments',
        DefaultUrl:'../AMS_Masters/MasterList.jspf',
        buttons:[{
            Text:'Create',
            //Click:$scope.create,
            Url:'../AMS_Masters/ApartmentDetail.jspf'
        },{
            Text:'List',
            //Click:$scope.list,
            Url:'../AMS_Masters/MasterList.jspf'
        }]
    },
    {
        Text:'Tenants',
        DefaultUrl:'../AMS_Masters/MasterList.jspf',
        buttons:[{
            Text:'Create',
            //Click:$scope.create
             Url:'../AMS_Masters/TenantDetail.jspf'
        },{
            Text:'List',
            //Click:$scope.list
             Url:'../AMS_Masters/MasterList.jspf'
        }]
    },
    {
        Text:'Amenities',
        DefaultUrl:'../AMS_Masters/MasterList.jspf',
        buttons:[{
            Text:'Create',
            //Click:$scope.create
             Url:'../AMS_Masters/AmenityDetail.jspf'
        },{
            Text:'List',
            //Click:$scope.list
             Url:'../AMS_Masters/MasterList.jspf'
        }]
    },
    {
        Text:'Contacts',
        DefaultUrl:'../AMS_Masters/MasterList.jspf',
        buttons:[{
            Text:'Create',
            //Click:$scope.create
             Url:'../AMS_Masters/Contact.jspf'
        },{
            Text:'List',
            //Click:$scope.list
             Url:'../AMS_Masters/MasterList.jspf'
        }]
    }];

    var a=0;
    var b=0;
    for(a=0;a<$scope.ContextItems.length;a++)
    {
        if($scope.ContextItems[a].Text==$routeParams.master)
        {
            $scope.templateUrl=$scope.ContextItems[a].DefaultUrl;
            
            for(b=0;b<$scope.ContextItems[a].buttons.length;b++)
            {
                if($scope.ContextItems[a].buttons[b].Text==$routeParams.action)
                {
                    $scope.templateUrl=$scope.ContextItems[a].buttons[b].Url;
                }
            }
        }
    }

    $scope.create = function(currentContext){
        $scope.templateUrl="../AMS_Masters/ApartmentDetail.jspf";
        return false;
    }

    $scope.list = function(currentContext){
        $scope.templateUrl="../AMS_Masters/MasterList.jspf";
        return false;
    }

    $('.collapse').collapse({
        toggle: false
    });
    $('.accordion').on('show hide', function (e) {
        $(e.target).siblings('.accordion-heading').find('.accordion-toggle i').toggleClass('icon-chevron-down icon-chevron-up');
    });
   
}]);




