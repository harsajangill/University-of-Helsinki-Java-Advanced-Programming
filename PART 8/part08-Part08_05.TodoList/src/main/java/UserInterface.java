import java.util.Scanner;

public class UserInterface {
    private Scanner scanner;
    private TodoList todoList;

    public UserInterface(TodoList todoList,Scanner scanner){
        this.scanner = scanner;
        this.todoList = todoList;
    }

    public void start(){
        while (true){
            System.out.print("Command: ");
            String input = this.scanner.nextLine();

            if(input.equals("stop")){
                break;
            }

            if(input.equals("add")){
                System.out.print("To add: ");
                String task = this.scanner.nextLine();

                this.todoList.add(task);
            }

            if(input.equals("list")){
                this.todoList.print();
            }

            if (input.equals("remove")){
                System.out.println("Which one is removed? ");
                int task = Integer.valueOf(this.scanner.nextLine());
                this.todoList.remove(task);
            }
        }
    }

}
