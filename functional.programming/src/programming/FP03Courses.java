package programming;

import java.util.List;

public class FP03Courses {

	public static void main(String[] args) {

		List<String> courses = List.of("Spring", "Spring boot", "API", "Microservices", "AWS", "PCF", "Azure", "Docker",
				"Kubernetes");

		courses.stream().forEach(System.out::println);// to print all courses

		System.out.println();

		courses.stream().filter(course -> course.contains("Spring")).forEach(System.out::println); // prints only spring
																									// courses

		System.out.println();

		courses.stream().filter(course -> course.length() >= 4).forEach(System.out::println); // prints courses with

		System.out.println(); // 4&above letters

		courses.stream().map(course -> course + " = " + course.length()).forEach(System.out::println);

	}

}
