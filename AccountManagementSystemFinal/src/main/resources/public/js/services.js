angular.module('app.services', []).factory('Account', function($resource) {
  return $resource('/api/v1/accounts/:id', { id: '@id' }, {
    update: {
      method: 'PUT'
    }
  });
}).service('popupService',function($window){
    this.showPopup=function(message){
        return $window.confirm(message);
    }
});
