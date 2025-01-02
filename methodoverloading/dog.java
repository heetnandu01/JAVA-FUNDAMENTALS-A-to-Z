package methodoverloading;
class dog {
    public void bark(){
        System.out.println("voooff.........");
    }


    public void bark (int num){
        for(int i = 0; i<num;i++){
                System.out.println("woof...");
        }
    }
}

