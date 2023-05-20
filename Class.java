/* 소스코드 실습 : 인스턴스 변수, 클래스 변수, 지역 변수 */
	
//객체 : 모든 인스턴스를 대표하는 일반적 용어
//인스턴스 : 특정 클래스로부터 생성된 객체

	public class Class { // 객체 설계도 클래스를 선언합니다. 객체를 정의하고 생성하는데 사용합니다.
		
		int iv; 
		// * 인스턴스 변수 : 클래스에 인스턴스를 먼저 생성해야 인스턴스 변수의 값을 저장하거나 읽을 수 있습니다.
		// 각 인스턴스 마다 독립적인 저장공간을 가지고 있어 서로 다른 값을 가질 수 있습니다.
		
		static int cv;
		// * 클래스 변수 : 클래스 전체에서 사용가능하고 변수 선언 시 맨앞에 static을 붙여줍니다.
		//  모든 인스턴스가 같은 저장공간을 공유하고 있으므로 변수 값을 공유합니다.

		void methodA() /* 메서드 : 어떤 특정한 기능을 수행하기 위한 명령문의 집합입니다. */
		{
		
			int lv = 5; 
			// * 지역변수 : 메서드 괄호 내에서만 선언되고 사용 할 수 있는 변수입니다.
			// 메서드가 실행될 때 메모리를 할당 받아 사용할 수 있고 메서드가 끝나면 소멸되어 사용할 수 없게 됩니다.
		
			System.out.println("methodA() lv : "+lv); // 지역변수 값을 출력합니다.
		
		}
		
		public static void main(String[] args)
		{ 
		
			Class a = new Class(); // 인스턴스 생성 -> 클래스명 인스턴스명 = new 클래스명(); 
			Class b = new Class(); 
			Class c = new Class(); 
			//인스턴스 변수 사용을 위해 인스턴스 a,b,c를 생성합니다. 
			//클래스로부터 객체가 생성하고 메모리에 할당받았을 때를 '인스턴스'라고 합니다.
		
			a.methodA(); 
			b.methodA();
			c.methodA();
			//각각의 인스턴스로 메서드를 호출해서 사용합니다.
			
			a.iv = 10;
			b.iv = 20;
			c.iv = 30; 
			//각각의 인스턴스에 인스턴스 변수 값들을 대입합니다.
			
			System.out.println("a.iv :"+ a.iv +" ,b.iv : "+ b.iv + " , c.iv : "+c.iv);
			// 인스턴스 a,b,c 모두 저장장소가 다르므로 각각의 고유한 변수 값들이 출력됩니다.  
			
			a.cv = 11;
			b.cv = 22;
			c.cv = 33;  
			System.out.println("1a.cv :"+ a.cv +" ,b.cv : "+ b.cv + " , c.cv : "+c.cv);
			// 클래스 변수 값은 모든 인스턴스의 공통된 값이므로 마지막으로 덮어쓴 값이 출력됩니다.
			
			System.out.println(Class.cv); // 클래스 변수 값을 출력합니다.
			
			Class.cv = 55; // 클래스 변수 값을 다시 덮어쓰기합니다.
			System.out.println("2a.cv :"+ a.cv +" ,b.cv : "+ b.cv + " , c.cv : "+c.cv);
			// 덮어쓴 공통된 클래스 변수 값을 출력합니다.
		
		} 

	}

	

