package JavaOopsAssignment;

public class Singleton {
     

	private static Singleton sData;
	
    public void singletonMethod() {
		System.out.println("This is Singleton");
	}
	
	
	public static Singleton getInstance() {
		if(sData == null) {
			sData = new Singleton();
		}
		return sData;
	}
}
