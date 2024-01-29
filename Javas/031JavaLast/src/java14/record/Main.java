package java14.record;

public class Main {

	public static void main(String[] args) {
		PhoneNumber pn = new PhoneNumber(null, null, 23);
		System.out.println(pn);
		System.out.println(pn.areaCode());
	}

}
