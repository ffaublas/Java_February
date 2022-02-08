public class PmLecture_Strings {
    public static void main(String[] args) {
        System.out.println("Hello Strings");

        String coolQuote = ("It is not the Mountains ahead that will wear you out, it is the pebble in your shoe");

        String author = "Muhammad Ali";

        String result = coolQuote.concat(author);

        System.out.println(result);
        // Output = It is not the Mountains ahead that will wear you out, it is the
        // pebble in your shoeMuhammad Ali

        System.out.println(coolQuote.indexOf("pebble")); // Output = 64

        generateFullName("James", "Dundee");
        generateFullName("Billy", "Dee", "Williams");
    }

    // creating our own methods here
    public static void generateFullName(String firstName, String lastName) {
        System.out.println(String.format("Hello, %s %s", firstName, lastName)); //output = Hello, James Dundee


    // Method Overloading:  IS when you have multiple methods that are the same in their return type (public static void), name of method.. but they differ in their parameters
    public static void generateFullName(String firstName, String middleName, String lastName) {
        System.out.println(String.format("Hello, %s %s %s", firstName, middleName, lastName)); // output = Hello, James
                                                                                               // Dundee

    }
}