package com.tns.CollectionFrameWork;

import java.util.HashMap;
import java.util.Map;

public class MapInterface {

	public static void main(String[] args) {
		Map <String,String> mapObj = new HashMap<>();
		mapObj.put("first", "professor");
		mapObj.put("second", "berline");
		mapObj.put("third", "tokyo");
		mapObj.put("fourth", "nairobi");
		mapObj.put("fifth", "nairobi");//keys are unique values duplicated
		System.out.println(mapObj);//insertion order is not preserved
		System.out.println(mapObj.get("third"));//used to retrieve the value
		System.out.println(mapObj.get("tokyo"));//no key called tokyo "null" is the output
		System.out.println(mapObj.get("500"));

	}

}
