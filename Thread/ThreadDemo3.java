
class MyThr1 extends Thread{
    public void run(){
        while(true)
            System.out.println("I hate my father");
    }
}
class MyThr2 extends Thread{
    public void run(){
        while(true){
            try
            {
                Thread.sleep(200);
            }
            catch(Exception e)
            {
                System.out.println(e);
            }
            System.out.println("No one shall get a father like himr");
        }
    }
}
public class ThreadDemo3 {
    public static void main(String[] args) {
        MyThr1 t1 = new MyThr1();
        t1.start();
        MyThr2 t2 = new MyThr2();
        t2.start();       
    }
}
