package arrays;

public class TwoDArrayDemo {

	public static void main(String[] args) {
		int[][] matrixA = new int[3][2];
		matrixA[0][0] = 1;
		matrixA[0][1] = 2;
		matrixA[1][0] = 3;
		matrixA[1][1] = 4;
		matrixA[2][0] = 5;
		matrixA[2][1] = 6;
		
		
		for(int i=0;i<matrixA.length;i++) {
			for(int j=0;j<matrixA[i].length;j++) {
				System.out.print(matrixA[i][j] + "    ");
			}
			System.out.println();
		}
		
		int[] myArr = matrixA[1];
		
		Object obj = matrixA;
		
		// array intializaion
		
		int[][] matrixB = {{1,2},{4,5},{7,8}};
		
		
	}

}
