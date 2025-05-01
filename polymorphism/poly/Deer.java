
public class Deer extends Animal implements Vegeterian{
    public static void main(String [] args){
        Deer d = new Deer();
        Animal a = d;
        Vegeterian v =d;
        Object o = d;

        System.out.println(d instanceof Deer);
        System.out.println(a instanceof Deer);
        System.out.println(v instanceof Deer);
        System.out.println(o instanceof Deer);
    }
}

interface Vegeterian{}
class Animal{}
