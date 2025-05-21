package question05;

public class SmartPhone
		extends Telephone {
	private double internetSpeed;

	@Override
	public void showInfo() {
		super.showInfo();
		System.out.println("SmartPhoneクラスで格納されている通信速度は" + this.internetSpeed + "Mbpsです。");
	}

	public double getInternetSpeed() {
		return internetSpeed;
	}

	public void setInternetSpeed(double internetSpeed) {
		this.internetSpeed = internetSpeed;
	}

}
