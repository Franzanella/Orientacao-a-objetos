package model;

import interfaces.Imposto;

public class Livro extends Produto implements Imposto {
	protected String autor;
	protected String tema;
	protected int qtdPag;


	public Livro() {
	}

	public Livro(String nome, double preco, int qtd, String autor, String tema, int qtdPag) {
		super(nome, preco, qtd);
		this.autor = autor;
		this.tema = tema;
		this.qtdPag = qtdPag;
	}

	// Getters e Setters
	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public String getTema() {
		return tema;
	}

	public void setTema(String tema) {
		this.tema = tema;
	}

	public int getQtdPag() {
		return qtdPag;
	}

	public void setQtdPag(int qtdPag) {
		this.qtdPag = qtdPag;
	}

	@Override
	public double calculaImposto() {
		double imp;
		if (tema == "educativo") {
			System.out.println(" Livro educativo nao tem imposto: JAVA POO\n");
			return 0;
		} else {
			imp = preco * 0.1;
			System.out.println("R$ " + imp + " de imposto sobre o livro  " + nome);
			return imp;
		}
	}

}
