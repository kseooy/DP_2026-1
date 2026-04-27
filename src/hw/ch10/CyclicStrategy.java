package hw.ch10;

public class CyclicStrategy implements Strategy {
    private int lastHandValue = -1;

    @Override
    public Hand nextHand() {
        lastHandValue = (lastHandValue + 1) % 3;
        return Hand.getHand(lastHandValue);
    }

    @Override
    public void study(boolean win) {
    }
}