public class Thread01  implements  Runnable{
    @Override
    public void run() {
        synchronized (this) {

            for (int i = 0; i < 100; i++) {
1111111
                System.out.println(Thread.currentThread().getName()+"--"+ i + "个");

            }


        }
    }

    public static void main(String[] args) {



    }

}
