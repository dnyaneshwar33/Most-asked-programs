
// public class leapyear{
// public static void main(String args[]){
// int year=2000;
// boolean is_leap_year=true;
// if(year%4==0){
// is_leap_year=true;
// if(year%100==0){
// if(year%400==0)
// is_leap_year=true;
// else
// is_leap_year=false;
 
// }
// }
// else 
// is_leap_year=false;
// if(is_leap_year!=true)
// System.out.println("non-leapyear");
// else
// System.out.println("leapyear");
// }
// }

public class leapyear {
    public static void main(String args[]) {

        int year = 2016;
        boolean isLeapYear = false;

        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    isLeapYear = true;
                }
            }
            else {
                isLeapYear = true;
            }
        }

        if (!isLeapYear) {
            System.out.println("Not a Leap year");
        } else {
            System.out.println("Leap year");
        }
    }
}
