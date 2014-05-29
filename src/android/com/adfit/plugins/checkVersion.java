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
	
	private CallbackContext callback;
	
	@Override
    public boolean execute(String action, JSONArray args, CallbackContext callbackContext) throws JSONException {
		Log.d("checkVersion","start android cordova check version");
		callback = callbackContext;
		if(action.equals("checkDaily")) {
			this.cordova.getThreadPool().execute(new Runnable()
		    {
		        public void run()
		        {
		            MarketService ms = new MarketService(cordova.getActivity());
		    		ms.level(MarketService.MINOR).checkVersion();
					ms.force(true);					
		    		callback.success();
		        }
		    });
        	return true;
        }        
		
		return false;
	}
}
