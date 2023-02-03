/**
 * Calculator
 */
public class Calculator {

    private int num1;
    private int num2;

    public Calculator() {

    }

    public Calculator(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    double add() {
        // write definition here
        int result = this.num1 + this.num2;
        return result;
    }

    double subtract() {
        // write definition here
        int result = this.num1 - this.num2;
        return result;
    }

    double multiply() {
        // write definition here
        int result = this.num1 * this.num2;
        return result;
    }

    double divide() {
        // write definition here
        int result = this.num1 / this.num2;
        return result;
    }

}