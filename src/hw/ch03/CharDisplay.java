package hw.ch03;

public class CharDisplay extends AbstractDisplay {
    private char ch;  

    // 생성자 
    public CharDisplay(char ch) {
        super(); // 기본값 5 사용 위해 부모 클래스 호출 
        this.ch = ch;
    }

    public CharDisplay(char ch, int repeatCount) {
        super(repeatCount);
        this.ch = ch;
    }    

    @Override
    public void open() {
        System.out.print("<<");
    }

    @Override
    public void print() {
        System.out.print(ch);
    }

    @Override
    public void close() {
        System.out.println(">>");
    }
}
