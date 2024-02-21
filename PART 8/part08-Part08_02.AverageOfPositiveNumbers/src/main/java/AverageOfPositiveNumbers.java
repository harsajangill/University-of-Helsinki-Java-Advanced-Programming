
import java.util.Scanner;
import java.util.ArrayList;

public class AverageOfPositiveNumbers {
    private ArrayList<Integer> numbers;

    public AverageOfPositiveNumbers(){
        this.numbers = new ArrayList<>();
    }

    public double returnAverage(){
        int sum = 0;
        for (int number : this.numbers){
            sum+= number;
        }
        double average = (double) sum / this.numbers.size();
        return average;
    }

    public void addNumber(int number){
        this.numbers.add(number);
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        AverageOfPositiveNumbers numbers = new AverageOfPositiveNumbers();
    

        while(true){
            int input = Integer.valueOf(scanner.nextLine());

            if(input == 0){
                if (numbers.numbers.isEmpty()) {
                    System.out.println("Cannot calculate the average");
                    break;
                }
                System.out.println(numbers.returnAverage());
                break;
            }

            if (input > 0) {
                numbers.addNumber(input);
            }
        }

    }
}
