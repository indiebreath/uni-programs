public class EggWeight {
    public static void main(String[] args) {
        int eggWeight = 40;

        if (eggWeight < 43) {
            System.out.println("Egg size is Too Small");
        } else if (eggWeight >= 43 && eggWeight <= 51) {
            System.out.println("Egg size is Medium");
        } else if (eggWeight >= 52 && eggWeight <= 59) {
            System.out.println("Egg size is Large");
        } else if (eggWeight >= 60 && eggWeight <= 67) {
            System.out.println("Egg size is Extra Large");
        } else if (eggWeight >= 68 && eggWeight <= 72) {
            System.out.println("Egg size is Jumbo");
        } else if (eggWeight > 72) {
            System.out.println("Egg size is King Size");
        } else {
            System.out.println("Invalid input");
        }
    }
}
