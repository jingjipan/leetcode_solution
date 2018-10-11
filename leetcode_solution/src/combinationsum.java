import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class combinationsum {
	public combinationsum(){
		
	}
	///pruning & depth first search, beat 75.11%
	public List<List<Integer>> combinationSum(int[] candidates, int target) {
		List<List<Integer>> result = new ArrayList<List<Integer>>();
		Arrays.sort(candidates);
		List<Integer> temp=	new ArrayList<Integer>();
		combinationSumHelper(candidates,target,temp,0,result,0);
		return result;
    }
	
	public void combinationSumHelper(int[] candidates, int target, List<Integer> candidate, int sum, List<List<Integer>> result,int index) {
		///stop branching if one combination is found or the current branch exceeds the target value
		///branch start from the given index to avoid duplicate trials 
		for(int i=index;i<candidates.length;i++){
			if(sum+candidates[i]<target){
				List<Integer> temp = new ArrayList<Integer>();
				temp.addAll(candidate);
				temp.add(candidates[i]);
				combinationSumHelper(candidates, target, temp, sum+candidates[i], result,i);
			}else if(sum+candidates[i]==target){
				candidate.add(candidates[i]);
				result.add(candidate);
				return;
			}else{
				return;
			}
		}
	}
}
