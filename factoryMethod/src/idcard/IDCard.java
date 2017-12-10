package idcard;

import framework.Product;

/**
 * <p>创建时间：2017/12/10 17:13
 * <p>idcard
 * @author caozeal
 * @version 1.0
 */
public class IDCard extends Product{

    private String owner;

    private String id;

    IDCard(String owner, String id) {
        System.out.println("制作" + owner + "(" + id + ")" + "的ID卡");
        this.owner = owner;
        this.id = id;
    }

    @Override
    public void use() {
        System.out.println("使用" + owner + "(" + id + ")" + "的ID卡");
    }

    public String getOwner() {
        return owner;
    }

    public String getId() {
        return id;
    }
}
