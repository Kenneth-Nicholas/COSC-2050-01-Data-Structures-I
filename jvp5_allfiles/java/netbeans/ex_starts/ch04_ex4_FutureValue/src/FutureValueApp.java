import java.util.Scanner;
import java.text.NumberFormat;

public class FutureValueApp {

    public static void main(String[] args) {
        System.out.println("The Future Value Calculator\n");
        
        Scanner sc = new Scanner(System.in);
        String choice = "y";
        
        while (choice.equalsIgnoreCase("y")) {

            System.out.print("Enter monthly investment:   ");
            double monthlyInvestment = sc.nextDouble();

            System.out.print("Enter number of years:      ");
            int years = sc.nextInt();
            
            NumberFormat currency = NumberFormat.getCurrencyInstance();
            NumberFormat percent = NumberFormat.getPercentInstance();
            percent.setMinimumFractionDigits(1);
            
            String table = "";
            String headerRow = "Year     ";
            for (double rate = 5.0; rate < 7.0; rate += .5)
            {
                headerRow += percent.format(rate/100) + "     "; 
            }
            table += headerRow + "\n";
            
            for (int i = 1; i <= years; i++)
            {
                String row = i + "     ";
                
                for (double rate = 5.0; rate < 7.0; rate += .5)
                {
                    int months = i * 12;
                    double monthlyInterestRate = rate / 12 / 100;
                    
                    double futureValue = 0.0;
                    for (int j = 1; j <= months; j++)
                    {
                        futureValue = (futureValue + monthlyInvestment) * (1 + monthlyInterestRate);
                    }
                    row += currency.format(futureValue) + "     ";
                }
                table += row + "\n";
            }
            
            System.out.println(table);
            
            System.out.print("Continue? (y/n): ");
            choice = sc.next();
            System.out.println();
        }
        System.out.println("Bye!");
    }
}