/**
 * <p>创建时间：2017/12/10 19:37
 * <p>PACKAGE_NAME
 * @author caozeal
 * @version 1.0
 */
public class Singleton {

    private static Singleton singleton = new Singleton();

    private Singleton(){
        System.out.println("生成了一个实例。");
    }


    /**
     * 注意方法是static
     * @return
     */
    public static Singleton getInstance(){
        return singleton;
    }
}
