import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class Permute2 {
	public Permute2(){
		
	}
	//beats 81.53% used backtrack
	public List<List<Integer>> permuteUnique(int[] nums) {
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
			//check if the number is used and if it is a duplicate answer
			if(bool[i]||i>0&&nums[i]==nums[i-1]&&!bool[i-1])
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