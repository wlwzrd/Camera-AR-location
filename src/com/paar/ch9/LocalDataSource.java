package com.paar.ch9;

import java.util.ArrayList;
import java.util.List;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Color;


public class LocalDataSource extends DataSource{
    private List<Marker> cachedMarkers = new ArrayList<Marker>();
    private static Bitmap icon = null;
   
    
    public LocalDataSource(Resources res) {
        if (res==null) throw new NullPointerException();
        
        createIcon(res);
    }
    
    protected void createIcon(Resources res) {
        if (res==null) throw new NullPointerException();
        
        icon=BitmapFactory.decodeResource(res, R.drawable.ic_launcher);
    }
   
    public List<Marker> getMarkers() {
    	Marker atl = new IconMarker("HOME", 3.4664710216323567, -76.48971889244535, 986.0202006318159, Color.DKGRAY, icon);
        cachedMarkers.add(atl);
    	return cachedMarkers;
    }
}