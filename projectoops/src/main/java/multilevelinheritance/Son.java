package multilevelinheritance;

public class Son extends Father
{
	public void draw()
	{
		System.out.println("Moderate");
	}

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Son s = new Son();
		s.sing();
		s.dance();
		s.draw();

	}

}
