package work.home.no_11;

public class Run {
	public static void main(String[] args) {
		
		PhoneController pc = new PhoneController();
		
		for(int i = 0; i < pc.method().length; i++) {
			System.out.println(pc.method()[i]);
			System.out.println();
		}
		
	}

}
