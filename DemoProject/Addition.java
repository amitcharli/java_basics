package DemoProject;

public class Addition{
    //class variables declaration
    public static int First = 100;
    public static int Second = 200;
    //instance variable declaration
    protected int first;
    protected int second;
    protected int third;
    //final variable declaration
    final int p = 1;
    //public constructor
    public Addition(int a, int b){
        this.first = a;
        this.second = b;
        int x = sum(this.first, this.second);
        System.out.println(x);
        int m = multiply(a,b);
        System.out.println("This is a private method: "+m);
        System.out.println(p);
    }
    // private constructor
    private Addition(int a, int b, int c){
        this.first = a;
        this.second = b;
        this.third =c;
    }

    public int sum(int a, int b){
        int number = a+b;
        return number;
    }
    protected int substract(int a, int b){
        int final_number = a-b;
        return final_number;
    }

    private int multiply(int a, int b){
        int new_number = a*b;
        return new_number;
    }
    protected static int square(int a){
        int square = a*a;
        return square;
    }

    final void show(){
        int temp = 2;
        System.out.println("this is not zero");
    }

    public static void main(String[] args){
        Addition wow = new Addition(10, 20,30);
        System.out.println(wow.third);
    }
}

