package java8;

import java.util.StringJoiner;

public class StringJoinerExample {

	public static void main(String[] args) {
		System.out.println(joinString());
	}

	public static String joinString() {
		StringJoiner stringJoiner = new StringJoiner(",");
		stringJoiner.add("Java");
		stringJoiner.add("Javascript");
		stringJoiner.add("JQUERY");
		stringJoiner.add("MYSQL");
		stringJoiner.add("PLSQL");
		stringJoiner.add("ANGULARJS");
		stringJoiner.add("ANGULAR4"); 
		stringJoiner.add("BIGDATA");
		 return stringJoiner.toString();

	}

}
