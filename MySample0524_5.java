// 생성자를 이용한 인스턴스 복사


// 코드의 중복성을 제거
class Car1
{
	String color;
	String gearType;
	int door;

	Car1()
	{
		// this.color = "white";
		// this.gearType = "auto";
		//this.door = 6;
		this("white","auto",4);
	}

	Car1(Car1 c) // (클래스 타입 c) 메인메소드에서 객체 생성할 때 인스턴스명을 넘길 예정이다.
	{

		this(c.color, c.gearType, c.door);
//		this.color = c.color;		
//		this.gearType = c.gearType;		
//		this.door = c.door;		
	}
	
	Car1(String color, String gearType, int door) // 호출 기준
	{
		this.color = color;
		this.gearType = gearType;
		this.door = door;
	
}

}

public class MySample0524_5 {

	public static void main(String[] args) 
	{
		Car1 c1 = new Car1();
		Car1 c2 = new Car1(c1); // 인수값 c1을 전달 (c1의 시작 주소를 가져와 읽기만 한다.) 
		
		System.out.println("c1 color = "+c1.color +", gearType ="+c1.gearType + ", door = " +c1.door);
		System.out.println("c2 color = "+c2.color +", gearType ="+c2.gearType + ", door = " +c2.door);
	}

}
