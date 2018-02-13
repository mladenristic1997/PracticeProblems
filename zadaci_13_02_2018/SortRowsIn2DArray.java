package zadaci_13_02_2018;

public class SortRowsIn2DArray {
	
	public static void main(String[] args) {
		double[][] mat ={
						 {1.0, 1.0, 1.0},
						 {0.5, 0.5, 0.5},
						 {0.2, 0.2, 0.2}
						};
		sortRows(mat);
		for(int i = 0; i < mat.length; i++) {
			for(int k = 0; k < mat[0].length; k++) {
				System.out.print(mat[i][k] + " ");
			}
			System.out.println();
		}
	}
	
	public static double[][] sortRows(double[][] array){
		
		for(int i = 0; i < array.length - 1; i++) {
			for(int k = i + 1; k < array.length; k++) {
				
				double sumI = 0;
				double sumK = 0;
				for(int l = 0; l < array[0].length; l++) {
					sumI += array[i][l];
					sumK += array[k][l];
				}
				
				if(sumI > sumK) {
					for(int p = 0; p < array[0].length; p++) {
						double temp = array[i][p];
						array[i][p] = array[k][p];
						array[k][p] = temp;
					}
				}
			}
		}
		return array;
		
	}

	
}
