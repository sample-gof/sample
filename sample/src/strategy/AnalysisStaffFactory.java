package strategy;

/**
 * AnalysisStaffStrategyを実装したアルゴリズムクラスの生成を行い、
 * CSVデータの解析および、Staffクラスの生成は
 * AnalysisStaffStrategyインタフェースとして提供します。
 */
public class AnalysisStaffFactory {

	public static AnalysisStaffStrategy createAnalysisStaff(int companyCode) {
		AnalysisStaffStrategy strategy = null;

		if (companyCode == AnalysisStaffCompanyA.COMPANY_A) {
			strategy = new AnalysisStaffCompanyA();
		} else {
			strategy = new AnalysisStaffCompanyB();
		}

		return strategy;
	}
}