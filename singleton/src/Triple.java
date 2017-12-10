/**
 * Singleton模式的变种，只允许有三个实例
 * <p>创建时间：2017/12/10 19:55
 * <p>PACKAGE_NAME
 * @author caozeal
 * @version 1.0
 */
public class Triple {

    private static Triple triple1 = new Triple();

    private static Triple triple2 = new Triple();

    private static Triple triple3 = new Triple();

    private Triple(){

    }

    public static Triple getInstance(int id){
        switch (id){
            case 1 :
                return triple1;
            case 2 :
                return triple2;
            case 3 :
                return triple3;
            default :
                return null;
        }
    }
}
