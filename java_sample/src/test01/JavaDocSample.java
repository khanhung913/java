package test01;

/** 
* JavadocのHTMLドキュメント作成のサンプル用 
* @author Tokyo-ITSchool 
*/
public class JavaDocSample {
	/** フィールドAの情報 */
	private int fieldA;

	/** 
	* フィールドAの取得 
	* 
	* @return フィールドAの値 
	*/
	public int getFieldA() {
		return fieldA;
	}

	/** 
	* フィールドAの設定 
	* 
	* @param fieldA フィールドAに代入したい値 
	*/
	public void setFieldA(int fieldA) {
		this.fieldA = fieldA;
	}

	/** 
	* コンソール上に「Hello, World!!」を表示 
	*/
	public static void show() {
		System.out.println("Hello, World!!");
	}
}