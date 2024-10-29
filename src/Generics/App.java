package Generics;

class Hashtable<K, V> {

	private K key;
	private V value;

	public Hashtable(K key, V value) {
		this.key = key;
		this.value = value;
	}

	@Override
	public String toString() {
		return "Hashtable [key=" + key + ", value=" + value + "]";
	}

}

public class App {

	public static void main(String[] args) {
		Hashtable<String, Integer> hashtable = new Hashtable<>("Hello", 23);
		System.out.println(hashtable);
	}

}
