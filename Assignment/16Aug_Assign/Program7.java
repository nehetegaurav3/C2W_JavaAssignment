

class Program7 {

	public static void main(String[] args) {
	
		int num1 = 10;
		int num2 = 20;
		int num3 = 30;

		if(num1 < num2 && num1 < num3)
			System.out.println(num1 +" is Smallest");
		else if(num2 < num1 && num2 < num3)
			System.out.println(num2 +" is Smallest");
		else
			System.out.println(num3 +" is Smallest");
	}
}
