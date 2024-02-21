
import java.util.Scanner;

public class Cubes {

    public Cubes(){

    }


    public int findCube(int number){
        return (number * number * number);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            String input = scanner.nextLine();

            if (input.equals("end")){
                break;
            }

            Cubes newCube = new Cubes();

            System.out.println(newCube.findCube(Integer.valueOf(input)));

        }

    }
}
