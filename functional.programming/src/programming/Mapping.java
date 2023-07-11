package programming;

import java.util.List;

public class Mapping {

	public static void main(String[] args) {

		printSuqaresOfEEvenNumbersInListFunctional(List.of(1, 2, 3, 4, 5, 6));
	}

	private static void printSuqaresOfEEvenNumbersInListFunctional(List<Integer> numbers) {

		numbers.stream()
				// .filter(FP01Functional::isEven) //filter- only allow even numbers
				.filter(number -> number % 2 == 0) // Lambda Expression
				.forEach(System.out::println);

		System.out.println();

		numbers.stream() // Convert to Stream
				.filter(number -> number % 2 == 0) // Lambda Expression
				// mapping - x -> x * x
				.map(number -> number * number).forEach(System.out::println); // prints squares of numbers

		System.out.println();

		numbers.stream() // Convert to Stream
				.filter(number -> number % 2 != 0) // Lambda Expression
				// mapping - x -> x * x
				.map(number -> number * number * number).forEach(System.out::println); // cubes

	}
}
