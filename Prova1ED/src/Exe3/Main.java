package Exe3;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		  System.out.println("Escolha um número entre 1 a 3");
		  System.out.println("<1> Cadastrar Post");
		  System.out.println("<2> Visualizar Posts Relevantes");
		  System.out.println("<3> Sair");
		  
		  int numero = entrada.nextInt();
		   switch (numero) {
		     case 1:
		       System.out.println("<1> Cadastrar Post");
		       break;
		     case 2:
		       System.out.println("<2> Visualizar Posts Relevantes");
		       break;
		     case 3:
		       System.out.println("<3> Sair");
		       break;
		     case 4:
		       break;
		     default:
		       System.out.println("O número escolhido é inválido! Digite um número entre 1 a 3.");
		   }
		 }
		}