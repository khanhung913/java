package question03;

public class SystemMain03 {

	public static void main(String[] args) {
		int price=30;
		int totalPrice=300;
		int quantity=totalPrice/price;
		System.out.println("商品の購入数は"+quantity+"個です。");
		
		int newPrice=price+100;
		int changQuantity=--quantity;
		newPrice+=price;
		totalPrice=newPrice*quantity;
		System.out.println("商品の購入数は"+changQuantity+"個です。");
		System.out.println("商品の新しい値段は"+newPrice+"円に変更です。");
		System.out.println("商品の購入合計金額は"+totalPrice+"円です。");
		
		double priceIncreaseRate=1.1;
		int changePrice=(int)(newPrice*1.1);
		System.out.println("商品の元の値段は"+newPrice+"円です。");
		System.out.println("商品の値上げ後の値段は"+changePrice+"円です。");
		
	}

}
