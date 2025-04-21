public class main{
    public int addition(int x, int y){
        return x + y;
    }

    public int addition(int x, int y, int z){
        return x + y + z;
    }

    public double addition(double x, double y){
        return x + y;
    }

    public static void main(String [] args){
        main num = new main();
        int res1 = num.addition(6,5);
        double res2 = num.addition(9.9,7.4);
        double res3 = num.addition(300.0, 200.0);
        int res4 = num.addition(2,3,4);

        Object[] res =new Object[5];

        res[0] = res1;
        res[1] = res2;
        res[2] = res3;
        res[3] = res4;

        for(int i=0; i<=res.length; i++){
            if(res[i] == null){
                break;
            }else{
                System.out.println(res[i]);
            }
        }
    }
}