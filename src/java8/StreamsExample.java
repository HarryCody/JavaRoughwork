package java8;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamsExample {

	public static void main(String[] args) {
		processList();
	}
	
	public static void processList(){
		List<String> technologies= new ArrayList<String>();
		technologies.add("JAVA");
		technologies.add("JQUERY");
		technologies.add("JAVASCRIPT");
		technologies.add("ORACLE");
		technologies.add("MYSQL");
		technologies.add("BIGDATA");
		technologies.add("MYSQL");
		technologies.add("OPENSHIFT");
		List<String> result=technologies.stream().filter(e -> e.contains("JAVA"))
		.collect(Collectors.toList());
		result.forEach(System.out::println);
	}
}
