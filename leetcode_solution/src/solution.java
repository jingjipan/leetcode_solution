import java.util.List;

public class solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Permute2 s = new Permute2();
		int[] ii= {1,1,2};
		List<List<Integer>> result = s.permuteUnique(ii);
		for(List<Integer> ll:result){
			for(Integer i:ll){
				System.out.print(i);
			}
			System.out.println("\n");
		}
		System.out.println(result.size());
	}
	
}
