
public class ArmStrong_No {
	public static void main(String[] args) {
		
		int OrgNo=148;
		int sum=0;
		
		
		for(int i=OrgNo;i>0;i=i/10) {
			int rem = i%10;
			 sum = sum+(rem*rem*rem);	
		}
		if(sum==OrgNo) {
			System.out.println("given number "+OrgNo+" is ArmStrong no");
		}
		else {
			System.out.println("given number "+OrgNo+" is not ArmStrong no");
		}
		
	}

}
