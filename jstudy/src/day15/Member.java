package day15;

public class Member {
	private String name,  birth;
	private String gName = "ASDF";
	
	private String[] arr; //멤버의 이름들을 기억하는 배열
	
	public Member(){
		gName = "QWER";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getgName() {
		return gName;
	}

	public void setgName(String gName) {
		this.gName = gName;
	}

	public String getBirth() {
		return birth;
	}

	public void setBirth(String birth) {
		this.birth = birth;
	}

	public String[] getArr() {
		return arr;
	}
	public void setArr(Test04 t) {
		arr = new String[t.cnt];
	}

	public void setArr(String[] arr) {
		this.arr = arr;
	}
}
