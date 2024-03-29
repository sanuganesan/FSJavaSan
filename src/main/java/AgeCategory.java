public class AgeCategory {
    public void ageCategoryDef(int age, String gender) {

        if (age > 0) {
            if (age <= 18) {
                if(gender.equals("male"))
                {
                    System.out.println("boy");
                } else {
                    System.out.println("Girl");
                }
            } else if ((age >=19) && (age <= 60)) {

                if(gender.equals("male"))
                {
                    System.out.println("Men");
                }
                else {
                    System.out.println("Women");
                }}
else
{
    System.out.println("Senior Citizen");
}

}
else{
            System.out.println("Please enter valid age");
}}

    public static void main(String[] args) {
        AgeCategory k1 = new AgeCategory();
k1.ageCategoryDef(60,"male");
}


}