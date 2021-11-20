package work.home.no_10;

public class AnimalManager {

	public static void main(String[] args) {
		
		Animal[] ani = new Animal[5];
		
		for(int i = 0; i < ani.length; i++) {
			if((int)(Math.random()*2)+1 == 1) {
				ani[i] = new Dog("폼폼이","푸들",10);
			}else{
				ani[i] = new Cat("고냥이","냥냥이","집","턱시도");
			}
		}
		
		
		for(int j = 0; j < ani.length; j++) {
			ani[j].speak();
		}
	
		
	}
	
	
}
