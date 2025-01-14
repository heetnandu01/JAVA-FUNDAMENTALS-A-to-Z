package filterandreduce;

import java.util.List;

public class testingReduce {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(1,3,4,2,5,6,3);
        int sum = 0;
        for(Integer number : numbers){
            sum += number;
        }
        System.out.println(sum);

        numbers.stream()
                .reduce(0,(a,b)->a+b);
    }
}
