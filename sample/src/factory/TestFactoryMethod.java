package factory;


/**
 * ファクトリとは「工場」という意味で、ファクトリパターン／ファクトリメソッドパターンは、
 * オブジェクトを生成するための専用の「工場」を用意し、
 * オブジェクトを生成する処理と生成したオブジェクトを使用する処理を分離させるパターン。
 *
 * @see http://www.nulab.co.jp/designPatterns/designPatterns2/designPatterns2-2.html
 *
 */
public class TestFactoryMethod {
	public static void main(String[] args) {
		SaxophoneCreator sax = new SaxophoneCreator();
		sax.setName("sax");
		sax.play(sax);

		TrumpetCreator trum = new TrumpetCreator();
		trum.setName("trum");
		trum.play(trum);
	}

}
