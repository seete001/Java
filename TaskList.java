public class TaskList{

    private String[] tasks;
    private int counter;

    
    public TaskList(int maxSize){
        tasks = new String[maxSize];
        counter = 0;
    }

    public boolean add_task(String task){
     
        if(counter >= tasks.length){
            return false;
        }
        tasks[counter] = task;
        counter++;
        return true;
    }

    public boolean remove_task(int index){
     
        if(index - 1< 0 || index -1 >= counter){
            return false;
    
        }
     
        for(int i = index - 1; i < counter -  1;i++){
            tasks[i] = tasks[i + 1];    
        }

        tasks[counter - 1] = null;
        counter--;
        return true;
    
    }

    public String display_tasks(){
        if(counter == 0){
            return "";
        }
        StringBuilder sb = new StringBuilder();
        for(int i = 0;i < counter; i++){
            sb.append((i+1)).append(". ").append(tasks[i]).append("\n");
            
        }

        return sb.toString();
    }

    public int getTaskCount(){
    
        return counter;
    }
    
    public void load(){
    
    }

    public void save(){
    
    }

}
