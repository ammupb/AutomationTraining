package singleinheritance;

public class Cheetah extends Animal
{
    void speed()
    {
    	System.out.println("120 Kmph");
    }
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Cheetah c = new Cheetah();
		c.running();
		c.speed();	
	}

}
