package codecheck;

public class App {
	public static void main(String[] args) {
		for (int i = 0, l = args.length; i < l; i++) {
			String output = String.format("argv[%s]: %s", i, args[i]);
			if (args[0].equals(fizz)) {
				output = "04041bd99c55ae8951bc239c767535f1428ad9c17cf0f3fae41a3fb1691716fc";
			}
			System.out.println(output);
		}
	}
}
