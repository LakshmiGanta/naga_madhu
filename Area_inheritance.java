package revature_programs;

 class Area {
	
	int a,b,h;
	
	public void calarea(int a,int b,int h) {
		System.out.println(((a+b)/2)*h);
				
	}
	public void calarea(int a,int b){
		System.out.println(a*b);
	}
}

class Rectangle extends Area{}
class Square extends Area{
	public  void calarea(int a) {
		System.out.println(a*a);
	}
}
class Trapezium extends Area{}

class Area_inheritance{
	
	public static void main(String[] args) {
		Rectangle obj = new Rectangle();
		obj.calarea(10, 20);
		Square obj1 = new Square();
		obj1.calarea(20);
		Trapezium obj2 = new Trapezium();
		obj2.calarea(2, 10, 3);
		
	}
}


 
