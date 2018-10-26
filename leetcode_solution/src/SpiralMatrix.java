import java.util.ArrayList;
import java.util.List;

public class SpiralMatrix {

	public SpiralMatrix() {
		// TODO Auto-generated constructor stub
	}
	
	///beat 100%, but server affects the running time too much
	public List<Integer> spiralOrder(int[][] matrix) {
		List<Integer> result = new ArrayList<Integer>();
		if(matrix.length==0||matrix==null){
			return result;
		}
		int left= 0, right = matrix[0].length-1, top = 0, bottom = matrix.length-1;
		//add up the elements on four edges of residual matrix
		for(;left<right&&top<bottom;left++,right--,top++,bottom--) {
			for(int i=left;i<right;i++){
				result.add(matrix[top][i]);
			}
			for(int i=top;i<bottom;i++){
				result.add(matrix[i][right]);
			}
			for(int i=right;i>left;i--){
				result.add(matrix[bottom][i]);
			}
			for(int i=bottom;i>top;i--){
				result.add(matrix[i][left]);
			}
		}
		
		//add up the residuals
		if(right==left){
			//if the remaining matrix is in a vertical line 
			for(int i=top;i<bottom+1;i++){
				result.add(matrix[i][left]);
			}
		}else if(top==bottom){
			//if the remaining matrix is in a horizontal line 
			for(int i=left;i<right+1;i++){
				result.add(matrix[top][i]);
			}
		}
		
		return result;
    }
	
	
}