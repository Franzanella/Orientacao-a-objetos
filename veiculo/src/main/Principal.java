package main;

import java.util.Scanner;

import model.Veiculo;

public class Principal {

	public static void main(String[] args) {
		
		int opcao, qtdlitros;
		String cor;
		
		Veiculo carro = new Veiculo();
		Scanner tc = new Scanner(System.in);
		

		do {
		System.out.println("\nDigite a opcao desejada:\n1) Ligar carro\n2) Desligar carro\n3) Acelerar\n4) Frear\n5) Abastecer\n"
				+ "6) Pintar carro\n7) Sair\n");
		opcao = tc.nextInt();

		switch (opcao) {
		case 1:
			carro.ligar();
			break;
		case 2:
			carro.desligar();
			break;
		case 3:
			carro.acelerar();
			break;
		case 4:
			carro.frear();
			break;
		case 5:
			System.out.println("Quantos litros ira abastecer?");
			qtdlitros = tc.nextInt();
			carro.abastecer(qtdlitros);
			break;
		case 6:
			System.out.println("Digite a cor");
			cor = tc.next();
			carro.pintar(cor);
			break;
		case 7:
			break;

		default:
			System.out.println("Opcao invalida\n");
		}

		} while (opcao !=7);
	}

}
