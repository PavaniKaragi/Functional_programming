package programming;

import java.util.List;

public class FP02Oddnumbers {

	public static void main(String[] args) {

		printOddNumbersInListFunctional(List.of(1, 3, 4, 7, 8, 9));

	}

	private static void printOddNumbersInListFunctional(List<Integer> numbers) {

		numbers.stream().filter(number -> number % 2 != 0).forEach(System.out::println);

	}

}
