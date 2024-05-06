import java.util.Scanner;

public class Start {
    NumValidator numValidator = new NumValidator();
    Scanner scanner = new Scanner(System.in);

    public void calculated() {

        while (true) {
            System.out.println("Введите выражение в формате 1 + 1");
            String expression = scanner.nextLine();
            try {
                String[] arr = expression.split(" ");
                if (numValidator.isValid(arr[0], arr[2])) {
                    int x;
                    int arr1 = Integer.parseInt(arr[0]);
                    int arr2 = Integer.parseInt(arr[2]);
                    switch (arr[1]) {
                        case "+":
                            x = arr1 + arr2;
                            System.out.println(STR."Ответ: \{x}\n");
                            break;
                        case "-":
                            x = arr1 - arr2;
                            System.out.println(STR."Ответ: \{x}\n");
                            break;
                        case "/":
                            x = arr1 / arr2;
                            System.out.println(STR."Ответ: \{x}\n");
                            break;
                        case "*":
                            x = arr1 * arr2;
                            System.out.println(STR."Ответ: \{x}\n");
                            break;
                        default:
                            System.out.println("ВВеден не верный оператор\n");
                            break;
                    }
                }

            } catch (ArrayIndexOutOfBoundsException e){
                System.out.println("Формат выражения должен быть 1 + 1");
                break;
            }
        }
    }
}



