public class HomeWorkApp {

    public static void main (String[] args) {
        printThreeWords();
        checkSumSign();
        printColor();
        compareNumbers();
    }

    public static void printThreeWords() {
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }

    public static void checkSumSign() {
        int a = 15;
        int b = 24;

        if (a + b >= 0) {
            System.out.println("a + b >= 0! Сумма положительная");
        } else {
            System.out.println("Сумма отрицательная");
        }

    }

     public static void printColor() {
            int value = 87;

         if (value <= 0) {
             System.out.println("Красный");
         }
         if (value > 0 & value <= 100) {
             System.out.println("Жёлтый");
         }
         if (value > 100) {
             System.out.println("Зелёный");
         }

        }

        public static void compareNumbers() {
            int a = 34 + 25;
            int b = 16 + 43;

            if (a >= b) {
                System.out.println("a >= b");
            }
            if (a < b) {
                System.out.println("a < b");
            }

        }


}
