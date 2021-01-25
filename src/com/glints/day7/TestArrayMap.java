package com.glints.day7;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class TestArrayMap {
	public static void main(String[] args) {
//		TreeMap<String, String> capitalCities = new TreeMap<String, String>();
//		LinkedHashMap<String, String> capitalCities = new LinkedHashMap<String, String>();
		Map<String, String[]> countryCities = new HashMap<String, String[]>();
		countryCities.put("England", new String[]{"London", "Liverpool", "Manchester", "Oxford"});
		countryCities.put("Germany", new String[]{"Berlin", "Munich"});
		countryCities.put("USA", new String[]{"Washington DC", "New York"});
		countryCities.put("Norway", new String[]{"Oslo", "Bergen", "Alesund"});
		
		 for (String i : countryCities.keySet()) {
			 System.out.print(i + " : ");
			 for(String c : countryCities.get(i)) {
				 System.out.print("|" + c + "|");
			 }
			 System.out.println();
		 }
		
	}
}
