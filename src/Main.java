import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.println("Which month that you want to cout days?");
        int month =scanner.nextInt();
        String daysInMonth;

        switch (month){
            case 2:
                daysInMonth = "28 or 29";
                //System.out.println("The month '2' has 28 or 29s!");
                break;
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                daysInMonth = "31";
               // System.out.print("The month '" + month+"' has 31 days!");
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                daysInMonth = "30";
                //System.out.print("The month '" + month+"' has 30 days!");
                break;
            default:
                daysInMonth="";
                //System.out.println("Invalid input");
                break;


        }
        if(!daysInMonth.equals("")) System.out.printf("The month '%d' has %s days!", month, daysInMonth);
                else System.out.print("INvalid input");

    }
}