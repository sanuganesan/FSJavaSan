public class addition {

   static  int global = 200;

    public static  void additionOfNumber(int a , int b)
    {
        int Result = a + b;
        System.out.println("Sum of two Number :" +Result);
        addition k2 = new addition();
       k2.global= 300;
        System.out.println(global);


    }

    private float divisionOfNumbers()
    {
        addition k2 = new addition();
        addition.global= 3000;
        System.out.println(global);
        int a = 3;
        int b = 2;
        float result =  (float) a /b;

        System.out.println ("Division of two Number :" + result+global);
    return result;
    }

    public void subtractNumbers(int a1)
    {
        float b1 = divisionOfNumbers();
       float result = a1-b1;
        System.out.println("Minus of Number : " + result);
    }
public void Multiplication(int q, int p)
{
   int  result = q*p;
   System.out.println("Multiplication of Number : " + result);

}

    public static void main(String[] args) {

       addition c1 = new addition();
       c1.subtractNumbers(5);
       additionOfNumber(5,6);
        addition.global= 900;
        System.out.println(global);

    }

}
