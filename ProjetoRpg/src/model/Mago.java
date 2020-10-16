package model;

import java.util.List;
import java.util.Random;
import java.util.ArrayList;

public class Mago extends Personagem {
	public Mago(String nome, int vida, int mana, float xp, int inteligencia, int forca, int level) {
		super(nome, vida, mana, xp, inteligencia, forca, level);
		
	}

	Random random = new Random();
	private List<String> magia;
	
	public void lvlUp(){
        setVida(getVida()+1);
        setMana(getMana()+1);
        setInteligencia(getInteligencia()+1);
        setLevel(getLevel()+1);
        setForca(getForca()+3);
        status(); 
    }
    public void attack(double attack){
        for(int i=0; i<=300; i++){
            attack = (getForca()*getLevel()) + random.nextInt();
            System.out.println("Destreza: " + attack);
        }
    }
   
    
    public List<String> getMagia() {
        return getMagia();
    }
    public void setMagia(List<String> magia) {
        this.magia = magia;
    }
    public void status(){
        System.out.println("Mago");
        System.out.println("Nivel: " + getLevel());
        System.out.println("Vida: " + getVida());
        System.out.println("Mana: " + getMana());
        System.out.println("Inteligencia: " + getInteligencia());
        System.out.println("Forca: " + getForca());
    }
	
 
}