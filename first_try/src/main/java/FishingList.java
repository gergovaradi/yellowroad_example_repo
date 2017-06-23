import java.util.Arrays;
import java.util.List;

/**
 * Created by bbencze on 2017.06.20..
 */
public class FishingList {


    public static void main(String[] args) {


        List<String> fishingList = Arrays.asList("rods", "reels", "bait", "lunch");
        for (String fish: fishingList) {
            System.out.println(fish);
        }
        int a = 55;
        a >>= 3;
        System.out.println(a);


        long p = 17496; // 'prime number' candidate
        Double primeSquareRoot = Math.sqrt(p);
        boolean isPrime = true;
        for (long j = 2; j <= primeSquareRoot.longValue(); j++) {
            if (p % j == 0) {
// Print divisors
                System.out.println(j + "x" + p / j);
                isPrime = false;
            }
        }
        System.out.println("Prime number: " + isPrime);

        String str = "xuywvdywbqqqqooopp";
        System.out.println(str.indexOf("dy", 10));
    }
}
