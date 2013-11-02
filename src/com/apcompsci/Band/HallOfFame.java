package com.apcompsci.Band;

import java.util.ArrayList;
import java.util.Scanner;

public class HallOfFame {
	private static Scanner scan;
	static ArrayList<Band> bandList = new ArrayList();

	public static void main(String[] args) {
		scan = new Scanner(System.in);
		hall();
	}
	private static void search(){
		System.out.println("What would you like to search");
		System.out.println("A: Band Name");
		System.out.println("B: Band Members");
		System.out.println("C: Band Genre");
		System.out.println("D: Other");
		String searchResponse = scan.next();
		if(searchResponse.equalsIgnoreCase("A")){
			System.out.println("Tell me the band name");
			String nameOfBand = scan.next();
			for(int i = 0; i <= bandList.size(); i++){
				for (Band bandname : bandList){
					if (bandname.contains(nameOfBand)){
						System.out.println(nameOfBand + " is in the hall of fame");
						search();
						break;
					}
					else if(!bandname.contains(nameOfBand)){
						System.out.println("That band is not in the hall of fame");
						search();
						break;
					}
					else{
						break;
					}
				}
				search();
			}
		}
		else if(searchResponse.equalsIgnoreCase("B")){
			System.out.println("Tell me a band member");
			String bandMember = scan.next();
		}
		else if(searchResponse.equalsIgnoreCase("C")){

		}
		else if(searchResponse.equalsIgnoreCase("D")){
			System.out.println("Tell me something to search");
			searchResponse = scan.next();
			if(searchResponse.equalsIgnoreCase("Year")){
				
			}
		}

	}
	public static void hall(){

		System.out.println("What would you like to do");
		System.out.println("A: Add Band");
		System.out.println("B: Remove Band");
		System.out.println("C: Edit Band");
		System.out.println("D: Clear Hall of Fame");
		System.out.println("E: Search");
		System.out.println("F: Quit");
		String answer = scan.next();

		if(answer.equalsIgnoreCase("A")){
			System.out.println("Tell me the band name");
			String name = scan.next();
			Band b1 = new Band(name);
			bandList.add(b1);
			for(int i = 0; i < bandList.size(); i++) {   
				System.out.print(bandList.get(i));
			}  
			System.out.println("What genre is " + name);
			String genreOfBand = scan.next();
			Band.setGenre(genreOfBand);
			
			
			hall();
		}
		else if(answer.equalsIgnoreCase("B")){
			System.out.println("What is the band name you want to remove");
			String nameOfBand = scan.next();
			bandList.remove(1);
		}
		else if(answer.equalsIgnoreCase("C")){
			System.out.println("What band would you like to remove from the hall of fame");
		}
		else if(answer.equalsIgnoreCase("D")){
			System.out.println("Are you sure you want to erase the hall of fame. Y/N");
			String eraseAnswer = scan.next();
			if(eraseAnswer.equalsIgnoreCase("Y")){
				bandList.clear();
				System.out.println("You have deleted the hall of fame :(");
				hall();
			}
			else if(eraseAnswer.equalsIgnoreCase("N")){
				hall();
			}
		}
		else if(answer.equalsIgnoreCase("E")){
			search();
		}
		else if(answer.equalsIgnoreCase("F")){
			System.exit(0);
		}
		else {
			hall();
		}
	}

}
