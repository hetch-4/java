import java.util.*;


class Main{
  public static void main(String [] args){
    System.out.println("Hello world!");

    ArrayList <Task> storage = new ArrayList<Task>();

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

          //remove task 
          storage.remove(editNo);

          //from user input get task to be edited
          System.out.println(storage.get(editNo));
          System.out.println("Enter Description");
          //description input from user
          String inputDesc = scanner.nextLine();

          System.out.println("Enter Time");
          //time input from user
          String inputTime = scanner.nextLine();

          System.out.println("Enter Date");
          //date input from user
          String inputDate = scanner.nextLine();

          //update input from user
          Task task1 = new Task(inputDesc,inputTime,inputDate);
          storage.add(task1);

          System.out.println(storage);
          break;
        case 3:
          System.out.println("Delete task");

                    System.out.println("Edit Task");
          System.out.println("choose Task");
          
          //loop through storage to check for task
          Iterator<Task> it = storage.iterator();

          int b =1;
          while(it.hasNext()){
            System.out.println(b +".  " + it.next());
            b++;
          }

          //take input from user
          int  editN = scanner.nextInt();
          scanner.nextLine();

          //remove task 
          storage.remove(editN);

          System.out.println(storage);
          break;
        case 4:
          System.out.println("Exiting ...");
          break;
        default:
          System.out.println("invalid Choice.Try again");
          break;
      }
      
      i++;
    }while(i<3);

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
    if(storage.contains(task)){
      System.out.println("Task already present");
    }
    else {
      storage.add(task);

    }
  }


  void editTask(String desc, String time, String date){
    this.description = desc;
    this.time = time;
    this.date = date;
  }

  public String toString(){
    //display the class in form of string
    return "Description :" + description +
      "\nTime : "+time+"date : " +date+"\n";
  
  }

}

