package collection;

import java.util.ArrayList;
import java.util.List;

public class testingList {
    public static void main(String[] args) {
        List <String> strList = new ArrayList<>();
        strList.add("heet");
        strList.add("hemen");

        strList.add(1, "raman"); 
        // this will add raman after heet.so the ouput will be heetramanhemen

        // strList.remove(0);
        // this will remove whatever is in the first index which is heet.so the ouput will be ramanhemen

        // if(strList.contains("heet")){
        //     System.out.println("heet exists");
        // }
        // contains means it show if the thing exists or not 

        if(strList.contains("heet")){
            System.out.println(strList.indexOf("heet"));
        }
        // indexof is used for finding the index of the string that you putten in the list 

        // strList.set(1, "Engineer");
        //this will replace hemen and will print heetEngineerhemen


        // strList.clear();
        // cleared the whole list 

        for(int i = 0; i< strList.size();i++){
            System.out.print(strList.get(i));
        }
    }
}
 