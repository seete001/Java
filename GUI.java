import javax.swing.JOptionPane;

class GUI{

    public static void main(String[] args){
        boolean login = UserPass.authenticate();
        if(!login) System.exit(0);        

        TaskList tasklist = new TaskList(10);
        
        
        while(true){
            String[] options = {"Add Task","Remove Task","Display Tasks","Exit"};
            
            int choice = JOptionPane.showOptionDialog(
                    null,
                    "Choose",
                    "To-Do List",
                    JOptionPane.DEFAULT_OPTION,
                    JOptionPane.QUESTION_MESSAGE,
                    null,
                    options,
                    options[0]);
            switch(choice){
                
                case 0 ->{
                    String task = JOptionPane.showInputDialog("Enter your Task");
                    tasklist.add_task(task);
                    break;
                }
                case 1 ->{
                    String index = JOptionPane.showInputDialog( "Enter the Number of task");
                    try{
                        int idx = Integer.parseInt(index);
                        tasklist.remove_task(idx);
                        break;
                    }
                    catch(NumberFormatException e) {
                        JOptionPane.showMessageDialog(null, "Invalid", "Error", JOptionPane.ERROR_MESSAGE);
                    }
                }
                case 2 ->{
                    String alltasks = tasklist.display_tasks();
                    if (alltasks.isEmpty()){
                        JOptionPane.showMessageDialog(null, "No Tasks yet");
                    }
                    else{
                        JOptionPane.showMessageDialog(null, alltasks, "Your Tasks", JOptionPane.INFORMATION_MESSAGE);
                    }
                    break;
                }
                case 3 ->{
                    JOptionPane.showMessageDialog(null, "Good to see you, bye");
                    System.exit(0);
                    return;
                }
                    }
        }

    }
}
