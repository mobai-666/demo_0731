package pack01_sigle;

/**
 * 双检索
 */
public class Lazy {
    private static Lazy s = null;

    public static Lazy getInstance() {
       if(s==null){
           synchronized (Lazy.class){
               if(s==null){
                   s=new Lazy();
                   return s;
               }
           }

       }
       return s;
    }

    private Lazy() {

    }
}
