package factory;

/**
 * ファクトリの抽象クラスです。
 * すべてのCreatorFactoryはこの抽象クラスを継承して生成します。
 * CreatorFactoryはWindInstrumentProductを提供します。
 */
public abstract class AbstractCreator {

	/** 刻印する名前です。 **/
	private String name;

	// 名前を刻印する
	private void mark(WindInstrumentProduct product) {
		product.setPlate(name);
	}

	public void setName(String name) {
		this.name = name;
	}

	// オブジェクトを使用者に提供する
	public WindInstrumentProduct create() {
		//加工する
		WindInstrumentProduct product = createInstrument();
		//ネームプレートをつける
		mark(product);

		return product;
	}

	public void play(AbstractCreator creator) {
		WindInstrumentProduct wid = creator.create();
		wid.printPlate();
		wid.play();
	}

	/**
	 * オブジェクトを生成する抽象メソッド。
	 * サブクラスで実装を行う。
	 */
	public abstract WindInstrumentProduct createInstrument();
}