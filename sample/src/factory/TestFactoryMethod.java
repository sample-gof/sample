package factory;

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
