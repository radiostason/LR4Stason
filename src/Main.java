public class Main {

    public static void main(String[] args) {
        // int[] myAges1 = { 15, 35, 40, 70 };
        // int[] myAges2 = { 15, 35, 40, 70 };
        // checkAgeRange(myAges1);
        // checkAgeRange(myAges2);
        int result = sum(2, 2);
        // System.out.println("Sum is " + result);
        int[] numbers = {1, 2, 3, 4, 5, 6, 7};
        breakSample(numbers);
    }

    public static void checkAgeRange(int[] ages) {
        //  int age = 0;
        // for (int i = 0; i < ages.length; i++) {
        for (int age : ages) {
            //      age = ages[i];
            if (age < 30) {
                System.out.println("Age is less then 30.");
            } else if (age > 40) {
                System.out.println("Age is higher then 40.");
            } else {
                System.out.println("Age is between 30 and 40.");
            }

            System.out.println(age);
        }
    }

    public static int sum(int a, int b) {
        return a + b;
    }

    public static void breakSample(int[] numbers) {
        for (int number : numbers) {
            if(number == 4){
                // continue;
                break;
                // код после не выполняется
                // цикл тоже прерывается
            }
            System.out.println(number);
        }
    }

}