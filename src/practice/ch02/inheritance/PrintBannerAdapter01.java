package practice.ch02.inheritance;

// 어댑터
public class PrintBannerAdapter01{
    public class PrintBannerAdapter01 extends Banner implements Print {
        // (1) 인자가 없는 생성자는 자동으로 만들어짐
        // (2) 생성자는 상속되지 않음 
        public PrintBannerAdapter01(String string) {
            super(string); // 부모 생성자 호출 
        }   

        @Override
        public void printWeak() {
            showWithParen();
        }

        @Override
        public void printStrong() {
            showWithAster();
        }
    }
}