package com.paar.ch9;

import java.util.ArrayList;
import java.util.List;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Color;


public class RestaurantDataSource extends DataSource{
    private List<Marker> cachedMarkers = new ArrayList<Marker>();
    private static Bitmap icon = null;
       
    public RestaurantDataSource(Resources res) {
        if (res==null) throw new NullPointerException();
        createIcon(res);
    }
    
    protected void createIcon(Resources res) {
        if (res==null) throw new NullPointerException();
        icon=BitmapFactory.decodeResource(res, R.drawable.rs);
    }
   
    
    public List<Marker> getMarkers() {
    	
    	Marker atl0 = new IconMarker("Cafeteria Central", 3.3484567345933094, -76.53185254770747, 1041.83565384129, Color.DKGRAY, icon);
        cachedMarkers.add(atl0);
        
        Marker atl1 = new IconMarker("Buonissimo", 3.348090954323802, -76.5322803469, 1050.8264, Color.DKGRAY, icon);
        cachedMarkers.add(atl1);
    	 
        Marker atl2 = new IconMarker("La Locura", 3.347070679226489, -76.134033876, 1040.9379247300174, Color.DKGRAY, icon);
        cachedMarkers.add(atl2);
    	
        Marker atl3 = new IconMarker("Fruteria", 3.3436770007800, -76.53227715108162, 1048.8641098730668, Color.DKGRAY, icon);
        cachedMarkers.add(atl3);
        
        Marker atl4 = new IconMarker("Pan y Pasta", 3.3472756938095207, -76.53189100924828, 1064.0910813465237, Color.DKGRAY, icon);
        cachedMarkers.add(atl4);
        return cachedMarkers;
    }
}