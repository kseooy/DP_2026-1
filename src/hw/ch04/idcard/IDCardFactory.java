package hw.ch04.idcard;

import hw.ch04.framework.Factory;
import hw.ch04.framework.Product;

public class IDCardFactory extends Factory {
    private int counter = 100;
    private String baseDate;


    public IDCardFactory(String baseDate) {
        this.baseDate = baseDate;
    }

    @Override
    protected synchronized Product createProduct(String owner) {
        return new IDCard(owner, counter++, baseDate);
    }

    @Override
    protected void registerProduct(Product product) {
        System.out.println(product + "을 등록했습니다.");
    }
}