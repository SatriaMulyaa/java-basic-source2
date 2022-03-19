public class java02TypeDataNumber {
    public static void main(String[] args) {
        byte thisByte = 120;
        System.out.println(thisByte);
        short thisShort = 32000;
        System.out.println(thisShort);
        int thisInt = 1000000;
        System.out.println(thisInt);
        long thisLong = 1000000000;
        System.out.println(thisLong);

        int hexa = 0xA123131;
        System.out.println(hexa);
        int binar = 0b1010101;
        System.out.println(binar);

        // underscore
        int a = 1_000_000_000;
        System.out.println(a);

        /*
        * widening casting = byte -> short -> int -> long
        * narrowing casting = long -> int -> short -> byte
        * */

        System.out.println("===Widening Casting===");
        byte bytes = 120;
        short shorts = bytes;
        System.out.println(shorts);

        System.out.println("===Narrowing Casting===");
        long thisLongs = 1000000L;
        int thisInts = (int)thisLongs;
        System.out.println(thisInts);

        System.out.println("===number overflow===");
        short thisShorts = 129;
        byte thisBytes = (byte)thisShorts;
        System.out.println(thisBytes);
    }
}
