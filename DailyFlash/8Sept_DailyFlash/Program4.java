

class Program4 {

	public static void main(String[] args) {
	
		int num = 7;
		
		for(int i = 1; i <= 4; i++) {
		
			for(int j = 1; j <= i; j++) {
			
				System.out.print(num-- +" ");
			}
			num = num + i - 1;
			System.out.println();
		}	
	}
}
