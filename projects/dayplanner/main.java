import java.util.*;


class Main{
  public static void main(String [] args){
    System.out.println("Hello world!");

    //private Map<String, string> = new LinkedHashMap<>();
    Scanner scanner = new Scanner(System.in);

    int i =0;
    do{
      System.out.println("Menu:- \n");
      System.out.println("1. Add Task\n2. Edit Task\n3. Remove Task\n4. exit");

      int choice = scanner.nextInt();

      boolean lim = true;
      System.out.println(choice);

      
      switch(choice){
        case 1:
          System.out.println("Enter Description of Task");
              break;
        case 2:
          System.out.println("Edit Task");

          break;
        case 3:
          System.out.println("Delete task");

          break;
        case 4:
          System.out.println("Exiting ...");
          break;
        default:
          System.out.println("invalid Choice.Try again");
          break;
      }
      
      i++;
    }while(i<1);

  }
}


class Task{
  String description,time,date;

  // class constructor
  public Task(String desc, String time, String date){
    this.description = desc;
    this.time = time;
    this.date = date;
  }


  void addTask(){
    //add task
  }

  void deleteTask(){
    //remove task
  }

  void editTask(){
    //edit task
  }

  public String toString(){
    //display the class in form of string
    return "Description :\n" + description +
      "Time :"+time+"\n"+date;
}

}
