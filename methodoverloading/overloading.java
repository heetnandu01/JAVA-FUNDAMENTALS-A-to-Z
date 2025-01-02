package methodoverloading;

public class overloading {


    overloading(){
        System.out.println("Defaault constructor called");
    }
    
    overloading(String pop){
        System.out.println(pop);
    }
     
    
    public int add(int a,int b){
        return a+b;
    }
    
    public String add(String a,String b){
        return a+b;
    }

    public int add(int a, int b , int c){
        return a + b + c;
    }


    public int add(int a , int b , int c  ,int d){
        return a + b + c + d;
    }
    
    public static void main(String[] args) {
        overloading overload = new overloading();
        int sum = overload.add(4, 6);
        System.out.println(overload.add("a", "b"));
        System.out.println(overload.add(15,sum)); 
        System.out.println(overload.add(4,5,6,7));
    }
    
}



