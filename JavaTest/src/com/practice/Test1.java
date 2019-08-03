package com.practice;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;



public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub t -""

		var t ="Rahil";
		System.out.println(t);

		List<String> strings = List.of("a", "bb", "cc", "ddd"); 
		Map<Integer,List<String>>map=strings.stream().collect(Collectors.groupingBy(String::length));
		map.forEach((k,v)->{

			System.out.println("Key is "+k);
			v.forEach(s-> {
				System.out.println(s);
			});

		});

		Map<Integer,Long> mapresult= strings.stream().collect(Collectors.toMap(String::length,(s)->new Long(s.length())));
	}
}
