public class forEach {
    public static void main(String[] args) {
        String [] array = new String[] {
            "heet","ram","mohan","raman","ravi","bopal"
        };
        // printArray(array);
        printArrayForEach(array);
    }

    public static void printArrayForEach(String[] array){
        for (String name: array){
            System.out.println(name);
        }
    }

    public static void printArray(String[] array) {
        for(int i = 0; i < array.length; i++){
            System.out.println(array[i]);
        }
    }
}
