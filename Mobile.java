package seleniumAssignment;

public class Mobile {

     public void makecall() {
		
		String mobilemodel= "S21";
		float mobileweghit=238.2f;
		
		System.out.println("what is the mobile model? ");
		System.out.println(mobilemodel);
		
		System.out.println("what is the mobileweghit? ");
		System.out.println(mobileweghit);
		
		
	}
	
	
	public void sendSms() {
		
		boolean isfullcharged=true;
		int mobilecost=4500;
		System.out.println("it is fully charged?" );
		System.out.println(isfullcharged);
		System.out.println("what is the cost? "+mobilecost);
		

	}
	
	
	
	
	
	
	
	public static void main(String[] args) {
		
		Mobile mob = new Mobile();
		
		mob.makecall();
		mob.sendSms();
		
	
		
	}

	
	
	
	
}
