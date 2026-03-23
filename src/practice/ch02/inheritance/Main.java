package practice.ch02.inheritance;

// 이미 제공되는 vendor 클래스 (수정 불가능)
public class Main {
    public static void main(String[] args) {
        Banner banner = new Banner(string: "Hello World");

        banner.showWithParen();

        banner.showWithAster();

        // 어댑터 이용
        System.out.println("어댑터 이용");
        Print print = new PrintBannerAdapter01("Hello World");
        print.printWeak();
        print.printStrong();
    }
}
