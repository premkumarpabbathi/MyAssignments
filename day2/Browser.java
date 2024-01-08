package week2.day2;

public class Browser {
	
    public string launchbrowser(string browsername)
    {
    	return browsername;
    	
    }
    public void loadurl() {
    	System.out.println("application url loaded succssfully");
    }
    public static void main(String[] args) {
		browser chrome=new browser();
		System.out.println(Chrome.launchbrowser("c")+ "+" browser launched successfuly");
		
	}
}
