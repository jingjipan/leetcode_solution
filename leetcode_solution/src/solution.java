import java.util.List;

public class solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GroupAnagrams s = new GroupAnagrams();
		String[] str = new String[]{"eat", "tea", "tan", "ate", "nat", "bat"};
		List<List<String>> result = s.groupAnagrams(str);
		for(List<String> ll:result){
			for(String i:ll){
				System.out.print(i);
			}
			System.out.println("\n");
		}
		//System.out.println(result.size());
	}
	
}
