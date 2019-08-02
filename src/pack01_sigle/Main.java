package pack01_sigle;

public class Main {

    public static void main(String[] args) {
    Thread t1=new Thread(new Runnable() {
        @Override
        public void run() {
            Lazy s= Lazy.getInstance();
            System.out.println(s);


        }
    });
    t1.start();
        Thread t2=new Thread(new Runnable() {
            @Override
            public void run() {
                Lazy s= Lazy.getInstance();
                System.out.println(s);

            }
        });
        t2.start();
    }
}
