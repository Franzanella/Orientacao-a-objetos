package main;


import model.Gerente;
import model.Supervisor;
import model.Vendedor;

public class Principal {

	
			public static void main(String[] args) {
				Gerente gerente1 = new Gerente("Pedro", 28, 25000);
				Supervisor supervisor1 = new Supervisor("Helena", 31, 8000);
				Vendedor vendedor1 = new Vendedor("José", 29, 2500);
				
				System.out.printf("O Gerente: %s, com a idade: %d anos, tem o salario %.2f\n", gerente1.getNome(), gerente1.getIdade(), gerente1.Bonificacao());
				System.out.printf("O Supervisor: %s, com a idade: %d anos, tem o salario %.2f\n", supervisor1.getNome(), supervisor1.getIdade(), supervisor1.Bonificacao());
				System.out.printf("O Vendedor: %s, com a idade: %d anos, tem o salario %.2f\n", vendedor1.getNome(), vendedor1.getIdade(), vendedor1.Bonificacao());
			}

	}


