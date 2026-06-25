public class ForecastingTool {

    public static double calculateFutureValue(double currentAmount, double growthRate, int years) {
        if (years == 0) {
            return currentAmount;
        }

        double nextYearAmount = currentAmount * (1 + growthRate);

        return calculateFutureValue(nextYearAmount, growthRate, years - 1);
    }

    public static void main(String[] args) {
        double initialInvestment = 1000.0;
        double annualGrowthRate = 0.10;
        int forecastYears = 3;

        System.out.println("========================================");
        System.out.println("   Financial Forecasting Tool Backend   ");
        System.out.println("========================================");
        
        double finalForecast = calculateFutureValue(initialInvestment, annualGrowthRate, forecastYears);
        
        System.out.printf("Initial Investment: $%.2f%n", initialInvestment);
        System.out.printf("Growth Rate: %.0f%%%n", (annualGrowthRate * 100));
        System.out.printf("Forecasted Value after %d years: $%.2f%n", forecastYears, finalForecast);
        System.out.println("========================================");
    }
}