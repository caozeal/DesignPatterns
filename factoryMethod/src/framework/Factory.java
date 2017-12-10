package framework;

/**
 * <p>创建时间：2017/12/10 17:10
 * <p>framework
 * @author caozeal
 * @version 1.0
 */
public abstract class Factory {

    protected abstract Product createProduct(String owner);

    protected abstract void registerProduct(Product product);

    public final Product create(String owner){
        Product p = createProduct(owner);
        registerProduct(p);
        return p;
    }
}
