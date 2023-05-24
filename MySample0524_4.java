//생성자 예제 1 , 2 
// 인스턴스 변수를 초기화 하기 위해 사용

class Car // 예제2
{
	String color;
	String gearType;
	int door;	

	// 코드의 중복성 제거 
	Car() // 메서드 기능과 유사하다. 생성자 호출도 가능
	{
//		this.color ="white";
//		this.gearType = "auto";
//		this.door = 3;
		this("white","auto",4);
		System.out.println("매개변수 없음");
	}
	Car(String color)
	{
//		this.color = color;
//		this.gearType = "auto";
//		this.door = 4;
		this(color,"auto",4);
		System.out.println("매개변수 1개 color.");
	}

	Car(String color, String gearType)
	{
//		this.color = color;
//		this.gearType = gearType;
//		this.door = 2; // 인스턴스변수, 지역변수를 구분하려고 this.를 쓴다. 
		
		this(color,gearType,4); // this(); : 생성자에서 다른 생성자를 호출 (* 반드시 첫번째 줄에 와야 한다.)
		System.out.println("매개변수 2개 color, gearType");
	}
	
	
	Car(String color, String gearType, int door) // * 최종적으로 호출받는 생성자 
	{
		System.out.println("매개변수 3개 최종.");
		this.color = color; // 인스턴스 변수는 this.인스턴스명 표현한다.
		this.gearType = gearType;
		this.door = door;
	}

}

/*	예제1
	class Car
	{
	String color;
	String gearType;
	int door;
	
	
	Car()
	{
		
	}
	
	Car(String c, String g, int d)
	{
		color = c;
		gearType = g;
		door = d;
	}


}
*/
public class MySample0524_4 {

	public static void main(String[] args) 
	{		
			
	/*예제1	Car c1 = new Car();
		c1.color = "white";
		c1.gearType = "auto";
		c1.door = 4;
		
		Car c2 = new Car("blue","auto",2);
		
		System.out.println("c1의 color= " +c1.color+", gearType = "+c1.gearType+", door = "+c1.door);
		System.out.println("c2의 color= " +c2.color+", gearType = "+c2.gearType+", door = "+c2.door);
	*/
	
	//예제 2 
		System.out.println("main 시작 c1 생성"); 
		Car c1 =new Car();	//객체 생성, 생성자 호출
		System.out.println("main 시작 c2 생성");
		Car c2 =new Car("blue");
		System.out.println("main 시작 c3 생성");
		Car c3 =new Car("blue","auto");
		System.out.println("main 시작 c4 생성");
		Car c4 =new Car("blue","auto",4);	
		
		
		System.out.println("c1의 color= " +c1.color+", gearType = "+c1.gearType+", door = "+c1.door);
		System.out.println("c2의 color= " +c2.color+", gearType = "+c2.gearType+", door = "+c2.door);
		System.out.println("c2의 color= " +c3.color+", gearType = "+c3.gearType+", door = "+c3.door);
		System.out.println("c2의 color= " +c4.color+", gearType = "+c4.gearType+", door = "+c4.door);
		
	}

}
