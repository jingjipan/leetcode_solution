

public class RotateImage {

	public RotateImage() {
		// TODO Auto-generated constructor stub
	}
	
	//beats 100.00%
	public void rotate(int[][] matrix) {
		rotateHelper(matrix,0,0);
    }
	
	/*
	 * int left represents the level of the matrix, and add means the current rotating position.
	 * first start from four corners, left bottom to left top, right bottom to left bottom and so on.
	 * then the add represents the elements on the row, and rotate them similarly.
	 * after rotating the outer rows, I treat the rest as a smaller matrix to be rotated and so on. 
	 */ 
	public void rotateHelper(int[][] matrix, int left, int add){
		int right = matrix.length-left-1;
		if(left>=right)
			return;
		if(add>=right-left){
			rotateHelper(matrix, left+1, 0);
			return;
		}
		
		int currleft = left+add;
		int currright=right-add;
		int temp = matrix[left][currleft];
		matrix[left][currleft]=matrix[currright][left];
		matrix[currright][left] = matrix[right][currright];
		matrix[right][currright]=matrix[currleft][right];
		matrix[currleft][right] = temp;
		rotateHelper(matrix, left, add+1);
	}
}