﻿/**
* The following features are still outstanding: popup delay, animation as a
* function, placement as a function, inside, support for more triggers than
* just mouse enter/leave, html popovers, and selector delegatation.
*/
var popoverModule = angular.module('ui.bootstrap.popover', ['ui.bootstrap.tooltip'])
popoverModule.directive('popoverPopup', function () {
    return {
        restrict: 'EA',
        replace: true,
        scope: { title: '@', content: '@', placement: '@', animation: '&', isOpen: '&' },
        template: '<div class="popover {{placement}}" ng-class="{ in: isOpen(), fade: animation() }"><div class="arrow"></div>  <div class="popover-inner"><h3 class="popover-title" ng-bind="title" ng-show="title"></h3>  <div class="popover-content" ng-bind="content"></div></div></div>'
    };
})
popoverModule.directive('popover', ['$compile', '$timeout', '$parse', '$window', '$tooltip', function ($compile, $timeout, $parse, $window, $tooltip) {
    return $tooltip('popover', 'popover', 'click');
}]);

