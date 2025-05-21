package question09;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SystemMain09 {

	public static void main(String[] args) {

		//(1)
		List<String> thingsToBuyList = new ArrayList<String>();
		thingsToBuyList.add("牛乳");
		thingsToBuyList.add("卵");
		thingsToBuyList.add("パン");

		//(2)
		thingsToBuyList.remove("卵");

		//(3)
		System.out.println(thingsToBuyList.get(1) + "が次に買うものです。");

		//(4)
		Map<Integer, String> colorMap = new HashMap<Integer, String>();
		colorMap.put(1, "赤");
		colorMap.put(2, "青");
		colorMap.put(3, "黄");
		colorMap.remove(2);
		System.out.println("colorMapの要素の数は" + colorMap.size() + "個です。");
		colorMap.clear();
		System.out.println("colorMap の要素が空かどうかの判定は[" + colorMap.isEmpty() + "]です。");

	}

}
