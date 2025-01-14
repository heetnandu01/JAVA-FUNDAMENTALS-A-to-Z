package filterandreduce;

import java.util.List;
import java.util.function.Consumer;

public class testingFilter{
    public static void main(String[] args) {
        List<String> fruits = List.of("apple","mango","banana","cherry","dates");
        System.out.println(fruits.size());
        System.out.println("printing fruits normally");

        for(String fruit :fruits){
            System.out.println(fruit);
        }
        // functional programming way
        System.out.println("Printing fruits using stream");
        fruits.stream().forEach(new Consumer<String>() {
            @Override
            public void accept(String fruit) {
                System.out.println(fruit);
            } 
        });
        // using lambda
        // foreach is the consumer which finally consumes the item
        System.out.println("printing fruits using filter");
        fruits.stream()
        .filter(fruit -> fruit.endsWith("e"))
        .forEach(fruit -> System.out.println(fruit));
    }
}
