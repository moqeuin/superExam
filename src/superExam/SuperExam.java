package superExam;

public class SuperExam {
	// super 참조변수 : 부모클래스를 가리키거나 부모클래스의 생성자 가리킨다.
	public static void main(String[] args) {
		
		Child ch = new Child();
		
		ch.outPut(111, 111);
		
		/*
			매개변수 x 111 매개변수y111
			자식변수 x 40 자식변수y50
			부모변수 x 3 부모변수y4		 
		*/
	}

}
class Parent{
	int x = 4;
	int y = 5;
	public Parent(int x, int y) {
		
		this.x = x;
		this.y = y;
	}
}

class Child extends Parent{
	
	int x = 40;
	int y = 50;
	
	public Child() {
		// 부모클래스의 생성자 불러옴
		super(3, 4);
	}
	
	void outPut(int x, int y) {
		
		System.out.println("매개변수 x " + x + " 매개변수y" + y);
		System.out.println("자식변수 x " + this.x + " 자식변수y" + this.y);
		System.out.println("부모변수 x " + super.x + " 부모변수y" + super.y);
	}
}