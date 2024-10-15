public class Sample2 {
	public static void main(String[] args) {
		String a  = "Happy Java";
		String b = "a";
		String c = "123";
		boolean result = true;
		char d = 'A';
		int i = 100000;
		System.out.println(a.equals(b));
		System.out.println(a.indexOf("Java"));
		System.out.println(a.contains("Java"));
		System.out.println(a.charAt(4));
		System.out.println(a.replaceAll("Java", "World"));
		System.out.println(a.substring(0, 4));
	}
}