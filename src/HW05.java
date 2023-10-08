import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class HW05 {
    public static void main(String[] args) {
        HW05 hw05 = new HW05();
        System.out.println(hw05.sumOfNumbers(new int[]{13, 34, 78, 34}));
        List<Integer> ints = new ArrayList<>();
        ints.add(20);
        ints.add(30);
        ints.add(100);
        System.out.println(average(ints));
        HW05.multiplicationTable(10);
        fizzBuzz();
        List<String> firstString = new ArrayList<>();
        firstString.add("a");
        firstString.add("b");
        firstString.add("c");
        List<String> secondString = new ArrayList<>();
        secondString.add("1");
        secondString.add("2");
        secondString.add("3");
        System.out.println(getTwoStrings(firstString, secondString));


    }


    // task 1
    public int sumOfNumbers(int[] a) {
        return Arrays.stream(a).sum();
    }


    // task 2
    public static double average(List<Integer> b) {
        double sum = 0;
        for (int a : b) {
            sum += a;
        }
        return (double) sum / b.size();
    }

    // task 3


    public static void multiplicationTable(double n) {
        for (int i = 0; i <= 15; i++) {
            int result = (int) (n * i);
            System.out.println(n + "x" + i + "=" + result);
        }
    }


// task 4

    public static void fizzBuzz() {
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("FizzBuzz");
            } else if (i % 3 == 0) {
                System.out.println("Fizz");
            } else if (i % 5 == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println(i);
            }
        }
    }

    public static List<String> getTwoStrings(List<String> firstString, List<String> secondString) {
        List<String> getTwoStrings = new ArrayList<>();
        for (int i = 0; i < firstString.size(); i++) {
            getTwoStrings.add(firstString.get(i));
            if (i < secondString.size()) {
                getTwoStrings.add(secondString.get(i));
            }
        }
        return getTwoStrings;
    }


}










