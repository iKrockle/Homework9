public class Main {
    public static void main(String[] args) {
        task1();
        System.out.println();
        task2();
        System.out.println();
        task3();
        System.out.println();
        task4();
        System.out.println();
    }

    public static void task1(){
        int[] arrInt = generateRandomArray();
        int summa = 0;
        for (int row:arrInt){
            summa+=row;
        }
        System.out.println("Сумма трат за месяц составила "+summa+" рублей");
    }
    public static void task2(){
        int[] arrInt = generateRandomArray();
        int min = arrInt[0];
        int max = arrInt[0];

        for (int i : arrInt) {
            if (i < min) {
                max = i;
            }
        }

        for (int i : arrInt) {
            if (i > max) {
                max = i;
            }
        }

        System.out.println("Минимальная сумма трат за день составила "+min+" рублей. " +
                "Максимальная сумма трат за день составила "+max+" рублей.");
    }

    public static void task3(){
        int[] arrInt = generateRandomArray();
        int avgSumma = 0;
        for (int row:arrInt){
            avgSumma+=row;
        }
        avgSumma = avgSumma/arrInt.length;
        System.out.println("Средняя сумма трат за месяц составила "+avgSumma+" рублей");
    }

    public static void task4(){
        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for(int i=reverseFullName.length-1;i>=0;i--){
            System.out.print(reverseFullName[i]);
        }
    }

    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }
}