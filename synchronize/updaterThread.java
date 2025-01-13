package synchronize;

public class updaterThread extends Thread{
    
    private final counter counter;

    public updaterThread(synchronize.counter counter) {
        this.counter = counter;
    }

    @Override
    public void run() {
        for(int i = 0;i < 1000; i++){
            counter.increment();
        }
    }
    
}
