/*
 Given a 2D array of NxM find the amount of different paths
 from (9,0) to (N,M).
*/
public int numOfPathsInMatrix(int[][] matrix){
	
	// array of size n x m
	int n = matrix.length;
	int m = matrix[0].length;

	matrix[0][0] = 1;
	for(int l=0; l<n; l++){
		for(int c=0; c<n; c++){
			sum = 0;
			// cell above
			if(l-1 >= 0) sum += matrix[l-1][c];
			// cell on the left
			if(j-1 >= 0) sum += matrix[l][c-1];
			matrix[l][c] = sum;
		}
	}

	// the most bottom right cell content
	return matrix[n-1][m-1];
}