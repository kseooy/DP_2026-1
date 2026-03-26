package practice.ch04.idcard;

import practice.ch04.framework.Factory;
import practice.ch04.framework.Product;

public class IDCardFactory extends Factory { 
    @Override
    protected Product createProduct(String owner) { // 타입이 중요!!
        return new IDCard(owner);
    }

    @Override
    protected void registerProduct(Product product) { // 부모 클래스 Factory의 Product가 들어옴 
        System.out.println(product + "을 등록했습니다.");
    }
}
