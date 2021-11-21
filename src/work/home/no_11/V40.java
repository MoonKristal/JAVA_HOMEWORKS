package work.home.no_11;

public class V40 extends SmartPhone implements NotePen {
	
	public V40() {
		super.setMaker("LG");
	}
	
	public String makeCall() {
		return "번호를 누르고 통화버튼을 누름";
	}
	
	public String takeCall() {
		return "1200만 듀얼 카메라";
	}
	
	public String picture() {
		return "1200, 1600만 트리플 카메라";
	}
	
	public String charge() {
		return "고속 충전, 고속 무선 충전";
	}
	
	public String touch() {
		return "정전식";
	}
	
	public boolean bluetoothPen() {
		return !(NotePen.PEN_BUTTON);
	}
	
	@Override
	public String printlnformation() {
		return "V40는 " + super.getMaker() + "에서 만들어 졌고 재원은 다음과 같다. \n" + makeCall() + "\n" 
				+ takeCall() + "\n" + picture() + "\n" + charge() + "\n" + touch() + "\n블루투스 펜 탑재 여부 :" + bluetoothPen();
	}

	
}
