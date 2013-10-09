/* 
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */


var controllers = angular.module('MainModule.controllers', []);

var services = angular.module('MainModule.services', ['ngResource']);

var filters = angular.module('MainModule.filters', []);

var directives = angular.module('MainModule.directives', []);

var MainModule = angular.module('MainModule',
    ['MainModule.controllers', 'MainModule.services', 'MainModule.filters', 'MainModule.directives'
        ,'ngResource','ngTouch'])
.config(['$routeProvider', function ($routeProvider) {
    $routeProvider.when('/Home', {
        templateUrl: 'Home.jspf'
    });
    $routeProvider.when('/AboutUs', {
        templateUrl: 'About.jspf'
    });
    $routeProvider.when('/Login', {
        templateUrl: 'Account/Login'
    });
    $routeProvider.when('/Apartment', {
        templateUrl: 'AMS_Masters/MastersContext.jspf'
    });
    $routeProvider.otherwise({
        redirectTo: '/Login'
    });
}]);

services.value('UserName','<%= request.getSession().getAttribute("Login_UserName")%>');


