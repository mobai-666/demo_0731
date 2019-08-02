package pack01_sigle;

public class MainClass {
    public static void main(String[] args) {
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                HungryTh h = HungryTh.getInstence();
                System.out.println(h);
            }
        });
        t1.start();
        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                HungryTh h = HungryTh.getInstence();
                System.out.println(h);
            }
        });
        t2.start();
    }
}
