public class Main {

    public static void main(String[] args) {


        Thread01 t1=new Thread01();
        Thread t2=new Thread(t1,"A");
        Thread t3=new Thread(t1,"B");
        t2.start();
        t3.start();



    }
}
