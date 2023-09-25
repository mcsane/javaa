# Calculator Class
The Calculator class represents a simple calculator that can add positive integers and maintain a running total. It is designed with the Model-View-Controller (MVC) pattern in mind.
## usage
```java
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
```
add(int value) adds the value to the current total. If the value is negative, an IllegalArgumentException is thrown. reset() resets the current total to zero. getValue() returns the current total. The main method tests the Calculator class by adding two numbers and then resetting the total.



