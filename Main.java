import java.util.Scanner;

public class Main{


    public static void main(String[] args){
        
        Scanner scanner = new Scanner(System.in);    
        TaskList tasklist = new TaskList(10);
        
        System.out.println("....................................................................................\n");
        System.out.println("..............................Welcome to your To Do List............................\n");
        
        while(true){
            System.out.println(""" 
                    1. Add a new Task\n
                    2. Remove a Task\n
                    3. Display All Tasks\n
                    4. Exit 
                    """);
            System.out.println("Enter your Choice...");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch(choice){
                
                case 1 ->{
                    System.out.println("Enter your task");
                    String task = scanner.nextLine();
                    tasklist.add_task(task);
                    break;
                }
                case 2 ->{
                    System.out.println("Enter your number");
                    int index = scanner.nextInt();
                    scanner.nextLine();
                    tasklist.remove_task(index);
                    break;
                }
                case 3 ->{
                    tasklist.display_tasks();
                    break;
                }
                case 4 ->{
                    System.out.println("Goodbye");
                    scanner.close();
                    return;
                }
                    }
        }
    }




}
