

public class MyPow {

	public MyPow() {
		// TODO Auto-generated constructor stub
	}
	
	//divide and conquer && beats 99.95% in the first trial
	//the idea is to break down power into products of different powers
	//x^10 = (x^2^2^2)*(x^2) four calculations can solve this problem instead of 10
	public double myPow(double x, int n) {
		if(n==0)
			return 1;
		return myPowHelper(x,n,0);
    }
	
	public double myPowHelper(double x, int n, int power){
		///deal with positive powers
		if(n>=2){
			return myPowHelper(x, n/2, power+1)*myPowHelper(x, n%2, power);
		}else if(n==1){
			double result=x;
			for(int count=0;count<power;count++){
				result*=result;
			}
			return result;
		///deal with negative powers	
		}else if(n<=-2){
			return myPowHelper(x, n/2, power+1)*myPowHelper(x, n%2, power);
		}else if(n==-1){
			double result=x;
			for(int count=0;count<power;count++){
				result*=result;
			}
			return 1/result;
		}
		///return 1 if there is nothing to be added on
		else{
			return 1;
		}
	}
}
