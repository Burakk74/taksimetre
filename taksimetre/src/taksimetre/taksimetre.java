package taksimetre;

import java.util.Scanner;

public class taksimetre {

	public static void main(String[] args) {
	
		Scanner input = new Scanner(System.in);
		
		double acilis,kmbasi,total,gidilenyol;
		
		acilis = 10;
		kmbasi = 2.20;
		
		System.out.print("How many kilometers did you travel :");
		gidilenyol = input.nextDouble();
		
		total = acilis + (kmbasi * gidilenyol);
		
		if(total <= 20) {
			System.out.print("Price is 20$ !");
		}
		else{
			System.out.print("Price is " + total + "!");
		}
	}

}
