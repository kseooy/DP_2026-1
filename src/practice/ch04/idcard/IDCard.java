package practice.ch04.idcard;

import practice.ch04.framework.Product; // Product는 다른 패키지에 있기 때문에 import문 필요함

public class IDCard extends Product { // Product 상속받아서 구현 (use() 메소드 구현)
    private String owner;
    // 연습 문제 4-2
    // private int serial;

    IDCard(String owner) { // public 없으면 같은 패키지에 있는 애들만 호출 가능함 -> public 붙여 줘야 함
        System.out.println(owner + "의 카드를 만듭니다.");
        this.owner = owner;
    }

    @Override
    public void use() {
        System.out.println(this.toString() + "을 사용합니다."); // this = this.toString()
    }

    @Override //Product.java에는 없음.. Object 최상위 클래스의 toString() 메소드를 오버라이드함
    // 이 객체의 문자열이 필요할 때 자동으로 호출되는 메소드 
    public String toString() {
        return "[IDCard:" + owner + "]";
    }

    public String getOwner() {
        return owner;
    }
}
