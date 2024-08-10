import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        Scanner inp = new Scanner(System.in);

        System.out.print("How many numbers will you enter : ");
        int N = inp.nextInt();
        if(N < 0){
            System.out.print("You entered an invalid value");
            return;
        }

        System.out.print("1. number: ");
        int number = inp.nextInt();
        int min = number, max = number;

        for(int i = 2; i <= N; i++){
            System.out.print(+i+". number: ");
            number = inp.nextInt();
            if(number > max)
                max = number;
            if(number < min)
                min = number;
        }

        System.out.println("Minimum number: "+min);
        System.out.println("Maximum number: "+max);

    }
}