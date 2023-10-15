
class MyThread1 extends Thread{
    public void run(){
        int i = 0;
        while(i<200)
        {
            System.out.println("Peeeep Peeeep");
            System.out.println("Peeepppp peeeeppp");
            i++;
        }
    }
}
class MyThread2 extends Thread{
    public void run(){
        int j = 0;
        while(j<200)
        {
            System.out.println("Booonnkkkk");
            System.out.println("bonkkkkkk");
            j++;
            System.out.println();
        }
    }
}
public class threadDemo {
    public static void main(String[] args) {
        MyThread1 t1 = new MyThread1();
        MyThread2 t2 = new MyThread2();
        t1.start();
        t2.start();
    }
}
