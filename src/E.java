
public class E extends Point{
	private static final E1 a=new E1();
	private static final E2 b=new E2();
	private static final E3 c=new E3();
	private static final E4 d=new E4();
	String name;
	static Point point;
	public E(String name, Point point) {
		this.name = name;
		this.point = point;
	}
	public E(String name) {
		this.name = name;
		point =new Point();
	}
	public E() {
		point=new Point();
	}
	public static void Move(String x){
		String[] y=x.split(",");
		for(String i:y)
			move(i);
	}
	public static void move(String x){
		if(x.equals("w"))
		a.move(point);
		if(x.equals("a"))
			b.move(point);
		if(x.equals("s"))
			c.move(point);
		if(x.equals("d"))
			d.move(point);
		System.out.println(point.getX()+","+point.getY());
	}	
	
}
