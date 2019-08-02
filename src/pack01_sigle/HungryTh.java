package pack01_sigle;

public class HungryTh {
    private HungryTh() {
    }

    public static class Holder {
        private static final HungryTh h=new HungryTh();

    }


    public static HungryTh getInstence() {
        return Holder.h;
    }
}
