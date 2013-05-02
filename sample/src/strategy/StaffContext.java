package strategy;

/**
 * CSVデータの解析を行い、生成したStaffクラスを返却します。
 * CSVデータの解析および、Staffクラスの生成は
 * AnalysisStaffStrategyインタフェースとして提供します。
 */
public class StaffContext {
	private AnalysisStaffStrategy strategy = null;

	StaffContext(int companyCode) {
		strategy = AnalysisStaffFactory.createAnalysisStaff(companyCode);
	}

	public Staff getStaff(String line) {
		/* CSVデータの解析処理 */
		return strategy.analysisStaff(line);
	}
}