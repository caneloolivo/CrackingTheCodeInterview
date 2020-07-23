package ArraysAndStrings;

public class ZeroMatrix {
	void setZeros(int [][] matrix) {
		boolean[] row = new boolean[matrix.length];
		boolean[] column = new boolean[matrix[0].length];
		for(int i =0; i < matrix.length;i++) {
			for(int j = 0; j< matrix[0].length; j++) {
				if(matrix[i][j]==0) {
					row[i] = true;
					column[j] = true;
				}
			}
		}
		for(int i = 0; i< row.length; i++) {
			if(row[i])
				nullifyRow(matrix, i);
		}
		for(int i = 0; i< column.length; i++)
			if(column[i])
				nullifyColumn(matrix, i);
	}
	
	public void nullifyRow(int[][]matrix, int row) {
		for(int j=0; j < matrix[row].length; j++) {
			matrix[row][j] = 0;
		}
	}
	
	public void nullifyColumn(int[][] matrix, int column) {
		for(int i =0; i < matrix.length; i++) {
			matrix[i][column] = 0;
		}
	}
}
