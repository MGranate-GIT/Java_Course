package EXPERIMENT;

public class MATRIX {

	public static void main(String[] args) {
	

		boolean[][] mat = new boolean[8][8];
		
		for ( int i=0; i<mat.length; i++) {
			if (i % 2 == 0) {
			for (int j=0; j<mat[i].length; j++) {
				if (j % 2 == 0) {
					mat[i][j] = false;
				}
				else {					
					mat[i][j] = true;
				}
				System.out.print(mat[i][j]);
			}
			}
			else {
				for ( int j=0; j<mat[i].length; j++) {
					if (j % 2 == 0) {
						mat[i][j] = true;
					}
					else {					
						mat[i][j] = false;
					}
					System.out.print(mat[i][j]);
				}
				
			}	
			System.out.println();
}
	}
	

}
