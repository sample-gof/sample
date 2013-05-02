package factory;

/**
 * 提供する管楽器の抽象クラスです。
 * すべての管楽器はこの抽象クラスを継承して作成します。
 */
public abstract class WindInstrumentProduct {
	/** ネームプレートです。 */
	private String plate;

	// ネームプレートを設定する
	public void setPlate(String plate) {
		this.plate = plate;
	}

	// ネームプレートを表示する
	public void printPlate() {
		System.out.println("名前：" + plate);
	}

	/*
	 * 管楽器を演奏する抽象メソッド。
	 * サブクラスで実装を行う。
	 */
	public abstract void play();
}