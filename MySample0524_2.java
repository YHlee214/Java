/*
 * 메서드 오버로딩
 * 
 * 메소드명()은 show
 * 실행결과) 컴퓨터 가격은 : 10000원 입니다.
 * 			제품은 : 컴퓨터 입니다.
 * 			구매한 제품은 : 컴퓨터 이며, 10000원 입니다.
 * 
 

class Computer
{
	void show(int a)
	{
		System.out.println("컴퓨터 가격은 "+a+"원 입니다.");
	}
	void show(String a)
	{
		System.out.printf("제품은 : %s 입니다.\n",a);
	}
	void show(String a, int b) // 순서대로 작성 (문자형, 정수형) 
	{
		System.out.println("구매한 제품은 : "+a+" 이며, "+b+" 입니다.");
	}
	
}

public class MySample0524_2 {

	public static void main(String[] args) 
	{
		Computer c = new Computer();
		
		c.show(10000);
		c.show("컴퓨터");
		c.show("컴퓨터",10000);

		//System.out.println(method()); 반드시 리턴 타입이 존재해야 한다.
	}

}
*/
//클래스 변수와 메서드. 인스턴스 변수와 메서드
class Member
{

	int iv = 10; //	인스턴스 변수
	static int cv = 20;	// 클래스 변수
	
	int iv2 = iv; // 인스턴스 변수여서 가능하다. 사용할려면 객체를 생성해야 가능.
	
	
	// static int cv2 = iv; ( X )   
	// Member m = new Member(); // 클래스 영역에서 객체 생성( 변수에 대입할 때만 )  ( X ) 
	//static int cv2 = m.iv; // (X)  실행하는 시점이 다르기 때문에 m.iv 생성 (X)
	// static int cv2 = new Member().iv; // 객체 생성 동시에 값을 쓰고 대입 (X)
	
	static void staticMethod1()
	{
		System.out.println(cv);
		//System.out.println(iv); ( X ) // 먼저 객체 생성을 해야 함.
		//member c = new Member(); System.out.println(c.iv);
		
	}
	void instanceMethod1()
	{
		System.out.println(cv); 
		System.out.println(iv); // 인스턴스변수 메서드 내에서 사용가능
	
	} 
		
	static void staticMethod2()
	{
		staticMethod1(); // 같은 클래스내에 있으면 Member(클래스명).xx 생략 가능
		// instanceMethod(); (X) 객체 생성후 인스턴스로 호출 해야 한다.
		Member c = new Member();
		c.instanceMethod1();
	}
	void instanceMethod2() // 어딘지 모르지만 객체가 이미 생성되있는 상태
	{
		staticMethod1();
		instanceMethod1(); 
	}
	

}

public class MySample0524_2 {

	public static void main(String[] args) 
	{
		
	}
}
//클래스 영역에 선언되며, 인스턴스를 생성할 때 만들어진다. 그래서 인스턴스 변수(iv)값을 읽어 오거나 저장하려면 먼저 인스턴스를 생성해야한다. 
// 인스턴스마다 별도의 저장공간을 가지므로 서로 다른 값을 가질 수 있다. 인스턴스 마다 고유한 상태를 유지해야하는 속성의 경우, 인스턴스 변수로 선언한다.

	