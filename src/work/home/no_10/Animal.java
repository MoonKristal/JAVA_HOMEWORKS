package work.home.no_10;

public abstract class Animal {
	
	private String name;
	private String kinds;
	
	protected Animal() {
		
	}

	protected Animal(String name, String kinds) {
		super();
		this.name = name;
		this.kinds = kinds;
	}
	
	public String toString() {
		return "name : " + name + " kinds : " + kinds;
	}
	
	public abstract void speak();
	
}
