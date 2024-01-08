package week2.day2;

public class Learnmethod {

	public void browsername() {
		System.out.println("Chrome");
		
	}
	public int add(int a, int b) 
	{
		
return a+b;
}
public String regdetails(String name,int rollno)
{
	return name+ ""+rollno;
	
}

	private void cardpinnumber()
	{
		System.out.println("mypin mmber is ****");
	}
	void browserversion()
	{
		System.out.println("default modifier");
	}

	protected void name()
	{
		System.out.println("i protected my id");
	}
 public static void main(String[] args)
 {
	
 Learnmethod lm=new Learnmethod();
 System.out.println(lm.add(10, 15));
 lm.browsername();
 lm.browserversion();
 lm.cardpinnumber();
 lm.name();
 System.out.println(lm.regdetails("Vengamamba  ", 411));
 
 }
 	 
 }

