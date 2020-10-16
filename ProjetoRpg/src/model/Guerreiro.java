package model;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Guerreiro extends Personagem{

	public Guerreiro(String nome, int vida, int mana, float xp, int inteligencia, int forca, int level) {
		super(nome, vida, mana, xp, inteligencia, forca, level);
		
	}

	Random random = new Random();
	private List<String> habilidade;
	
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
   
    
    public List<String> getHabilidade() {
        return getHabilidade();
    }
    public void setHabilidade(List<String> habilidade) {
        this.habilidade = habilidade;
    }
    public void status(){
        System.out.println("Guerreiro");
        System.out.println("Nivel: " + getLevel());
        System.out.println("Vida: " + getVida());
        System.out.println("mana: " + getMana());
        System.out.println("Inteligencia: " + getInteligencia());
        System.out.println("Forca: " + getForca());
    }
	
 
 
 
}

