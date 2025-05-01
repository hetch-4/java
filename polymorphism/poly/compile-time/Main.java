public class Main{
    public int add(int x,int y){
        return x+y;
    }
    public int add(int x,int y,int z){
        return x+y+z;
    }
    public double add(double x,double y){
        return x+y;
    }

    public static void main(String [] args){
        Main num = new Main();
        int res1 = num.add(444,555);
        System.out.println("Two integers:"+res1);
        int res2 = num.add(444,555,666);
        System.out.println("Three integers: "+ res2);
        double res3 = num.add(10.15,20.32);
        System.out.println("Two doubles: "+ res3); 
    }
}