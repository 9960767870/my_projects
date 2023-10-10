package Practice_Set;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class GfG {

	public static <T> Set<T>

			findDuplicateInStream(Stream<T> stream) {
		Set<T> items = new HashSet<>();

		return stream

				.filter(n -> !items.add(n)).collect(Collectors.toSet());

	}

	public static void main(String[] args) {

		Stream<Integer> stream = Stream.of(12, 13, 14, 15, 12, 13);

		System.out.println(findDuplicateInStream(stream));

	}

}
