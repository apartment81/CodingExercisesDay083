package ro.mirodone;



public class Main {

    static int num;
    static String myStr;

    public Main() {
        num =100;
        myStr = "Constructor";
    }

    //first static block
    static {
        System.out.println("Static block 1");
        num = 68;
        myStr = "Block1";
    }

    //second static block
    static {
        System.out.println("Static block 2");
        num = 98;
        myStr = "Block2";
    }

    public static void main(String[] args) {

        Main a = new Main();
        System.out.println("Value of num = " + a.num);
        System.out.println("Value of myStr = " + a.myStr);


    }
}
