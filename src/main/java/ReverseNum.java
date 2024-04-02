public class ReverseNum {


     int reminder = 0;
     int reverse = 0;


    public  void reverseNum(int n) {

        for (int i = n; i != 0; i = i / 10) {
            reminder = i % 10;
            reverse = reverse * 10 + reminder;
        }
        System.out.println(reverse);


    }

    public static void main(String[] args) {
        ReverseNum r1 = new ReverseNum();
        r1.reverseNum(-23569);
    }

}







