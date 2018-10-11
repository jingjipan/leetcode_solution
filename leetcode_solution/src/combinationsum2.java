import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class combinationsum2 {
	public combinationsum2(){
		
	}
	
	public List<List<Integer>> combinationSum2(int[] candidates, int target) {
		List<List<Integer>> result = new ArrayList<List<Integer>>();
		Arrays.sort(candidates);
		List<Integer> temp=	new ArrayList<Integer>();
		combinationSumHelper(candidates,target,temp,0,result,-1);
		return result;
    }
	
	///pruning&dfs beat 71.87%
	public void combinationSumHelper(int[] candidates, int target, List<Integer> candidate, int sum, List<List<Integer>> result,int index) {
		///everything is similar to combinationsum
		for(int i=index+1;i<candidates.length;i++){
			///when there is a duplicate we dont want that like. however we want duplicate numbers in a single solution
			//"i>index+1" helps add the duplicate number into one solution
			if(i>index+1&&candidates[i]==candidates[i-1]){
				continue;
			}
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
	
	public void test(List<List<Integer>> result){
		for(List<Integer> list:result){
			for(Integer i:list){
				System.out.print(i+" ");
			}
			System.out.print("\n");
		}
	}
}