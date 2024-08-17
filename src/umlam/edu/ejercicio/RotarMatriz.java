package umlam.edu.ejercicio;

public class RotarMatriz {

	public static void main(String[] args) {
		int matriz[][] = {
				{1,2,3},
				{4,5,6},
				{7,8,9},
//				{5,1,9,11},
//				{2,4,8,10},
//				{13,3,6,7},
//				{15,14,12,16},
				};
		int aux=0, aux2 = 0; 
		for(int i=0; i < 2 ; i++) {
				aux = matriz[i][matriz[i].length - 1]; //guardo el 6
				matriz[i][matriz[i].length - 1] = matriz[0][i]; // piso el 6 con el 2
				
				aux2 = matriz[matriz[i].length - 1][matriz[i].length - 1 - i]; //guardo el 8
				matriz[matriz[i].length - 1][matriz[i].length - 1 - i] = aux;  //piso el 8
				
				aux = matriz[matriz[i].length - 1 - i][0]; // guardo el 7
				matriz[matriz[i].length - 1 - i][0] = aux2;
				
				matriz[0][i] = aux;	
		}
		
		for(int i=0; i < matriz[0].length ; i++) {
			for(int j=0; j < matriz[0].length ; j++) {
				System.out.print(matriz[i][j] + " ");
			}
			System.out.println();	
		}
	}

}
