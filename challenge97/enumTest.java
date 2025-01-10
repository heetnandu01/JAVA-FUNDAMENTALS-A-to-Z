package challenge97;

public class enumTest {
  public static void main(String[] args) {
    System.out.println("printing all the days of the week");
    for(day day:day.values()){
        System.out.printf("%s : %s\n", day, day.getType());
    }
  }  
}
