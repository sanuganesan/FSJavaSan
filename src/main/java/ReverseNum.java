public class ReverseNum {


    static int reminder = 0;
    static int reverse = 0;


    public static void reverseNum(int n) {

        for (int i = n; i != 0; i = i / 10) {
            reminder = i % 10;
            reverse = reverse * 10 + reminder;
        }
        System.out.println(reverse);


    }

    public static void main(String[] args) {
        reverseNum(-12356);
    }

}







