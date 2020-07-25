package pokemonevcounter.main;

import java.util.*;
import java.util.Scanner;
import pokemonevcounter.gamemechanics.PokemonG3;


public class Main {
	private static List<PokemonG3> team;

	public static void main(String[] args) {
		team = new ArrayList<PokemonG3>();
		
		Scanner input = new Scanner(System.in);
		
		while(true) {
			
			
			for(PokemonG3 poke : team) {
				System.out.println(poke.getName());
			}
			
			System.out.println("Quit? y/n");
			String quit = input.next();
			if(quit.equalsIgnoreCase("y")) {
				break;
			}
			
			System.out.println("Start tracking a new Pokemon? y/n");
			String newPokemon = input.next();
			if(newPokemon.equalsIgnoreCase("y")) {
				
				System.out.print("Enter the name of the new Pokemon: ");
				String newPokemonName = input.next();
				PokemonG3 p = new PokemonG3(newPokemonName);
				
				team.add(p);
			}
			
			System.out.println("Work on a Pokemon? y/n");
			String work = input.next();
			if(work.equalsIgnoreCase("y")) {
					
				System.out.print("Enter the Pokemon index: ");
				int index = input.nextInt();
				
				while(true) {
					System.out.println("1: +1 Battle EV\n2: +10 HP EV");
					int choice = input.nextInt();
					
					if(choice == 1) {
						team.get(index).battleUpHp();
					}
					else {
						break;
					}
				}
				
			}
		}
		
		input.close();
		
	}

}
