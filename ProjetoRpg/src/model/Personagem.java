package model;

import java.util.Random;

public class Personagem {
 String nome;
 int vida;
 int mana;
 float xp;
 int inteligencia;
 int forca;
 int level;
 Random random = new Random();

 public Personagem(String nome, int vida, int mana, float xp, int inteligencia, int forca, int level) {
  this.nome = nome;
  this.vida = vida;
  this.mana = mana;
  this.xp = xp;
  this.inteligencia = inteligencia;
  this.forca = forca;
  this.level = level;
 }

 public String getNome() {
  return nome;
 }

 public void setNome(String nome) {
  this.nome = nome;
 }

 public int getVida() {
  return vida;
 }

 public void setVida(int vida) {
  this.vida = vida;
 }

 public int getMana() {
  return mana;
 }

 public void setMana(int mana) {
  this.mana = mana;
 }

 public float getXp() {
  return xp;
 }

 public void setXp(float xp) {
  this.xp = xp;
 }

 public int getInteligencia() {
  return inteligencia;
 }

 public void setInteligencia(int inteligencia) {
  this.inteligencia = inteligencia;
 }

 public int getForca() {
  return forca;
 }

 public void setForca(int forca) {
  this.forca = forca;
 }

 public int getLevel() {
  return level;
 }

 public void setLevel(int level) {
  this.level = level;
 }

 public void lvlUp() {
  setForca(getForca() + 5);
  setInteligencia(getInteligencia() + 3);
  setVida(getVida() + 2);
  setMana(getMana() + 3);
 }

 public void attack(double attack) {
  for(int i=0; i<=300; i++) {
	  attack = (getForca()*getLevel() + random.nextInt());
	  System.out.println("Destreza" + attack);
  }
 }

 
}
