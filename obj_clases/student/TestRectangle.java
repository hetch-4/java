class TestRectangle{
    public static void main(String [] args){
        Rectangle r1 = new Rectangle();
        Rectangle r2 = new Rectangle();
        Rectangle r3 = new Rectangle();

        r1.insert(23,108);
        r2.insert(22,10);
        r3.insert(3,15);
        r1.area();
        r2.area();
        r3.area();
    }
}
class Rectangle{
    int length;
    int width;

    void insert(int w,int l){
        length = l;
        width = w;
    }
    
    void area(){
        System.out.println(width * length);
    }

}
