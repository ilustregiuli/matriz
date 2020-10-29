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
					// vizinho da esquerda, minha solu��o:
						if((j-1) >= 0) {
							System.out.println("Left: " + matriz[i][j-1]);
						}
					/* "se a posi��o da coluna anterior (j-1) for maior ou igual a 0, � porque
					 	ela existe..."
					 	
					 	Solu��o do professor:
					 		if (j > 0) {
								System.out.println("Left: " + mat[i][j-1]);
							}	
						"Se a posi��o da coluna for maior que Zero, ent�o depois eu posso diminuir
						-1 e mostrar o conte�do dessa posi��o na tela. Caso for 0, essa posi��o 
						tem vizinho."	
					*/
						
						if((j+1) <= (matriz[i].length-1)) {
							System.out.println("Right: " + matriz[i][j+1]); 
						}
						
						if((i+1) <= (matriz.length-1)) {
							System.out.println("Down: " + matriz[i+1][j]); 
						}
						/* "Se a linha de baixo (i+1) for menor ou igual ao �ltimo �ndice
						 *  (nesse caso, .length -1, que retorna o n�mero do �ltimo �ndice) ent�o
						 *  essa posi��o existe..."
						 *  
						 *  Solu��o do professor:
						 *  
						 *  if (i < mat.length-1) {
								System.out.println("Down: " + mat[i+1][j]);
							}
							
							"Se a linha atual for menor que o �ltimo �ndice,
							ent�o eu posso adicionar mais +1 e mostrar na tela"
						 *  
						 */
						if((i-1) >= 0)
							System.out.println("Up: " + matriz[i-1][j]);
						
				} // fim "IF" achou o n�meros
			}	// fim "FOR" percorreu todas colunas
		}
		
		sc.close();
		

	}

}
