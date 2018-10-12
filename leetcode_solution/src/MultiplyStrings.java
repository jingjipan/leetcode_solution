
public class MultiplyStrings {

	public MultiplyStrings() {
		// TODO Auto-generated constructor stub
	}
	
	///NO.43 beat 99.08%. there is a faster way to do it, which is apply to fast fourier transform.
	///However it is too hard to do that. 
	public String multiply(String num1, String num2) {
        if(num1.equals("0")||num2.equals("0"))
        	return "0";
        char[] a = num1.toCharArray();
        char[] b = num2.toCharArray();
        int lena=a.length;
        int lenb=b.length;
        int[] result = new int[lena+lenb+1];
		int lenr=result.length;
		StringBuilder sb = new StringBuilder();
		int carry=0;
		for(int i=lena-1;i>-1;i--){
			carry=0;
			for(int j=lenb-1, k=lenr-(lena-i);j>-1;j--,k--){
				int temp=(a[i]-48)*(b[j]-48)+(result[k])+carry;
				result[k]=temp%10;
				carry=temp/10;
			}
			if(carry!=0){
				result[lenr-(lena-i)-(lenb)]=carry;
			}
		}
		int i=0;
		while(result[i]==0)i++;
		for(;i<lenr;i++){
			sb.append(result[i]);
		}
        return sb.toString();
    }

}
