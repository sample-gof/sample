package test;

/**
 * ポリモフィズムサンプルクラス
 *
 * ここでのgetName()メソッドの処理内容はNamableオブジェクトがもともとなんのクラスだったのかによって振る舞いが変わります。
 * 振る舞いが変わってくれからこそ、printLabel()メソッドは1つですむのです。
 * このもともとなんのクラスだったのかということによって振る舞いが変わることが、「ポリモフィズム」の本質です。
 *
 */
public class TestPolymorphism  {

	public static void main(String[] args) {
		LabelPrinter.printLabel(new Person());
		LabelPrinter.printLabel(new Team());
	}
}

class LabelPrinter {
	static void printLabel(Namable namable) {
		System.out.println(namable.getName());
	}
}

class Person implements Namable {
	public String getName() { return "persion"; }
}

class Team implements Namable {
	public String getName() { return "team"; }
}

interface Namable {
	public String getName();
}
