
public class hart_pattern2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=0;i<=7;i++) {
			for(int j=0;j<=10;j++) {
				if((i==0 && j%5!=0)||(i==1 && j%5==0)||(i==2 && j%10==0)||(i-j==2)||(i+j==12) ) 
					System.out.print("* ");
				else {
					System.out.print("  ");
			
				}
			}
			System.out.println();
		}
	}

}
