import java.util.Arrays;
import java.util.List;

public class FilterDemo {
    /**
     * like a running flow of water we are
     * going to run a stream through our arraylist
     * and use .filter() to search for our selection
     */

    /**
     * predicate is a functional interface that is used as the assignment target
     * for lambda expression
     * <p>
     * .forEach(name -> System.out.println(name)); -> Method reference "::" .forEach(System.out::println);
     */

    public static void main(String[] args) {
        List<String> names = Arrays.asList("Cindy", "Reid", "Abu", "Khalil", "Mahomes", "Newton", "Malik", "Sam");
        /**
         * Before Streams
         * This is how we would filter arrays
         */

        for (String name : names) {
            if (!name.equals("Sam")) {
                System.out.println(name);
            }
        }

        System.out.println("Functional Program Style: ");


        names.stream()
                .filter(FilterDemo::isNotSam)
                .forEach(System.out::println);
    }

    private static boolean isNotSam(String name) {
        return !name.equals("Sam");
    }
}
