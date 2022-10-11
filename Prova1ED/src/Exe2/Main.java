package Exe2;

import java.util.Stack;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws FileNotFoundException {
		Stack pilha1 = new Stack(); // Classe Pilha1 
		Stack pilha2 = new Stack(); // Classe Pilha2
		Stack pilha3 = new Stack(); // Classe Pilha3
		
		Scanner scanner1;
		Scanner scanner2;
		Scanner scanner3;
		
		scanner1 = new Scanner(new File("C:\\Documentos de Progamações/ED/pilha1.txt")) ;
		scanner2= new Scanner(new File("C:\\Documentos de Progamações/ED/pilha2.txt")) ;
		scanner3 = new Scanner(new File("C:\\Documentos de Progamações/ED/pilha3.txt")) ;
		
		while(scanner1.hasNextLine() && scanner2.hasNextLine() && scanner3.hasNextLine()) {
			pilha1.push(scanner1.nextLine());
			pilha2.push(scanner2.nextLine());
			pilha3.push(scanner3.nextLine());
		}
		
		while(!pilha1.empty() && !pilha2.empty() && !pilha3.empty()) {
			System.out.println("Assistente 1 - prato: "+pilha1.pop());
			System.out.println("Assistente 2 - prato: "+pilha2.pop());
			System.out.println("Assistente 3 - prato: "+pilha3.pop());
		}
			

	}
}
