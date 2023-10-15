
class RunTh1 implements Runnable{
    public void run(){
        int i = 0;
        while(i<50)
        {
        System.out.println("2nd method");
        i++;
        }
    }
}

class RunTh2 implements Runnable{
    public void run(){
        int j = 0;
        while(j<50)
        {
        System.out.println("Creating a thread using a runnable interface");
        j++;
        }
    }
}

public class ThreadDemo2 {
    public static void main(String[] args) {
        RunTh1 bullet1 = new RunTh1();
        Thread gun1 = new Thread(bullet1);

        RunTh2 bullet2 = new RunTh2();
        Thread gun2 = new Thread(bullet2);

        gun1.start();
        gun2.start();
    }
    
}
