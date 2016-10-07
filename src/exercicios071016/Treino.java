package exercicios071016;

import java.util.Scanner;

public class Treino {

	public Treino() {
		exercicio1();
	}

	private void exercicio1() {
		int num1 = (new Scanner(System.in)).nextInt();
		int num2 = (new Scanner(System.in)).nextInt();
		if(num1>num2){
			System.out.println("O numero "+num1 + " é o maior.");
		}
		else{
			System.out.println("O numero "+num2 + " é o maior.");
		}
		
	}
}
