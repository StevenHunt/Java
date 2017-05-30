public class dateDemo {

	public static void main(String[] args) {
    
        Date date1 = new Date("December", 16, 1770),
             date2 = new Date(1, 27, 1756),
             date3 = new Date(1882),
             date4 = new Date( );

        System.out.println("Whose birthday is " + date1 + "?");
        System.out.println("Whose birthday is " + date2 + "?");
        System.out.println("Whose birthday is " + date3 + "?");
        System.out.println("The default date is " + date4 + ".");
     }
}

/** ======== OUTPUT ==========

Whose birthday is December 16, 1770?
Whose birthday is January 27, 1756?
Whose birthday is January 1, 1882?
The default date is January 1, 1000.


     ========================= */
