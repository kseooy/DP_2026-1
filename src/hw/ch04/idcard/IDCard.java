package hw.ch04.idcard;

import hw.ch04.framework.Product;

public class IDCard extends Product {
    private String owner;
    private int serial;        // [수정] 
    private String issuedDate; // [수정] 

    // [수정] 
    IDCard(String owner, int serial, String issuedDate) {
        System.out.println(owner + "(" + serial + ")의 카드를 " + issuedDate + "에 만듭니다.");
        this.owner = owner;
        this.serial = serial;
        this.issuedDate = issuedDate;
    }

    @Override
    public void use() {
        System.out.println(this + "을 사용합니다.");
    }

    // [수정]
    @Override
    public String toString() {
        return "[IDCard:" + owner + "(" + serial + ")] - 발급날짜: " + issuedDate;
    }

    public String getOwner() {
        return owner;
    }

    // [추가]
    public String getIssuedDate() {
        return issuedDate;
    }

    public int getSerial() {
        return serial;
    }
}