package work.home.no_6;

public class Run {

	public static void main(String[] args) {

		Employee e = new Employee();
		e.setEmpNo(100);
		e.setEmpName("홍길동");
		e.setDept("영업부");
		e.setJob("과장");
		e.setAge(25);
		e.setGender('남');
		e.setSalary(2500000);
		e.setBonusPoint(0.05);
		e.setPhone("010-1234-5678");
		e.setAddress("서울시 강남구");
		
		System.out.println("직원번호 : " + e.getEmpNo());
		System.out.println("직원이름 : " + e.getEmpName());
		System.out.println("담당부서 : " + e.getDept());
		System.out.println("직함 : " + e.getJob());
		System.out.println("나이 : " + e.getAge());
		System.out.println("성별 : " + e.getGender());
		System.out.println("월급 : " + e.getSalary());
		System.out.println("보너스 : " + e.getBonusPoint());
		System.out.println("전화번호 : " + e.getPhone());
		System.out.print("주소 : " + e.getAddress());
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
