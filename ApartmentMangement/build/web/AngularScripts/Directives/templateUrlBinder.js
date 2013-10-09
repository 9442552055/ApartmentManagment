/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
directives.directive('templateUrlBinder',['$parse',function($parse){

    function loadHtml(iElement,requestUrl){
        var isRequestInProgress=false;
        if(!isRequestInProgress && requestUrl && requestUrl != '')
        {
            isRequestInProgress=true;
            $.ajax(
            {
                url:requestUrl,
                success:function(response){
                    iElement[0].innerHTML='';
                    iElement.append(response);
                    isRequestInProgress=false;
                },
                error:function(response){
                    iElement[0].innerHTML='';
                    isRequestInProgress=false;
                }
            });
        }
    }

    return {
        //restrict: 'EAC',
        link: function (scope, iElement, iAttrs) {
            var requestUrlGetter= $parse(iAttrs.templateUrlBinder);
            var requestUrl=requestUrlGetter(scope);
            scope.$watch(iAttrs.templateUrlBinder,
                function(newVal,oldVal){
                    if(!angular.equals(newVal,oldVal)){
                        loadHtml(iElement.find('#content'),newVal);
                    }
                });
        }
    }
}]);

