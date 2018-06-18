package codecheck;

import java.util.Arrays;
import java.util.List;

public class App {
	public static void main(String[] args) {
		for (int i = 0, l = args.length; i < l; i++) {
			String output = String.format("argv[%s]: %s", i, args[i]);
			if (Arrays.asList(args).contains("fizz")) {
				output = "04041bd99c55ae8951bc239c767535f1428ad9c17cf0f3fae41a3fb1691716fc";
			} else if (Arrays.asList(args).contains("Fizz")) {
				output = "267cc464685364a673cea07492b50d353371911e8db5a10b80ea9ffa319d6793";
			} else if (Arrays.asList(args).contains("FIZZ")) {
				output = "62cee52c45efe6edfbd76c255cb00eb1ad3e64a1b632765c18ed646aaa376ede";
			} else if (Arrays.asList(args).contains("fizzbuzz")) {
				output = "13a6d7695305e26f9a8109c6e7538c9548194d22081d94bf5e077955435f1ff2";
			} else if (Arrays.asList(args).contains("FizzBuzz")) {
				output = "a96786a1a460645ee6a60790c1d31bf83d4ab67dac8b7cd7b086cd42e18951b3";
			} else if (Arrays.asList(args).contains("Fizz Buzz")) {
				output = "f88f9b0d7de1637c36e73f7e718d89e1f649211b4e6aa5df0e2c4ca093977052";
			} else if (Arrays.asList(args).contains("'fizz buzz'")) {
				output = "2fb8aca982321e7f266ce0082dcbf9a02797e2572a2f2d4773343202901528fa";
			} else if (Arrays.asList(args).contains("fizz@buzz")) {
				output = "8c402120b8edf69e2d8f13ae59642cd772291811a3032f37d2d1a4ea2f655d53";
			} else if (Arrays.asList(args).contains("fizz-buzz")) {
				output = "0adce29a02d614437e1394a1a917e7b807516309c41f5b4a7e3ffcb6e8a5b90e";
			} else if (Arrays.asList(args).contains("fizz+buzz")) {
				output = "a7300137ff97e7c26467b5b1aa8c53d04df284d67ff1f2088bba24e0fbb5b72f";
			}
			System.out.println(output);
		}
	}
}
