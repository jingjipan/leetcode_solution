import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class Permute {
	public Permute(){
		
	}
	
	//backtrack && beats 100.00%
	public List<List<Integer>> permute(int[] nums) {
		if(nums.length==0)
        	return new ArrayList<List<Integer>>();
		Arrays.sort(nums);
		boolean[] bool = new boolean[nums.length];
		List<List<Integer>> result = new ArrayList<List<Integer>>();
		permuteHelper(nums,bool,new ArrayList<Integer>(),result);
		return result;
    }
	
	public void permuteHelper(int[]nums,boolean[] bool,List<Integer> candidate,List<List<Integer>> result){
		if(candidate.size()==nums.length){
			result.add(new ArrayList<Integer>(candidate));
			return;
		}
		for(int i=0;i<nums.length;i++){
			//check if the number is used
			if(bool[i])
				continue;
			candidate.add(nums[i]);
			bool[i]=true;
			permuteHelper(nums,bool,candidate,result);
			//backtrack remove all things done
			candidate.remove(candidate.size()-1);
			bool[i]=false;
		}
	}
}

