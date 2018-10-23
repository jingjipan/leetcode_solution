
public class MaximumSubArray {

	public MaximumSubArray() {
		// TODO Auto-generated constructor stub
	}
	
	//beats 99.92%, but solutions are too similar O(n) complexity
	public int maxSubArray(int[] nums) {
	    int max = Integer.MIN_VALUE, sum = 0;
	    for (int i:nums) {
	        if (sum < 0) {
	            sum = i;
	        }
	        else {
	            sum += i;
	        }
	        if (sum > max)
	            max = sum;
	    }
	    return max;
	}
}
