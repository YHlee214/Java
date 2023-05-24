/* 메서드 오버로딩
출력예) 1
	  13	// (5, 8)
	  2
	  12 	//(5, 7.1)
	  3
	  12	//(7.1, 5)
	  4
	  12.3 	//(7.1, 5.2)
	  5
	  210

class MyMath2 
{
	int a;
	int b;
	int cnt=0; 
	
	int add(int a, int b) //타입을 다르게 정의한다.
	{
		System.out.println(++cnt);
		return a + b;
	}
	
	int add(int a, double b)
	{
		System.out.println(++cnt);
		return (int) (a + b);
	}
	
	int add(double a, int b)
	{
		System.out.println(++cnt);
		return (int) ( a + b);
	}
	
	double add(double a, double b)
	{
		System.out.println(++cnt);
		return a + b;
	}
	
	int add(int[] x) //배열에 시작 주소 값, 
	{
		System.out.println(++cnt);
		int sum = 0;
		for(int i=0; i<x.length; i++)
		{
			sum += x[i];
		}
		return sum;
	}
}


public class MySample0524 {

	public static void main(String[] args) {
	
	int[] a = new int[] {10,20,30,40,50,60};
	MyMath2 m = new MyMath2();
	
	System.out.println(m.add(5,8)); //인수가 있으면 무조건 반환값 필요
	System.out.println(m.add(5,7.1)); // 
	System.out.println(m.add(7.1,5));
	System.out.println(m.add(7.1,5.2));
	System.out.println(m.add(a));
	
	}
}

*/
