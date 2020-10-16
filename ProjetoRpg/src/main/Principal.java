package main;

import model.Guerreiro;
import model.Mago;

public class Principal {
	public static void main(String[] args) throws Exception {
	   Guerreiro guerreiro = new Guerreiro("Fly", 13, 2, 7, 6, 15, 9);
	   Mago mago = new Mago("Ejamar", 20,5,13,9,7,8);
	   
	   
	   guerreiro.status();
	   System.out.println("====================================");
	   mago.status();
	   
	   
	   System.out.println("===================GUERREIRO=================");
	   guerreiro.attack(2);
	   System.out.println("==================MAGO==================");
	   mago.attack(3);
	   
	 
	   
	  
	   
	   
	  
	}
}
