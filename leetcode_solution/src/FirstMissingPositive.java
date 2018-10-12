
public class FirstMissingPositive {
	public FirstMissingPositive(){
		
	}
	
	public int firstMissingPositive(int[] nums) {
		int len = nums.length;
		if(len==0)
			return 1;
        int i=0;
		while(i<len){
			if(nums[i]>0&&nums[i]<len&&nums[i]!=nums[nums[i]-1]){
				swap(nums,i,nums[i]-1);
			}else{
				i++;
			}
		}
		i=0;
		while(i<len&&i+1==nums[i]){
			i++;
		}
		return i+1;
    }
	
	public void swap(int[] nums,int i, int j){
		int temp=nums[i];
		nums[i]=nums[j];
		nums[j]=temp;
	}
}
