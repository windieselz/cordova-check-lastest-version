package com.adfit.plugins;

import java.io.Serializable;
import java.util.LinkedHashMap;

import org.apache.cordova.CallbackContext;
import org.apache.cordova.CordovaPlugin;
import org.json.JSONArray;
import org.json.JSONObject;
import org.json.JSONException;

import android.app.Activity;
import android.content.Intent;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import com.androidquery.service.MarketService;

public class checkVersion extends CordovaPlugin implements Serializable {
	
	@Override
    public boolean execute(String action, JSONArray args, CallbackContext callbackContext) throws JSONException {
		Log.d("checkVersion","start android cordova check version");
		if(action.equals("checkDaily")) {
			MarketService ms = new MarketService(this.cordova.getActivity());
		    ms.level(MarketService.MINOR).checkVersion();
        	return true;
        }        
		
		return false;
	}
}
