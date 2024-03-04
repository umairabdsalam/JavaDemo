package com.umairabdsalam.apps;

public class MainDynamic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		// TODO Auto-generated method stub
		
		DynamicArray dynamicArray = new DynamicArray(5);
		
	//	System.out.println(dynamicArray.capacity);
		
		dynamicArray.add("A");
		dynamicArray.add("B");
		dynamicArray.add("C");
		dynamicArray.add("D");
		dynamicArray.add("E");
		dynamicArray.add("F");
		
		//dynamicArray.insert(2, "X");
		dynamicArray.delete("A");
		dynamicArray.delete("B");
		dynamicArray.delete("C");
		//System.out.println(dynamicArray.search("C"));
		
		System.out.println(dynamicArray);
		System.out.println("Empty: " + dynamicArray.isEmpty());
		System.out.println("Size: " + dynamicArray.size);
		System.out.println("Capacity: " + dynamicArray.capacity);
		


	}

}
