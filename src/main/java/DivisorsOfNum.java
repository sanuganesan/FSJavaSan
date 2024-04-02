public class DivisorsOfNum {


    private void divisors(int num) {


        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                System.out.println(i);
            }


        }

    }

    public static void main(String[] args) {
        DivisorsOfNum d1 = new DivisorsOfNum();
        d1.divisors(49);


    }
}
