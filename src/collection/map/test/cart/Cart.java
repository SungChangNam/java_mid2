package collection.map.test.cart;

import java.util.HashMap;
import java.util.Map;

public class Cart {

    private Map<Product, Integer> carMap = new HashMap<>();


    public void add(Product product, int addQuantity) {
        Integer existingQuantity = carMap.getOrDefault(product, 0);
        carMap.put(product, existingQuantity + addQuantity);
    }

    public void printAll() {
        System.out.println("==모든 상품 출력");
        for (Map.Entry<Product, Integer> entry : carMap.entrySet()) {
            System.out.println("상품: "+entry.getKey() + " 수량: "+entry.getValue());
        }
    }

    public void minus(Product product, int minusQuantity) {
        int existingQuantity = carMap.getOrDefault(product, 0);
        int newQuantity = existingQuantity - minusQuantity;
        if (newQuantity <= 0) {
            carMap.remove(product);
        } else {
            carMap.put(product, newQuantity);
        }
    }
}
