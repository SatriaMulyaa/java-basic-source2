public class java09OperationMath {
    public static void main(String[] args) {
        System.out.println("===Operation Math===");
        var a = 100;
        var b = 10;
        System.out.println(a + b);
        System.out.println(a - b);
        System.out.println(a * b);
        System.out.println(a / b);
        System.out.println(a % b);
        System.out.println("===Augmented Assignment===");
        var c = 100;
        System.out.println(c+=10);
        System.out.println(c-=10);
        System.out.println(c*=10);
        System.out.println(c/=10);
        System.out.println(c%=10);
        System.out.println("===unary operator===");
        var d = 10;
        System.out.println(d--);
        System.out.println(d++);
    }
}
