class main{
    public static void main(String [] args){
        Address a1 = new Address("gzb","UP","Kenya");
        Address a2 = new Address("rgn","MG","German");

        Employee e1 = new Employee(12,"jokers",a1);
        Employee e2 = new Employee(4231,"Smother",a2);

        e1.display();
        e2.display();
    }
}

class Address{
    String city,state,country;
    public Address(String city,String state,String country){
        this.city = city;
        this.state = state;
        this.country = country;
    }
}

class Employee{
    int id;
    String name;
    Address address;

    public Employee(int id, String name, Address address){
        this.id = id;
        this.name = name;
        this.address = address;
    }

    void display(){
        System.out.println(id+" "+name);
        System.out.println(address.city+" "+address.state+" "+address.country);
    }
}