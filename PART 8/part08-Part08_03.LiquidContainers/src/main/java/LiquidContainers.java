
import java.util.Scanner;

public class LiquidContainers {
    private Container one;
    private Container two;

    public LiquidContainers(){
        this.one = new Container();
        this.two = new Container();
    }

    public void addAmount(int amount){
        this.one.add(amount);
    }

    public void moveAmount(int amount){
        if (amount > 0){
            if (amount > this.one.getVolume()){
                this.two.add(this.one.getVolume());
                this.one.remove(amount);
            } else{
                this.two.add(amount);
                this.one.remove(amount);
            }
        }
    }

    public void removeAmount(int amount){
        if (amount > 0){
            this.two.remove(amount);
        }
    }



    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        LiquidContainers containers = new LiquidContainers();

        while (true) {
            System.out.println("First: " + containers.one.getVolume() +"/100");
            System.out.println("Second: " + containers.two.getVolume() +"/100");

            System.out.print("> ");

            String input = scan.nextLine();
            System.out.println("");
            if (input.equals("quit")) {
                break;
            }

            String[] pieces = input.split(" ");
            String command = pieces[0];
            int amount = Integer.valueOf(pieces[1]);

            if (command.equals("add")){
                containers.addAmount(amount);
            }

            if(command.equals("move")){
                containers.moveAmount(amount);
            }

            if(command.equals("remove")){
                containers.removeAmount(amount);
            }

        }
    }

}
