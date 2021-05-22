package checkConnection;

public class Loopcheck {
	

		

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for (int i = 0; i <= 5; i++) {
			System.out.println("Runnning in outer loop till " + i + " times");
			//System.out.println(10 % 5);
			
			
			
			int counter = 1;
			int usercountsize = 11;
			System.out.println("counter value outside inner loop"+counter);
			
			for (int j = 0; j <= 10; j++) {
				
				if(counter == 10 && usercountsize < 10) {
					
					System.out.println("Since i reached the value of " + counter + "  ------I have clicked on next pagination tab--------");
					counter = 1;
									
				}
				
				
				
				System.out.println("Value of counter is : " + counter);
				System.out.println("I am runnning in inner loop till " + j + " times");
				counter ++;
						
			}
			
			System.out.println();
			
			System.out.println("---------------------------");
			System.out.println();
				
		}
		
		
	
	}

}
