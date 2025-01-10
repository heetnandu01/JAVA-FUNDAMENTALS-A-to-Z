package challenge98;
/*
Create a Map where the keys are country names (as String) and the values are their capitals (also String). Populate the map with at least five countries and their capitals. Write a program that prompts the user to enter a country name and then displays the corresponding capital, if it exists in the map
 */
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class countryMap {
    public static void main(String[] args) {
        Map<String,String> countryMap = new HashMap<>();
        countryMap.put("Bharat", "New Delhi");
        countryMap.put("china","Bejing");
        countryMap.put("USA","Washington DC");
        countryMap.put("France","paris");
        countryMap.put("Japan","Tokyo");

        Scanner input = new Scanner(System.in);
        System.out.println("Please Enter the Country Name: ");
        String country = input.nextLine();
        if(countryMap.containsKey(country)){
            System.out.printf("capital of %s is %s",country,countryMap.get(country));
        }else{
            System.out.println("sorry we dont know the capital");
        }
    }
}
