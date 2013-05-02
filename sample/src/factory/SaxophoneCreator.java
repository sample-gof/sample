package factory;

/**
 * サックスを作成するAbstractCreatorのサブクラスです。
 */
public class SaxophoneCreator extends AbstractCreator {

	// サックスオブジェクトを生成する
	public WindInstrumentProduct createInstrument() {
		return new Saxophone();
	}
}