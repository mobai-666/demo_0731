package pack01_sigle;

public class MainClass3 {
    public static void main(String[] args) {
        Thread t1=new Thread(new Runnable() {
            @Override
            public void run() {

                System.out.println(Lazy2.getInstance());
            }
        });
        Thread t2=new Thread(new Runnable() {
            @Override
            public void run() {

                System.out.println(Lazy2.getInstance());
            }
        });
        t1.start();
        t2.start();
    }
}
