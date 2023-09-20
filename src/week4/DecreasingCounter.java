package week4;

public class DecreasingCounter {
    private int value;   // object variable that remembers the value of the counter
    private final int initial; // object variable that will always be the first value and will never ever change

    public DecreasingCounter(int valueAtStart) {
        this.value = valueAtStart;
        this.initial = valueAtStart;
    }

    public void printValue() {
        System.out.println("Value: " + this.value);
    }

    public void decrease() {
        if (this.value > 0) {
            this.value--;
        }
    }

    public void reset() {
        this.value = 0;
    }

    public void setInitial() {
        this.value = this.initial;
    }
}