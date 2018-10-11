import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
public class combinationsum {
	public combinationsum(){
		
	}
	
	public List<List<Integer>> combinationSum(int[] candidates, int target) {
		List<List<Integer>> result = new LinkedList<List<Integer>>();
		Arrays.sort(candidates);
		List<Integer> temp=	new LinkedList<Integer>();
		combinationSumHelper(candidates,target,temp,0,result,0);
		return result;
    }
	
	public void combinationSumHelper(int[] candidates, int target, List<Integer> candidate, int sum, List<List<Integer>> result,int index) {
		if(sum>target){
			return;
		}else if(sum==target){
			result.add(candidate);
			return;
		}
		
		for(int i=index;i<candidates.length;i++){
			
			try {
				List<Integer> temp = deepCopy(candidate);
				temp.add(candidates[i]);
				combinationSumHelper(candidates, target, temp, sum+candidates[i], result,i);
				
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
		
	}
	
	
	public boolean test(List<List<Integer>> l){
		for(List<Integer> list: l){
			for(Integer i:list){
				System.out.print(i+" ");
			}
			System.out.print("\n");
		}
		return false;
	}
	
	public <T> List<T> deepCopy(List<T> src) throws IOException, ClassNotFoundException {  
	    ByteArrayOutputStream byteOut = new ByteArrayOutputStream();  
	    ObjectOutputStream out = new ObjectOutputStream(byteOut);  
	    out.writeObject(src);  
	  
	    ByteArrayInputStream byteIn = new ByteArrayInputStream(byteOut.toByteArray());  
	    ObjectInputStream in = new ObjectInputStream(byteIn);  
	    @SuppressWarnings("unchecked")  
	    List<T> dest = (List<T>) in.readObject();  
	    return dest;  
	}  
}
