import java.util.*;

class main{
    public static void main(String [] args){
        Semester sem01 = new Semester();

        Scanner scanner = new Scanner(System.in);

        Course c1 = new Course("AMA 4102","Algebra","Jabuya",3,60);
        Course c2 = new Course("AMA 4231","Calculus","John",3,34);
        Course c3 = new Course("CIT 4234","Computer Security","Jackboys",3,50);
        Course c4 = new Course("AMA 4302","Probability","Mutina",3,90);
        
        sem01.availCourse(c1);
        sem01.availCourse(c2);
        sem01.availCourse(c3);
        sem01.availCourse(c4);

        try{
            System.out.println("Enter Course code");
            String cChoice = scanner.nextLine();
            System.out.println(cChoice);
            System.out.println(sem01.getCourse(cChoice));

        }catch(Exception e){
            System.out.println(e);
        }
        
                            
    }
}
class Semester{
    //attributes 
    //List of available courses
    List<Course> availableCourses = new ArrayList<>();
     
    //methods
    //adding course,viewing available courses,
    public void availCourse(Course course){
        availableCourses.add(course);
    }
    public List viewAvailableCourse(){
        
        Iterator itr = availableCourses.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
        return null;
    }

    public Course getCourse(String index){
        for(Course course:availableCourses){
            //each couse code in available courses
            String j = course.getCourseCode();
            //System.out.println(j+":"+iot);
            try{
                if(j.equals(index)){
                System.out.println("Course found!");
                System.out.println(course.display());

                return course;
                }
            }    
            catch (Exception e){
                System.out.println(e);
            }
            
        }
        return null;
    }
    // registering courses,dropping courses,
    // view schedule
}
class Course extends Semester{
    //attributes
    //course code,title,instructor,time,capacity
    private String courseCode,title,instructor;
    private int time,capacity;//time in months
    
    public Course(String code, String title, String instructor,int time,int cap){
        this.courseCode = code;
        this.title = title;
        this.instructor = instructor;
        this.time = time;
        this.capacity = cap;
    } 

    //getters & setters for the attribute
    //getters
    public String getCourseCode(){
        return courseCode;
    }
    public String getTitle(){
        return title;
    }
    public String getInstructor(){
        return instructor;
    }
    public int getTime(){
        return time;
    }
    public int getCapacity(){
        return capacity;
    }
    //setters
    public void setCourseCode(String code){
        this.courseCode = code;
    }
    public void setTitle(String title){
        this.title = title;
    }
    public void setInstructor(String inst){
        this.instructor = inst;
    }
    public void setTime(int time){
        this.time = time;
    }
    public void setCapacity(int cap){
        this.capacity = cap;
    }

    public void addCapacity(){
        this.capacity += 1;
    }
    public void reduceCapacity(){
        this.capacity -= 1;
    }

    public String display(){
        System.out.println("Course Code:"+courseCode+"\ntitle: "+title+"\nInstructor:"+instructor+"\nTime:"+time+"Capcity:"+capacity);
        return null;
    }
}