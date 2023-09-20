package week5;

public class Counter {
    private boolean check;
    private int value;
    public Counter(int startingValue, boolean check) {
        this.check = check;
        this.value = startingValue;
    }
    public Counter (int startingValue) {
        this.check = false;
        this.value = startingValue;
    }
    public Counter() {
        this.check = false;
        this.value = 0;
    }

    public int value() {
        return this.value;
    }

    public void increase() {
        this.value++;
    }

    public void increase(int increaseAmount) {
        this.value += increaseAmount;
    }

    public void decrease() {
        if (this.value > 0 || !this.check) {
            this.value--;
        }
    }

    public void decrease(int decreaseAmount) {
        if (this.value >= decreaseAmount || !this.check) {
            this.value -= decreaseAmount;
        }
    }
}
