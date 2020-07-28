package DemoProject;

public class Main {

    public static void main(String[] args) {
        Addition add = new Addition(200, 100);
        int a = add.sum(2000, 3000);
        System.out.println(a);
        int s = add.substract(-200, 500);
        System.out.println(s);
        int m = Addition.square(a);
        System.out.println(m);
        System.out.println("class variable's value is: "+Addition.First+" & "+Addition.Second);
        System.out.println("Instance variable's values are: "+add.first+" & "+add.second);
    }
}
