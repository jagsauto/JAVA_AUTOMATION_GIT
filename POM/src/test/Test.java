package test;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		city ct = new city();
		ct.mycity ="London";
		//street st = new street();
		//st.mystreet="lanterns way";
		ct.st = new street();
		ct.st.mystreet= "Medals way";
		
		System.out.println(ct.st.mystreet);
	}

}
