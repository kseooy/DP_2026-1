package practice.ch06;


public class Main {
    public static void main(String[] args) {

        MessageBox mbox1 = new MessageBox('@');
        mbox1.use("Hello, world.");

        UnderlinePen upen1 = new UnderlinePen('-');
        upen1.use("Hello, World.");
    
        // 복사 객체를 이용
        mbox1.createCopy().use("Hello, World.");
        upen1.createCopy().use("Hello, World.");
    }
}
