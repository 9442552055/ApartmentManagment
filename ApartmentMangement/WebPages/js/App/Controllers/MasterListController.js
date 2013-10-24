controllers.controller('MasterListController',['$scope','$http',function($scope,$http){
//    $scope.gridOptions = {
//        data: 'myData',
//        enablePinning: true,
//        columnDefs: [{
//            field: "name",
//            width: 120,
//            pinned: true
//        },
//        {
//            field: "age",
//            width: 120
//        },
//        {
//            field: "birthday",
//            width: 120
//        },
//        {
//            field: "salary",
//            width: 120
//        }]
//    };
//    $scope.myData =
//    [{
//        name: "Moroni",
//        age: 50,
//        birthday: "Oct 28, 1970",
//        salary: "60,000"
//    },
//    {
//        name: "Tiancum",
//        age: 43,
//        birthday: "Feb 12, 1985",
//        salary: "70,000"
//    },
//    {
//        name: "Jacob",
//        age: 27,
//        birthday: "Aug 23, 1983",
//        salary: "50,000"
//    },
//    {
//        name: "Nephi",
//        age: 29,
//        birthday: "May 31, 2010",
//        salary: "40,000"
//    },
//    {
//        name: "Enos",
//        age: 34,
//        birthday: "Aug 3, 2008",
//        salary: "30,000"
//    },
//    {
//        name: "Moroni",
//        age: 50,
//        birthday: "Oct 28, 1970",
//        salary: "60,000"
//    },
//    {
//        name: "Tiancum",
//        age: 43,
//        birthday: "Feb 12, 1985",
//        salary: "70,000"
//    },
//    {
//        name: "Jacob",
//        age: 27,
//        birthday: "Aug 23, 1983",
//        salary: "40,000"
//    },
//    {
//        name: "Nephi",
//        age: 29,
//        birthday: "May 31, 2010",
//        salary: "50,000"
//    },
//    {
//        name: "Enos",
//        age: 34,
//        birthday: "Aug 3, 2008",
//        salary: "30,000"
//    },
//    {
//        name: "Moroni",
//        age: 50,
//        birthday: "Oct 28, 1970",
//        salary: "60,000"
//    },
//    {
//        name: "Tiancum",
//        age: 43,
//        birthday: "Feb 12, 1985",
//        salary: "70,000"
//    },
//    {
//        name: "Jacob",
//        age: 27,
//        birthday: "Aug 23, 1983",
//        salary: "40,000"
//    },
//    {
//        name: "Nephi",
//        age: 29,
//        birthday: "May 31, 2010",
//        salary: "50,000"
//    },
//    {
//        name: "Enos",
//        age: 34,
//        birthday: "Aug 3, 2008",
//        salary: "30,000"
//    }];

$scope.filterOptions = {
        filterText: "",
        useExternalFilter: true
    };
    $scope.totalServerItems = 0;
    $scope.pagingOptions = {
        pageSize: 5,
        currentPage: 1
    };  
    $scope.setPagingData = function(data, page, pageSize){	
        //var pagedData = data.slice((page - 1) * pageSize, page * pageSize);
        $scope.myData = data;
        $scope.totalServerItems = data.length;
        if (!$scope.$$phase) {
            $scope.$apply();
        }
    };
    $scope.getPagedDataAsync = function (pageSize, page, searchText) {
        setTimeout(function () {
            var data;
            if (searchText) {
                var ft = searchText.toLowerCase();
                $http.get('/Api/Masters/Apartments',{params:{pageSize:pageSize,pageNo:page,searchText:searchText}}).success(function (largeLoad) {		
                    data = largeLoad;
                    $scope.setPagingData(data,page,pageSize);
                });            
            } else {
                $http.get('/Api/Masters/Apartments',{params:{pageSize:pageSize,pageNo:page,searchText:searchText}}).success(function (largeLoad) {
                    $scope.setPagingData(largeLoad,page,pageSize);
                });
            }
        }, 100);
    };
	
    $scope.getPagedDataAsync($scope.pagingOptions.pageSize, $scope.pagingOptions.currentPage);
	
    $scope.$watch('pagingOptions', function (newVal, oldVal) {
        if (newVal !== oldVal && newVal.currentPage !== oldVal.currentPage) {
          $scope.getPagedDataAsync($scope.pagingOptions.pageSize, $scope.pagingOptions.currentPage, $scope.filterOptions.filterText);
        }
    }, true);
    $scope.$watch('filterOptions', function (newVal, oldVal) {
        if (newVal !== oldVal) {
          $scope.getPagedDataAsync($scope.pagingOptions.pageSize, $scope.pagingOptions.currentPage, $scope.filterOptions.filterText);
        }
    }, true);
	
    $scope.gridOptions = {
        data: 'myData',
        enablePaging: true,
        showFooter: true,
        totalServerItems:'totalServerItems',
        pagingOptions: $scope.pagingOptions,
        filterOptions: $scope.filterOptions
    };

}]);
