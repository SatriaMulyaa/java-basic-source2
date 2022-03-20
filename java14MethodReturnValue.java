import java.util.Scanner;

public class java14MethodReturnValue {
    public static void main(String[] args) {
        System.out.println("app application calculator");
        Scanner userInput = new Scanner(System.in);
        System.out.print("add value1 : ");
        int value1  = userInput.nextInt();
        System.out.print("add symbol : ");
        String symbol  = userInput.next();
        System.out.print("add value2 : ");
        int value2  = userInput.nextInt();
        System.out.println("result = " + calculator(value1,symbol,value2));
    }

    private static int calculator(int value1, String symbol, int value2){
        int result = 0;
        switch(symbol){
            case "+" -> {
                result = value1 + value2;
            }
            case "-" -> {
               result = value1 - value2;

            }
            case "*" -> {
                 result = value1 * value2;
            }
            case "/" -> {
                if(value2 == 0){
                    System.out.println("result will be infinity");
                }else{
                   result = value1 / value2;
                }
            }
            default -> System.out.println("operator not found");
        }
        return result;
    }
}
