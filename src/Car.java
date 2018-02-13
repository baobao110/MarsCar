
public class Car {
	private Point point;
	public Car(String name){
		E a=new E(name);
	}
	public Car(){
		E a=new E();
	}
	public Car(String name,Point point){
		this.point=point;
		E a=new E(name,point);
	}
	public void move(String a){
		E.Move(a);
	}
	
}
