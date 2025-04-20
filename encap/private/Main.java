class A{
    private int data = 40;
    private void msg(){
        System.out.println("Joker, toka hapa!");
    }
}

public class Simple{
    public static void main(String [] args){
        A obj = new A();
        obj.msg();//compilation error
    }
}