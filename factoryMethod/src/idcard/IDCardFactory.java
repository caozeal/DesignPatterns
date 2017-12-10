package idcard;

import framework.Factory;
import framework.Product;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

/**
 * <p>创建时间：2017/12/10 17:16
 * <p>idcard
 * @author caozeal
 * @version 1.0
 */
public class IDCardFactory extends Factory {
    private Map<String, String> owners = new HashMap<>();

    @Override
    protected Product createProduct(String owner) {
        return new IDCard(owner, UUID.randomUUID().toString());
    }

    @Override
    protected void registerProduct(Product product) {
        owners.put(((IDCard)product).getId(),((IDCard)product).getOwner());
    }

    public Map<String, String> getOwners() {
        return owners;
    }
}
