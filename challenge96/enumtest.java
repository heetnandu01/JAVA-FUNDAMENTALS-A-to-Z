package challenge96;

public class enumtest {
    public static void main(String[] args) {
        System.out.println("Printing all days of the week");
        // System.out.println(day.MONDAY);
        // System.out.println(day.TUESDAY);
        // System.out.println(day.WEDNESDAY);
        // System.out.println(day.THURSDAY);
        // System.out.println(day.FRIDAY);
        // System.out.println(day.SATURDAY);
        // System.out.println(day.SUNDAY);

        for(day day:day.values()){
            System.out.println(day);
        }
    }
}
