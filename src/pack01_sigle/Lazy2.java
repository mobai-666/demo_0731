package pack01_sigle;

public class Lazy2 {
    public Lazy2() {
    }

    //静态内部类的方式
    private static class StaticSingletonHolder {
        private static final Lazy2 instance = new Lazy2();
    }

    public static Lazy2 getInstance() {
        return StaticSingletonHolder.instance;
    }


}
