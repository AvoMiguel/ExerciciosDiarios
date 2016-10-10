package exercicios071016;

import java.util.Random;
import java.util.Scanner;

public class Treino {

	public Treino() {
		//exercicio1();
		//exercicio2();
		exercicio3();
	}

	private void exercicio1() {
		System.out.println("Introduza o primeiro numero:");
		int num1 = (new Scanner(System.in)).nextInt();
		System.out.println("Introduza o segundo numero:");
		int num2 = (new Scanner(System.in)).nextInt();
		if(num1>num2){
			System.out.println("O numero "+num1 + " é o maior.");
		}
		else{
			System.out.println("O numero "+num2 + " é o maior.");
		}
		
	}
	private void exercicio2(){
		System.out.println("Introduza o primeiro numero:");
		int num1 = (new Scanner(System.in)).nextInt();
		System.out.println("Introduza o segundo numero:");
		int num2 = (new Scanner(System.in)).nextInt();
		System.out.println("Introduza o terceiro numero:");
		int num3 = (new Scanner(System.in)).nextInt();
		if(num1> num2 && num1>num3){
			System.out.println("O numero "+num1 + " é o maior.");	
		} else if(num2 >num1 && num2 > num3){
			System.out.println("O numero "+num2 + " é o maior.");
		} else if (num3 > num1 && num3 > num2){
			System.out.println("O numero "+num3 + " é o maior.");
		}
		
	}
	private void exercicio3(){
		int rand = (new Random()).nextInt(5)+1;
		int count=0;
		boolean acertou=true;
		
		do{System.out.println("Escolha um número aleatório entre 1 e 5?");
		int numero = (new Scanner(System.in)).nextInt();
		if(numero==rand){
			System.out.println("Acertou no número à "+(count+1)+" tentativa!");	
			acertou=false;
			return; //Sair do metodo
		}
		if (count==4){
			System.out.println("Atingiu máximo de tentativas");
			acertou=false;
			break;//Sair do while
		}
		else{
		System.out.println("Tem "+(count+1)+" tentativas");
		count++;}
		}while(acertou);
		
	}
	
}
