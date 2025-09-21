public class TaskList{

    private String[] tasks;
    private int counter;

    
    public TaskList(int maxSize){
        tasks = new String[maxSize];
        counter = 0;
    }

    public boolean add_task(String task){
     
        if(counter >= tasks.length){
            System.out.println("Task List is full.");
            return false;
        }
     
        tasks[counter] = task;
        System.out.println("Successfully added.");
        counter++;
        return true;
    }

    public boolean remove_task(int index){
     
        if(index - 1< 0 || index -1 >= counter){
            System.out.println("Invalid index!");
            return false;
    
        }
     
        for(int i = index - 1; i < counter -  1;i++){
            tasks[i] = tasks[i + 1];    
        }

        tasks[counter - 1] = null;
        counter--;
        System.out.println("Successfully removed.");
        return true;
    
    }

    public void display_tasks(){
        if(counter == 0){
            System.out.println("No Task in the List.");
            return;
        }
        for(int i = 0;i < counter; i++){
            System.out.println((i+1)+". "+tasks[i]);
        }

    }

    public int getTaskCount(){
    
        return counter;
    }

}
