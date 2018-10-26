

public class JumpGame {

	public JumpGame() {
		// TODO Auto-generated constructor stub
	}
	
	//incredible brief answer, initially I used dfs&&dp, but it is too slow
	//then I found this, max will keep track the furthest index that you can reach
	//really cool, beats 90.29%
	public boolean canJump(int[] A) {
	    int max = 0;
	    for(int i=0;i<A.length&&max<A.length-1;i++){
	        if(i>max)
                return false;
	        max = A[i]+i>max?A[i]+i:max;
	    }
	    return true;
	}
}
