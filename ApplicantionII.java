package matriz;

import java.util.Scanner;

public class ApplicantionII {

	
	/* Fazer um programa para ler dois n�meros inteiros M e N. Ler uma matriz 
	 * de M linhas por N colunas de n�meros inteiros (pode haver repeti��es).
	 * Em seguida ler um n�mero X, mostrar os valores acima, abaixo, � esquerda e � direita (se houver)
	 * e a posi��o do n�mero na matriz 
	 */
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int m = sc.nextInt();
		int n = sc.nextInt();
		int matriz [][] = new int[m][n];
		
		for(int i =0; i < matriz.length; i++) {
			for(int j =0; j < matriz[i].length; j++) {
				matriz[i][j] = sc.nextInt();
			}
		}
		
		int x = sc.nextInt();
		
		for(int i =0; i < matriz.length; i++) {
			
			for(int j =0; j < matriz[i].length; j++) {
				
				if(matriz[i][j] == x) {
					System.out.println("Position: " + i +"," +j);
						if((j-1) >= 0) {
							System.out.println("Left: " + matriz[i][j-1]);
						}
						if((j+1) <= (matriz[i].length-1)) {
							System.out.println("Right: " + matriz[i][j+1]); 
						}
						if((i+1) <= (matriz.length-1)) {
							System.out.println("Down: " + matriz[i+1][j]); 
						}
						if((i-1) >= 0)
							System.out.println("Up: " + matriz[i-1][j]);
						
				} // fim "IF" achou o n�meros
			}	// fim "FOR" percorreu todas colunas
		}
		
		sc.close();
		

	}

}
