/* 
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
directives.directive('loginPartialBinder',['UserName',function(UserName){

    return {
        //restrict: 'EAC',
        link: function (scope, iElement, iAttrs) {
            var requestUrl= iAttrs.loginPartialBinder;
            if(UserName != 'null'){
                requestUrl +='?Username='+UserName;
            }
            $.ajax(requestUrl).done(function(response){
                iElement[0].innerHTML='';
                iElement.append(response);
                var dropDown =iElement.find('.dropdown-toggle')
                if(UserName!=''&& dropDown.length > 0){
                    dropDown[0].innerHTML="Welcome "+ UserName +" !<b class='caret'></b>";
                }
            })
        }
    }
}]);

