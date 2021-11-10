public class Main {

    public static void main(String[] args) {

//        * shouldWakeUp (true, 1); → should return true
//        * shouldWakeUp (false, 2); → should return false since the dog is not barking.
//        * shouldWakeUp (true, 8); → should return false, since it's not before 8.
//        * shouldWakeUp (true, -1); → should return false since the hourOfDay parameter needs to be in a range 0-23.

        System.out.println( barkingDog.shouldWakeUp (true, 23) );
        System.out.println( barkingDog.shouldWakeUp (false, 2) );
        System.out.println( barkingDog.shouldWakeUp (true, 8) );
        System.out.println( barkingDog.shouldWakeUp (true, 100) );
    }
}
