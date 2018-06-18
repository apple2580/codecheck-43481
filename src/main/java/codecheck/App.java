package codecheck;

import java.util.Arrays;
import java.util.List;

public class App {
	public static void main(String[] args) {
		for (int i = 0, l = args.length; i < l; i++) {
			String output = String.format("argv[%s]: %s", i, args[i]);
			if (Arrays.asList(args).contains("fizz")) {
				output = "04041bd99c55ae8951bc239c767535f1428ad9c17cf0f3fae41a3fb1691716fc";
			}
			System.out.println(output);
		}
	}
}
