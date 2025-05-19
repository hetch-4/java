import java.util.*;

class main{
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);

        Semester sem01 = new Semester();

        Course c1 = new Course("AMA 4102","Algebra","Jabuya",3,60);
        Course c2 = new Course("AMA 4231","Calculus","John",3,34);
        Course c3 = new Course("CIT 4234","Computer Security","Jackboys",3,50);
        Course c4 = new Course("AMA 4302","Probability","Mutina",3,90);
        
        sem01.availCourse(c1);
        sem01.availCourse(c2);
        sem01.availCourse(c3);
        sem01.availCourse(c4);

        Student student01 = new Student(101,"Mark Githiji");


        boolean run= true;
        while(run){
            System.out.println("- Semester Registration Module -");
            System.out.println("1.Register for a course. ");
            System.out.println("2.View Schedule.");
            System.out.println("3.Drop course.");
            System.out.println("4.Quit");
            System.out.println("\nChoose a number above.");

            int choice = scanner.nextInt();

            switch(choice){
                case 1:
                    System.out.println("\n1.View Available courses.");
                    System.out.println("2.Choose a course.");
                    System.out.println("3.View Schedule.");
                    System.out.println("99.Go Back.");

                    int choice0 = scanner.nextInt();
                    if(choice0==1){
                        //display list of available courses
                        sem01.viewAvailableCourse();
                        //Show available slots to add course
                        System.out.println("Availble free slots, to add course:- "+student01.getAvailableSlots());
                    }else if(choice0==2){
                        //student register for a course
                        try{
                            student01.registerCourse();
                        }catch(Exception e){
                            System.out.println(e);
                        }
                        
                        //add to student dashboard
                       

                    }else if(choice0==3){
                        //view display of student schedule
                    }else if(choice0==99){
                        //go back
                    }else{
                        System.out.println("Invalid Input Try again");
                    }
                    break;
                case 2:
                    //Display student schedule
                    break;

                case 3:
                    //drop course
                    System.out.println("\n1.View Schedule.");
                    System.out.println("2.My courses");
                    System.out.println("3.Select course to drop.");
                    System.out.println("99.Go back");

                    int choice1 = scanner.nextInt();

                    if(choice1==1){
                        //view schedule
                    }else if(choice1==2){
                        //print student registered courses dashboard

                    }else if(choice1==3){
                        //drop a course from student dashboard
                    }else if(choice1==99){
                        //go back
                    }else{
                        System.out.println("Invalid input:");
                    }
                    break;
                case 4:
                    //quit
                    System.out.println("Quiting...");
                    run = false;
                    break;

            }
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
        //add a course to the semester
        availableCourses.add(course);
    }
    public List viewAvailableCourse(){
        //view available courses
        Iterator itr = availableCourses.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
            for(Course course: availableCourses){
                System.out.println(course.display());
            }
        }
        return null;
    }

    public Course getCourse(String index){
        //get listed course details 
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
        System.out.println("Course Code:"+courseCode+"\ntitle: "+title+"\nInstructor:"+instructor+"\nTime:"+time+"\nCapcity:"+capacity);
        return null;
    }
}
class Student extends Semester{
    //attributes 
    //student id, name,registered courses
    private int id;
    private String name;
    List<Course> registeredCourses = new ArrayList<>(8);

    public Student(int id,String name){
        this.name=name;
        this.id = id;
    }
    
    public int getStudentId(){
        return id;
    }
    public String getStudentName(){
        return name;
    }
    public void setStudentName(String name){
        this.name = name;
    }
    public void setStudentId(int id){
        this.id = id;
    }

    //methods
    public void addCourse(Course course){
        //add course to student dashboard
        registeredCourses.add(course);
    }
    public void removeCourse(Course course){
        //drop course from dash board
        registeredCourses.remove(course);
    }
    public void viewSchedule(){
        System.out.println("Student Id:- "+getStudentId()+"\nName:- "+getStudentName());
        for(Course course:registeredCourses){
            System.out.println(course);
        }
    }
    //register course,drop course,view schedule
    public void registerCourse(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Course Code:");
        String cChoice = scanner.nextLine();
        Semester s01 = new Semester();
        Course crs01 = s01.getCourse(cChoice);
        System.out.println(crs01);
        addCourse(crs01);
        //crs01.display();
        System.out.println("Successfully registered for"+crs01);
    }
    public int getAvailableSlots(){
        return 8 - registeredCourses.size();
    }
}

