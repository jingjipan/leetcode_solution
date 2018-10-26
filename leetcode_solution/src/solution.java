import java.util.List;

public class solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SpiralMatrix s = new SpiralMatrix();
		int[][] mat = {{1, 2, 3, 4},
				  {5, 6, 7, 8},
				  {9,10,11,12}};
		List<Integer> result = s.spiralOrder(mat);
		for(Integer i:result){
			System.out.print(i+" ");
		}
		System.out.println(result);
	}
	
}
