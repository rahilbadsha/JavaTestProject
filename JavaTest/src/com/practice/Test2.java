package com.practice;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;
import java.util.stream.Collectors;

public class Test2 {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		// TODO Auto-generated method stub

		try(BufferedReader br= new BufferedReader(new FileReader(new File("F:\\newws\\JavaTest\\src\\data.txt")));){
			
			
		List<Player> plList=br.lines().skip(1).map(line->{
				String[] arr= line.split(",");
				int year= Integer.parseInt(arr[0]);
				String teamId= arr[1];
				String lgid= arr[2];
				String playerid= arr[3];
				int salary= Integer.parseInt(arr[4]);
				Player pl= new Player(year,teamId,lgid,playerid,salary);
				return pl;
			}).collect(Collectors.toList());

		for (Player p: plList) {
			System.out.println(p.toString());
		}
		}

	}
}
