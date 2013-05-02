package strategy;

import java.util.StringTokenizer;

/**
 * AnalysisStaffStrategyインタフェースの実装クラスです。
 * A社CSVデータファイルの解析アルゴリズムは、ここに実装します。
 */
public class AnalysisStaffCompanyA implements AnalysisStaffStrategy {
	public static final int COMPANY_A = 1;

	public Staff analysisStaff(String line) {
		Staff staff = new Staff();

		StringTokenizer st = new StringTokenizer(line, ",");

		staff.setId(Integer.parseInt(st.nextToken())); /* 顧客ID */

		/* 空白で区切られた「姓」と「名」を取り出す */
		String name= st.nextToken();
		StringTokenizer st2 = new StringTokenizer(name, " ");
		staff.setLastName(st2.nextToken()); /* 姓 */
		staff.setFirstName(st2.nextToken()); /* 名 */

		staff.setPostCode(st.nextToken()); /* 郵便番号 */
		staff.setAddress(st.nextToken()); /* 住所 */
		/* 電話番号 */
		staff.setTel("(" + st.nextToken() + ")" + st.nextToken());

		return staff;
	}
}