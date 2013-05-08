package com.paar.ch9;

import java.util.ArrayList;
import java.util.List;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Color;


public class BuildingDataSource extends DataSource{
    private List<Marker> cachedMarkers = new ArrayList<Marker>();
    private static Bitmap icon = null;
   // private static Bitmap iconED = null;
   // private static Bitmap iconRS = null;
    
    public BuildingDataSource(Resources res) {
        if (res==null) throw new NullPointerException();
        createIcon(res);
    }
    
    protected void createIcon(Resources res) {
        if (res==null) throw new NullPointerException();
        icon=BitmapFactory.decodeResource(res, R.drawable.ed);
    }
   
    
    public List<Marker> getMarkers() {
    	
    	Marker atl1 = new IconMarker("Ed.Lago", 3.3481126994332, -76.532901217808, 1061.615685713607, Color.DKGRAY, icon);
        cachedMarkers.add(atl1);
        
        Marker atl2 = new IconMarker("Ed.Almendros", 3.346425287768692, -76.53223640431655, 1047.977942090481, Color.DKGRAY, icon);
        cachedMarkers.add(atl2);
        
        Marker atl3 = new IconMarker("Ed. Saman", 3.34668195311875, -76.532838140666, 1068.469775007406, Color.DKGRAY, icon);
        cachedMarkers.add(atl3);
        
        Marker atl4 = new IconMarker("Ed. Educon", 3.3472659558655624, -76.5319878045667, 1065.7385366246976, Color.DKGRAY, icon);
        cachedMarkers.add(atl4);
        
        Marker atl5 = new IconMarker("Ed. Acacias", 3.3471590207664565, -76.533946769593, 1067.3553247025518, Color.DKGRAY, icon);
        cachedMarkers.add(atl5);
        
        Marker atl6 = new IconMarker("Ed. Palmas", 3.34900263968587, -76.53157826849505, 1059.09918102908, Color.DKGRAY, icon);
        cachedMarkers.add(atl6);
        
        Marker atl7 = new IconMarker("Ed. Guayacanes", 3.3488567345933094, -76.53135254770747, 1041.83565384129, Color.DKGRAY, icon);
        cachedMarkers.add(atl7);
        
        return cachedMarkers;
    }
}