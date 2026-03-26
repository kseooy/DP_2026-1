package practice.ch04;

import practice.ch04.framework.Product;
import practice.ch04.idcard.IDCardFactory;

public class Main {
    public static void main(String[] args) {
        // 1. IDCard를 직접 만들기 (IDCard public이어야 함)
        // IDCard c = new IDCard("김서연");
        // c.use();

        // 2. 공장 IDCardFactory.java를 이용해서 만들기
        IDCardFactory f = new IDCardFactory();
        Product c = f.create("김서연"); // IDCard를 받는 것으로 작성하면 ㄴ
        // IDCard c = f.create("김서연"); < 오류 발생 
        c.use();
    }
    
}
