package module3;

import de.fhpotsdam.unfolding.UnfoldingMap;
import de.fhpotsdam.unfolding.data.PointFeature;
import de.fhpotsdam.unfolding.marker.Marker;
import de.fhpotsdam.unfolding.marker.SimplePointMarker;
import de.fhpotsdam.unfolding.providers.Google;
import de.fhpotsdam.unfolding.utils.MapUtils;
import processing.core.PApplet;
import java.lang.Object;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import de.fhpotsdam.unfolding.providers.MBTilesMapProvider;
import parsing.ParseFeed;

public class EathquakeDemo extends PApplet {
	
	private UnfoldingMap map;

	public void setup() {
		size (950, 600, OPENGL);
		map = new UnfoldingMap(this, 200, 50, 700, 500, new Google.GoogleMapProvider());
		map.zoomToLevel(2);
		MapUtils.createDefaultEventDispatcher(this, map);
	/*	
		List<PointFeature> bigEqs = new ArrayList <PointFeature>();
		bigEqs.add(valEq);
		bigEqs.add(alaskaEq);
		bigEqs.add(sumatraEq);
		bigEqs.add(japanEq);
		bigEqs.add(kamchatkaEq);
		
		List<Marker> markers = new ArrayList<Marker>();
		for (PointFeature eq: bigEarthquakes) {
			markers.add(new SimplePointMarker(eq.getLocation(), eq.getProperties()));
		}
		map.addMarkers(markers);
		
		int yellow = color (255,255,0);
		int gray = color (150,150,150);
		for (Marker mk : markers) {
			if ((int)mk.getProperty("year")>2000) {
				mk.setColor(yellow);
			}
			else {
				mk.setColor(gray);
			}
		}
		
		Location valLoc = new Location (-38.14f, -73.03f);
		Feature valEq = new PointFeature(valLoc);
		valEq.addProperty("title", "Valdivia", "Chile");
		valEq.addProperty("magnitude", "9.5");
		valEq.addProperty("date", "May 22, 1960");
		valEq.addProperty("year", "1960");
		
		Marker valMk = new SimplePointMarker(valLoc, valEq.getProperties());
		map.addMarker(valMk);
		*/
	}
	
	public void draw() {
		background (10);
		map.draw();
		addKey();
	}

	

}
