package work.home.no_8;

public class StudentMenu {

	private StudentController ssm = new StudentController();
	
	public StudentMenu() {
		
		System.out.println("=====학생 정보 출력=====");
		for(int i = 0; i < ssm.getsArr().length; i++) {
			System.out.println(ssm.getsArr()[i].inform());
		}
		ssm.printStudent();
		System.out.println("=====학생 성적 출력=====");
		double[] dArr = ssm.avgScore();
		System.out.println("학생 점수 합계 : " + dArr[0]);
		System.out.println("학생 점수 합계 : " + dArr[1]);
		System.out.println("=====성적 결과 출력======");
		
		for(int i = 0; i < ssm.getsArr().length; i++) {
			if(ssm.getsArr()[i].getScore() < 60) {
				System.out.println(ssm.getsArr()[i].getName()+"는 통과입니다.");
			}else {
				System.out.println(ssm.getsArr()[i].getName()+"는 재시험 대상입니다.");
			}
		}
		
		
	}

	
	
	

}
