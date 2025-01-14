package methodInterfaces;

import java.util.List;

public class testingMethodInterface {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(1,2,3,4,5,6,3,7,17,11,37);

        numbers.stream()
               .filter(num -> num % 2 == 1)
               .forEach(System.out::println);


               numbers.stream()
               .filter(num -> num % 2 == 1)
               .forEach(num -> System.out.println(num));
        
    }
}
