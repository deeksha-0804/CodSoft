import java.util.Scanner;

public class currencyconverter{
    public static void main(String[] args) {

       
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Welcome to Currency Converter!");
        System.out.println("1 Rupee to USD");
        System.out.println("2 Rupee to Euro");
        System.out.println("3 Rupee to UAE Dirham");
        System.out.println("4 USD to Rupee");
        System.out.println("5 Euro to Rupee");
        System.out.println("6 UAE Dirham to Rupee");
        System.out.print("Enter your choice (1 or 2 or 3 or 4 or 5 or 6): ");
        int choice = scanner.nextInt();

       
        if (choice == 1) {
            System.out.print("Enter the amount in Rupee: ");
            double Rupee = scanner.nextDouble();
            double USD = RupeeToUsd(Rupee);
            System.out.println("Converted amount in USD: " + USD);

        } 
            else if (choice == 2) {
                System.out.print("Enter the amount in Rupee: ");
                double Rupee = scanner.nextDouble();
                double Euro = RupeeToEuro(Rupee);
                System.out.println("Converted amount in Euro: " + Euro);
        }
            else if (choice == 3) {
                System.out.print("Enter the amount in Rupee: ");
                double Rupee = scanner.nextDouble();
                double UAEDirham = RupeeToUaeDirham(Rupee);
                System.out.println("Converted amount in UAEDirham : " + UAEDirham);
        } 
            else if (choice == 4) {
                System.out.print("Enter the amount in USD: ");
                double USD = scanner.nextDouble();
                double Rupee = UsdToRupee(USD);
                System.out.println("Converted amount in Rupee: " + Rupee);
        }
            else if (choice == 5) {
                System.out.print("Enter the amount in Euro: ");
                double Euro = scanner.nextDouble();
                double Rupee = euroToRupee(Euro);
                System.out.println("Converted amount in Rupee: " + Rupee);
        }
            else if (choice == 6) {
                System.out.print("Enter the amount in UAEDirham: ");
                double UAEDirham = scanner.nextDouble();
                double Rupee = UaeDirhamToRupee(UAEDirham);
                System.out.println("Converted amount in Rupee: " + Rupee);
        }
       
        else {
            System.out.println("Invalid choice. Please select 1 or 2 or 3 or 4 or 5 or 6.");
        }

        scanner.close();
    }

    public static double RupeeToUsd(double Rupee) {
        return Rupee * 0.012; 
    }
    public static double RupeeToEuro(double Rupee) {
        return Rupee * 0.011;   
    }
    public static double RupeeToUaeDirham(double Rupee) {
        return Rupee * 0.044;  
    }
    public static double UsdToRupee(double USD) {
        return USD * 83.52;   
    }
    public static double euroToRupee(double Euro) {
        return Euro * 91.21;   
    }
    public static double UaeDirhamToRupee(double UAEDirham) {
        return UAEDirham * 22.74;   
    }
}
