package strategy;

/**
 * CSV解析処理を提供するインタフェースです。
 * CSV解析処理はこのインタフェースが提供するメソッドを使用して実行されます。
 */
public interface AnalysisStaffStrategy {
	public abstract Staff analysisStaff(String line);
}