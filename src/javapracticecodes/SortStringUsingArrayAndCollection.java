package javapracticecodes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class SortStringUsingArrayAndCollection {

	public static void main(String[] args) {
		
		String str="asdflkhg";
		
		//1] using array
		
		char ch[]= str.toCharArray();
		Arrays.sort(ch);
		
		for(int i=0; i<ch.length; i++)
		{
			System.out.println(" "+ch[i]);
		}
		
		
		//2] using collection
		
		ArrayList<String> data=new ArrayList<>();
		data.add("a");
		data.add("b");
		data.add("y");
		data.add("f");
		data.add("k");
		
		System.out.println(data);
		Collections.sort(data);
		
		System.out.println(data);
	}

}
