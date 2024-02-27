import java.util.Scanner;

public class BadSubscriptCaught {
    public static void main(String[] args) {
        String[] names = {"Alexia","Adam","Gabe","Hadassah","Maria","Ana","Julia","Bianca","Alexandra","John"};
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the position of the name you want displayed: ");

        try{
            int position = scanner.nextInt();
            String name = names[position];
            System.out.println("At the position " + position + "is the name " + name);
        }
        catch (ArrayIndexOutOfBoundsException exception){
            System.out.println("This position is out of range.");
        }

    }
}