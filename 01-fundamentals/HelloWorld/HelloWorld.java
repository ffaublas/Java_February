public class HelloWorld {
    // the entry point to our application is called the main method
    public static void main(String[] args) {

        String name = "Lebron";

        // primitive type of "int". Primitive types contain the minumum requirements to
        // store the variable as an integer. No ohter built in features are available.
        // The benefits of this is that it takes up less memory. The downside, it has
        // less built in functions available.
        int numberOfChampionships = 4;

        // Integer is an object type. Different from primitive type "int" because it
        // comes wiht more built in features and still lets you store int types.
        // Benefits = gives you more built in functios for variables; downside = it
        // takes up more memory.
        Integer jerseyNumber = 23;

        System.out.println("Hello World");
        System.out.println("How's it going?, " + name);
        // System.out.println("You have this amount of championships: "+
        // numberOfChampionships );
        System.out.println(String.format("How is it going %s , your jersey number is %s ", name, jerseyNumber));

        System.out.println("Hope the algos were more clear after the explanation");

        if (numberOfChampionships >= 6) {
            System.out.println("Oh, so you think your are like Mike");
        } else if (numberOfChampionships == 5) {
            System.out.println("Almost like Mike");
        } else {
            System.out.println("no, not like mike");
        }
    }
}