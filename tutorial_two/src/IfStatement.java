
public class IfStatement {

	public static void main(String[] args) {
		IfStatement myCond = new IfStatement();
		
//		int myInt = 20;
//		
//		if(myInt < 10) {
//			System.out.println("Yes, true!");
//		}
//		else if(myInt > 30) {
//			System.out.println("No, false");
//		}
//		else {
//			System.out.println("It's between 10 and 30");
//		}
		
		myCond.whileLoop( 5 );
	}
	
	public void whileLoop(int num) {
		int loop = num;
		
		while(loop < 5) {
			System.out.printf("Loop: %d", loop);
			
			if(loop == 5) {
				break;
			}
			
			loop++;
			
			System.out.println("Running");
		}
		
	}

}
