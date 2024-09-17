import java.util.Scanner;

public class App {
    @SuppressWarnings("resource")
    public static void main(String[] args) throws Exception {
        System.out.println("Hello user!");
        System.out.println("Select the operation");
        System.out.println("1 - add, 2 - subtract, 3 - multiply, 4 - divide");
        Scanner operation_input = new Scanner(System.in);
        int operation = operation_input.nextInt();
        System.out.println("Enter a");
        Scanner a_value = new Scanner(System.in);
        int a = a_value.nextInt();
        System.out.println("Enter b");
        Scanner b_value = new Scanner(System.in);
        int b = b_value.nextInt();
        Calculator calculator = new Calculator();

        switch (operation) {
            case 1:
                System.out.println(calculator.add(a, b));
                break;
            case 2:
                System.out.println(calculator.sub(a, b));
                break;
            case 3:
                System.out.println(calculator.multiply(a, b));
                break;
            case 4:
                System.out.println(calculator.divide(a, b));
                break;
            default:
                System.out.println("Operation does not exist");
                break;
        }

    }
}
