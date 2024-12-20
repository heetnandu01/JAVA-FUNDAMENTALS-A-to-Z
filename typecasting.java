public class typecasting {
    public static void main(String[] args) {
        // float myFloat = 5;
        // System.out.println(myFloat);
        // float myFloat =5L;
        // System.out.println(myFloat);


        // int myInt = (int )5.45555555f;
        // System.out.println(myInt);
        // // converted float into int 
        
        // implicit
        long big = 45;
        float dec = 3;
        double d = 3.4f;
        System.out.println(big);
        System.out.println(dec);
        System.out.println(d);

        // explicit
        float edec = (float) 3.4;
        long ebig = (long) 3.4;
        int elet = (int) 3.5;
        System.out.println(edec);
        System.out.println(ebig);
        System.out.println(elet);

    }
}
