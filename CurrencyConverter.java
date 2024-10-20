import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;

public class CurrencyConverter {
    private static Map<String, Double> getExchangeRates() {
        Map<String, Double> rates = new HashMap<>();
        rates.put("USD", 1.0);   
        rates.put("EUR", 0.92);   
        rates.put("GBP", 0.81);   
        rates.put("INR", 82.73);  
        rates.put("JPY", 149.55); 
        return rates;
    }

    public static void main(String[] args) {
        Map<String, Double> exchangeRates = getExchangeRates();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Available Currencies: " + exchangeRates.keySet());
        System.out.print("Enter Base Currency: ");
        String baseCurrency = scanner.next().toUpperCase();
        System.out.print("Enter Target Currency: ");
        String targetCurrency = scanner.next().toUpperCase();
        System.out.print("Enter the Amount to convert: ");
        double amount = scanner.nextDouble();
        if (exchangeRates.containsKey(baseCurrency) && exchangeRates.containsKey(targetCurrency)) {
            double baseRate = exchangeRates.get(baseCurrency);
            double targetRate = exchangeRates.get(targetCurrency);
            double convertedAmount = (amount / baseRate) * targetRate;
            System.out.printf("%.2f %s = %.2f %s%n", amount, baseCurrency, convertedAmount, targetCurrency);
        } else {
            System.out.println("Invalid currency code entered. Please check the currency codes and try again.");
        }
        scanner.close();
    }
}


