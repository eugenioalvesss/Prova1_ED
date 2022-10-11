package Exe1;

public class Main {

	public static void main(String[] args) {
		int vetor[] = {3,8,7,9,10,11,80,2,1,50};
		
		for(int i = 0; i< vetor.length; i++) {
			int j = 0, valor = 0, aux = 0;
			valor = vetor [i];
			j = i-1;
			
			
			while((j >= 0) && (valor < vetor[j])) {
				aux = vetor [j+1];
				vetor[j+1] = vetor [j];
				vetor[j] = aux;
				j=i-1;
				if(j==-1) {
					}
				}
			}
			for(int i=0; i <vetor.length; i++) 
	            System.out.println(vetor[i]);
		}
	}


