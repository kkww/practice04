package prob05;

public class MyBase extends Base {
	@Override
	public void service(String state) {
		if(state.equals("오후")) {
			day();
		} else if(state.equals("낮")) {
			afternoon();
		} else {
			super.service(state);
		}
	}
	
	@Override
	public void day() {
		System.out.println("낮에는 열심히 일하자!");
	}
	
	public void afternoon() {
		System.out.println("오후도 찾과 마찬가지로 일해야 합니다.");
	}
}
