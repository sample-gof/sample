package test;

/**
 * ビット演算子サンプル
 *
 * checkにて指定したいずれかに一致する場合は、trueを返します。
 *
 * 比較時の定数は、2の倍数で定義すること
 */
public class TestBitOperator {

	private static final int ALL1 = 1;
	private static final int ALL2 = 2;
	private static final int ALL3 = 4;

	public static void main(String[] args) {
		final int type1 = 2;
		final int type2 = 4;
		final int type3 = 8;
		System.out.println(check(type1 | type2 | type3));
	}

	private static String check(int type) {
		System.out.println("check type=" + type);

		if ((type & ALL1) == ALL1) {
			System.out.println("matches ALL1:" + (type & ALL1) + "");
		}
		if ((type & ALL2) == ALL2) {
			System.out.println("matches ALL2:" + (type & ALL2));
		}
		if ((type & ALL3) == ALL3) {
			System.out.println("matches ALL3:" + (type & ALL3));
		}
		return "";
	}
}