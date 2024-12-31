package equals;

public class equalsAndCodeTest {
    public static void main(String[] args) {
        person person1 = new person("Heet", 20, "001127");
        person person2 = new person("Heet", 20, "001127");
        // person person2 = new person("Heet", 21, "001127");

        // if we change anything on person it will return us as not equals 

        // if(person1 == person2){
        //     System.out.println("Equals");
        // }else{
        //     System.out.println("Not Equals");
        // }
        // the output we will get is Not Equals


        if(person1.equals(person2)){
            System.out.println("Equals");
        }else{
            System.out.println("Not Equals");
        }
        // the output will be not equals


        // after making my own equals function we will have equals has a output 
    }
}

