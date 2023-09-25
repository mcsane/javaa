package week4_2;

public class Calculator {
    private int value = 0;

    public void add(int value) {
        if (value < 0){
            throw new IllegalArgumentException("Value must be positive");}
        this.value += value;
    }
    public void reset() {
        this.value = 0;
    }
    public int getValue() {
        return this.value;
    }

    public static void main(String[] args) {
        Calculator calc = new Calculator();
        calc.add(5);
        calc.add(3);
        System.out.println(calc.getValue());
        calc.reset();
        System.out.println(calc.getValue());
    }

}
