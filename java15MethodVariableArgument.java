public class java15MethodVariableArgument {
    public static void main(String[] args) {
        methodArgument("reynold",90,80,88,75);
    }
    static void methodArgument(String name, int...values){
        int result = 0;
        for(int value:values){
            result += value;
        }
        int total = result / values.length;
        if(total >=95){
            System.out.println("congrat " + name + " your pass the exam with Score A" + ", your score = " + total);
        }else if(total >= 80){
            System.out.println("congrat " + name + " your pass the exam with score B" + ", your score = " + total);
        }else{
            System.out.println("sorry try this again in the next year");
        }
    }
}
