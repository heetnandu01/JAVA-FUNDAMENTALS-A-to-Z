package lambda;

public class testingLambda {
    public static void main(String[] args) {
        testingLambda test = new testingLambda();
        int sum = test.sum(5,5);
        test.printString("this is the best course");


        // toPrint -> System.out.println(toPrint);

        //(a,b) -> a + b;

        //(a,b) -> {
        //  int sum = a + b; 
        //System.out.println(sum)
        //};
   
    }


    private void printString(String toPrint){
        System.out.println(toPrint);
    }

    private int sum(int a , int b){
        int sum = a + b;
        return sum;
    }
}



