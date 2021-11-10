public class Main {

    public static boolean isLeapYear ( int year ) {

        if ( year < 100 && year % 4 == 0 )          return true;
        else if ( (year > 100 && year < 400)  )     return (year % 4) == 0 && (year % 100) != 0;
        else if (year >= 400)                       return ((year % 4) ==0 && (year % 100) != 0 ) || year % 400 == 0;
        else                                        return false;
    }

    public static int getDaysInMonth ( int month, int year ) {

       if ( year > 1 && year < 9999 ) {
           switch (month) {
               case 1, 3, 5, 7, 8, 10, 12 -> {
                   return 31;
               }
               case 4, 6, 9, 11 -> {
                   return 30;
               }
               case 2 -> {
                   if (isLeapYear(year)) return 29;
                   else return 28;
               }
               default -> {
                   return -1;
               }
           }
       }
       else return -1;
    }


    public static void main(String[] args) {
//          * getDaysInMonth(1, 2020); → should return 31 since January has 31 days.
//
//          * getDaysInMonth(2, 2020); → should return 29 since February has 29 days in a leap year and 2020 is a leap year.
//
//          * getDaysInMonth(2, 2018); → should return 28 since February has 28 days if it's not a leap year and 2018 is not a leap year.
//
//          * getDaysInMonth(-1, 2020); → should return -1 since the parameter month is invalid.
//
//          * getDaysInMonth(1, -2020); → should return -1 since the parameter year is outside the range of 1 to 9999.


        System.out.println(getDaysInMonth(1, 2020));
        System.out.println(getDaysInMonth(2, 2020));
        System.out.println(getDaysInMonth(2, 2018));
        System.out.println(getDaysInMonth(1, -2020));
        System.out.println(getDaysInMonth(1, -2020));
    }
}
