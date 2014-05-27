var exec = require('cordova/exec');

var versionCheck = {
  start: function(param ,successCallback, errorCallback) {
    exec(successCallback, errorCallback, 'checkVersion','checkDaily', [param]);
  }
};

if(!window.plugins) {
    window.plugins = {};
}
if (!window.plugins.checkVersion) {
    window.plugins.checkVersion = versionCheck;
}

if (module.exports) {
  module.exports = versionCheck;
}

