package question05;

public class Telephone {
	protected String phoneNumber;
	protected int fee;

	public void showInfo() {
		System.out.println("Telephoneクラスで格納されている電話番号は"+this.phoneNumber+"で、料金は"+this.fee+"円です。");
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public int getFee() {
		return fee;
	}

	public void setFee(int fee) {
		this.fee = fee;
	}

}
