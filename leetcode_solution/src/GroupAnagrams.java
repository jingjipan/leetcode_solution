import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;


public class GroupAnagrams {

	public GroupAnagrams() {
		// TODO Auto-generated constructor stub
	}
	
	/*
	 * incredible solution, my original one beats 56% and this solution beats 97.49%
	 * My original solution was to use hashmap storing a sorted string as key, and the list as value
	 * when change the key to product of primes, the answer beats 75%, which is awesome, where it avoids comparing strings as keys
	 * then I change the value of the hashmap also be integer, as the index of result list, which leads this solution to finale, incredible idea
	 * overflow of integer is still an issue here
	 */
	
	public List<List<String>> groupAnagrams(String[] strs) {
		if(strs.length==0){
			return null;
		}
		int[] prime = {2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97, 101, 103};
		int size=0;
		List<List<String>> result = new ArrayList<List<String>>();
		HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
		List<String> temp;
		for(int i=0;i<strs.length;i++){
			int key=1;
			for(char c:strs[i].toCharArray()){
				key *= prime[c - 'a'];
			}
			if(map.containsKey(key)){
				result.get(map.get(key)).add(strs[i]);
			}else{
				temp = new ArrayList<String>();
				temp.add(strs[i]);
				result.add(temp);
				map.put(key,size);
				size++;
			}
		}
		
		return result;
    }
}
