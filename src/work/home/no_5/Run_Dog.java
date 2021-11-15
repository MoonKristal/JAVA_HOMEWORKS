package work.home.no_5;

public class Run_Dog {

	public static void main(String[] args) {
		
		Dog prince = new Dog();
		
		prince.name = "하이";
		prince.siblings = "페퍼, 브랜디";
		prince.excercise = "수영";
		prince.toy = "양말";
		prince.happinese = 5;
		
		System.out.println(prince.name + "는 " + prince.siblings + "와 함께 " + prince.excercise + "을 하거나 " 
							+ prince.toy + " 물어뜯는 놀이를 하면 행복지수가 올라갑니다." );
		prince.swim();
		System.out.println("하이의 행복지수는 " + prince.happinese + "입니다.");
		
		prince.lostToy();
		System.out.println("하이의 행복지수는 " + prince.happinese + "입니다.");
		
		
		Dog princeG_friend = new Dog();
		
		princeG_friend.name = "영이";
		princeG_friend.siblings = "철수";
		princeG_friend.toy = "솔방울";
		princeG_friend.excercise = "드라이브";
		princeG_friend.happinese = 6;
		
		System.out.println(princeG_friend.name + "는 " + princeG_friend.siblings + "와 " + princeG_friend.toy + "을 가득 챙겨 "
							+ princeG_friend.excercise + "를 가고 싶어요.");
		
		princeG_friend.drive();
		System.out.println("영이의 행복지수는 " + princeG_friend.happinese + "입니다");
		
		princeG_friend.lostToy();
		System.out.println("영이의 행복지수는 " + princeG_friend.happinese + "입니다");
		
		
		
		
	}

}
