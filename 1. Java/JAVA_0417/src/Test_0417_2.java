
class Women_IT{
	public String name;
	public String gender;
	public boolean student;
	
	Women_IT(String name, boolean student){
		this.name = name;
		this.gender = "여성";
		this.student = student;
	}
	
	public void Print() {
		System.out.println(name);
		System.out.println(gender);
	}
	
	public void Student(boolean student) {
		if(student == true) {
			System.out.println("학생");
		}
		else {
			System.out.println("교사");
		}
	}
}

public class Test_0417_2 {
	
	public static void main(String[] args) { 
		// * Women_IT 클래스 매개변수
		// - name(이름)
		// - gender(성별)
		//	 클래스 변수로 선언하고, "여성"으로 초기화
		// - student(학생이면 True, 아니라면 False)
		
		// * 객체 생성
		// - 자기 자신에 대한 객체
		// - 옆사람에 대한 객체
		// - 저에 대한 객체("이유나", False)
		
		// * 아래의 메소드를 생성하여 각 객체에 대해 출력하라.
		// - Print() :: 이름과 성별 출력하는 메소드
		// - Student(boolean) :: 학생인지 교사인지를 출력하는 메소드
		
		Women_IT w1 = new Women_IT("김상아", true);
		Women_IT w2 = new Women_IT("이유나", false);
		
		w1.Print();
		w1.Student(true);
		w2.Print();
		w2.Student(false);
	}

}
