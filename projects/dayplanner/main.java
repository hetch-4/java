import java.util.*;


class Main{
  public static void main(String [] args){
    System.out.println("Hello world!");

    HashSet <Task> storage = new HashSet<Task>();

    //dummy Task to add to storage
    Task b1 = new Task("cook","12 am","23");
    Task b2 = new Task("play","4 pm", "23");
    Task b3 = new Task("code","5 pm", "23");

    // add task to storage
    storage.add(b1);
    storage.add(b2);
    storage.add(b3);

    System.out.println(storage);

    //private Map<String, string> = new LinkedHashMap<>();
    Scanner scanner = new Scanner(System.in);

    int i =0;
    String description,date,time;
    do{
      System.out.println("Menu:- \n");
      System.out.println("1. Add Task\n2. Edit Task\n3. Remove Task\n4. exit");

      int choice = scanner.nextInt();
      scanner.nextLine();

      boolean lim = true;
      System.out.println(choice);

      
      switch(choice){

        case 1:
          //user input to create a task 
          System.out.println("Enter Description of Task:");
            description = scanner.nextLine();
          System.out.println("\nDate: ");
            date = scanner.nextLine();
          System.out.println("\nTime: ");
            time = scanner.nextLine();
          
          //create a task by ititialising 
          Task task = new Task(description, time, date);
          

          //add task to storage
          storage.add(task);
          System.out.println("New task created."+ task + storage);
              break;

        case 2:
          System.out.println("Edit Task");
          System.out.println("choose Task");
          
          //loop through storage to check for task
          Iterator<Task> itr = storage.iterator();

          int a =1;
          while(itr.hasNext()){
            System.out.println(a +".  " + itr.next());
            a++;
          }

          //take input from user
          int  editNo = scanner.nextInt();
          scanner.nextLine();

          System.out.println(storage[0]);
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


  void addTask(ArrayList storage,Task task){
    //add task
    // if(storage.contains(task))
    //else storage.push(task)
  }

  void deleteTask(){
    //remove task
    //if(storage.contains(task)) remove task
    //else return not found
  }

  void editTask(){
    //edit task
    //storage.search(task)
    // if found  return task 
    // delete storage(task)
    // edit task 
    // add task () 
  
  }

  public String toString(){
    //display the class in form of string
    return "Description :\n" + description +
      "\nTime : "+time+"\ndate : " +date;
  
  }

}

