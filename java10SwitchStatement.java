public class java10SwitchStatement {
    public static void main(String[] args) {
        // switch
        int nilaiAdi = 90;
        switch(nilaiAdi){
            case 100,90:
                System.out.println("congrat your value is A");
                break;
            case 80,70:
                System.out.println("congrat your value is B");
                break;
            default:
                System.out.println("sorry your fail in exam, try next year");
        }

        // switch lambda
        int nilaiUcup = 100;
        switch(nilaiUcup){
            case 100,90 -> {
                System.out.println("congrat you got value A");
            }
            case 80,70 -> {System.out.println("congrat you got value B");}
            default -> System.out.println("sorry you fail the exam");
        }

        // without keyword yield
        String ucapan;
        int nilaiUdin = 100;

        switch(nilaiUdin){
            case 100,90 -> ucapan = "congrat you got value Z";
            case 80,70 -> ucapan = "congrat you got value B";
            default -> ucapan =  "sorry you fail in exam";
        }
        System.out.println(ucapan);

        // with keyword yield
        int nilai = 100;
        ucapan = switch(nilai){
            case 100,90:
                yield "congrat your value is A";
            case 80,70:
                yield "congrat you got value B";
            default:
                yield "sorry you fail the exam";
        };
        System.out.println(ucapan);
    }
}
