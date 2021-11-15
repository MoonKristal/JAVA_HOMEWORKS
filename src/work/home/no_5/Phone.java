package work.home.no_5;

public class Phone {
	
	public String name;
	public String cases;
	public String color;
	public String backgroundImage;
	public int brightness;
	
	public void up() {
		if(brightness < 100) {
			brightness+=5;
		}
	}
	
	public void down() {
		if(brightness > 0) {
			brightness-=5;
		}
	}
	
	
	
	
	
	
}
