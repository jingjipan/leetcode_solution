import java.util.List;

public class solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		combinationsum s = new combinationsum();
		int[] i = {2,3,6,7};
		List<List<Integer>> l = s.combinationSum(i, 7);
		System.out.println(s.test(l));
	}
	
}
