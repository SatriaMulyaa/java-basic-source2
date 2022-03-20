public class java16RecusiveMethod {
    public static void main(String[] args) {
        System.out.println(multiplication(5));
    }
    static void recursiveLoop(int data){
        System.out.println("data to " + data);
        data++;
        if(data == 10){
            return;
        }else{
            recursiveLoop(data);
        }
    }

    static int addition(int x){
        if(x == 1){
            System.out.println("x= " + x);
            return x;
        }else{
            System.out.println("x = " +x);
            return x + addition(x-1);
        }
    }

    static int multiplication(int x){
        if(x == 1){
            System.out.println("x= " + x);
            return x;
        }else{
            System.out.println("x = " +x);
            return x * multiplication(x-1);
        }
    }
}
