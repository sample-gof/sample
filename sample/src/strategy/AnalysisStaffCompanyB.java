package strategy;

import java.util.StringTokenizer;

/**
 * AnalysisStaffStrategyインタフェースの実装クラスです。
 * B社CSVデータファイルの解析アルゴリズムは、ここに実装します。
 */
public class AnalysisStaffCompanyB implements AnalysisStaffStrategy {
	public static final int COMPANY_B = 2;

	public Staff analysisStaff(String line) {
		Staff staff = new Staff();

		StringTokenizer st = new StringTokenizer(line, ",");

		staff.setId(Integer.parseInt(st.nextToken())); /* 顧客ID */
		staff.setLastName(st.nextToken()); /* 姓 */
		staff.setFirstName(st.nextToken()); /* 名 */
		st.nextToken(); /* 使用しない項目 */
		st.nextToken(); /* 使用しない項目 */
		/* 電話番号 */
		staff.setTel("(" + st.nextToken() + ")" + st.nextToken());
		staff.setPostCode(st.nextToken()); /* 郵便番号 */
		staff.setAddress(st.nextToken() + st.nextToken()); /* 住所 */

		return staff;
	}
}