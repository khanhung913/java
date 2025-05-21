package lession19;

public class Sample1901 {

	public static void main(String[] args) {
		String mailAddress = "hanako@example.com";
		String userName = mailAddress.substring(0, mailAddress.indexOf("@"));
		String text= mailAddress.substring(mailAddress.indexOf("@"),mailAddress.length());
		System.out.println(userName);
		System.out.println(text);

	}

}
