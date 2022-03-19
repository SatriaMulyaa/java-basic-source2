public class java07ConversionDataTypeNonPrimitive {
    public static void main(String[] args){
        System.out.println("==non primitive to primitive with same data type==");
        Integer ageObject = 30;
        int age = ageObject;
        System.out.println(age);

        System.out.println("==non primitive to primitive with Not same data type==");
        long value1 = ageObject.longValue();
        System.out.println(value1);

        System.out.println("convert primitive to non primitive with Same data type");
        short value2 = 100;
        Short value3 = value2;
        System.out.println(value3);

        System.out.println("convert primitive to non primitive with Not Same data type");
        int value4 = 4000;
        Long value5 = Long.valueOf(value4);
        System.out.println(value5);
    }
}
