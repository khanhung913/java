package lession22;

public class Dog2201 implements BarkingAnimal2201,FourLeggedAnimal2201 {

	@Override
	public void walk() {
		System.out.println("犬は歩きました");
		
	}

	@Override
	public void bark() {
		System.out.println("ワンワン");
		
	}

}
