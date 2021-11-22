package work.home.no_12;

public class Practice12 {

	double num1 = 13.44;
	double num2 = 2.44;
	
	public void method1() {
		
		// Math.round	
		System.out.println("이건 말도안돼 !!(+) : " + (num1 + num2)); // 15.8799.....
		double num3 = Math.round((num1+num2)*100.0)/100.0;
		System.out.println("어라 이런방법이? : " + num3); // 15.88
		
		System.out.println("이건 말도안돼 !!(-) : " + (num1 - num2)); // 11.0
		double num4 = Math.round((num1-num2)*100)/100.0;
		System.out.println("어라 이런방법이? : " + num4); // 11.0
		
		System.out.println("이건 말도안돼 !!(*) : " + (num1 * num2)); // 32.7936
		double num5 = Math.round((num1*num2)*100)/100.0;
		System.out.println("어라 이런방법이? : " + num5); // 32.79
		
		System.out.println("이건 말도안돼 !!(/) : " + (num1 / num2)); // 5.50819.....
		double num6 = Math.round((num1/num2)*100)/100.0;
		System.out.println("어라 이런방법이? : " + num6); // 5.51
	
	
		System.out.println("----------------------");
	
	}
}
