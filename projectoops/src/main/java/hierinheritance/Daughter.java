package hierinheritance;

public class Daughter extends Father
{
	public void art()
	{
		System.out.println("Good");
	}

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Daughter d = new Daughter();
		d.sing();
		d.art();

	}

}
