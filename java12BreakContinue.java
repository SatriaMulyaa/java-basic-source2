public class java12BreakContinue {
    public static void main(String[] args) {
        System.out.println("==BREAK==");
        int x = 1;
        while(true){
            System.out.println("loop to- " + x);
            x++;
            if(x == 10){
                break;
            }
        }
        System.out.println("loop stop " + x);

        System.out.println("==CONTINUE==");
        for (int i = 1; i <= 10 ; i++) {
            if(i % 2 == 1){
                continue;
            }
            System.out.println("even number- " + i );
        }
    }
}
