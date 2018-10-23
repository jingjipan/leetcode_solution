import java.util.List;

public class solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RotateImage s = new RotateImage();
		int[][] ii = {{5,1,9,11},{2,4,8,10},{13,3,6,7},{15,14,12,16}};
		s.rotate(ii);
		for(int[] ll:ii){
			for(Integer i:ll){
				System.out.print(i);
			}
			System.out.println("\n");
		}
		//System.out.println(result.size());
	}
	
}
