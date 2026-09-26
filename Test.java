

class Test
{
	public void m1()
	{
		int x = 10;
		class Inner
		{
			public void m2()
			{
				System.out.println("x = "+x);
			}
		}
		Inner i = new Inner();
		i.m2();
	}
	public static void main(String args[])
	{
		Test t = new Test();
		t.m1();
	}
}



/*
11.
class Test
{
	int x = 10;
	static int y = 20;
	public void m1()
	{
		class Inner
		{
			public void m2()
			{
				System.out.println("x = "+x);
				System.out.println("y = "+y);
			}
		}
		Inner i = new Inner();
		i.m2();
	}
	public static void main(String args[])
	{
		Test t = new Test();
		t.m1();
	}
}
dJava>javac Test.java

dJava>java Test
x = 10
y = 20

class Test
{
	int x = 10;
	static int y = 20;
	public static void m1()
	{
		class Inner
		{
			public void m2()
			{
				System.out.println("x = "+x); 	>javac Test.java
													Test.java:16: error: non-static variable x cannot be referenced from a static context
																					System.out.println("x = "+x);
																											  ^
													1 error
				System.out.println("y = "+y);		
													dJava>javac Test.java

													dJava>java Test
													y = 20
			}
		}
		Inner i = new Inner();
		i.m2();
	}
	public static void main(String args[])
	{
		Test t = new Test();
		t.m1();
	}
}

10.
class Test
{
	public void m1()
	{
		class Inner
		{
			public void sum(int a, int b)
			{
				System.out.println("The sum is "+(a+b));
			}
		}
		Inner i = new Inner();
		i.sum(10,20);
		i.sum(100,200);
		i.sum(1000,2000);
	}
	public static void main(String args[])
	{
		Test t = new Test();
		t.m1();
	}
}
dJava>javac Test.java

dJava>java Test
The sum is 30
The sum is 300
The sum is 3000


9.

class A
{
	class B
	{
		class C
		{
			public void m1()
			{
				System.out.println("Inside inner class C");
			}
		}
	}
}
class Test
{
	public static void main(String args[])
	{
		A a = new A();
		A.B b = a.new B();
		A.B.C c = b.new C();
		c.m1();
	}
}
dJava>javac Test.java

dJava>java Test
Inside inner class C

*/