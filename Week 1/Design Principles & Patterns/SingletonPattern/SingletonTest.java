// SingletonTest.java
// This class TESTS that our Logger Singleton works correctly

public class SingletonTest {

    public static void main(String[] args) {

        System.out.println("========================================");
        System.out.println("   Singleton Pattern - Logger Demo");
        System.out.println("========================================\n");

        // -------------------------------------------------------
        // TEST 1: Get the Logger instance from different places
        // -------------------------------------------------------
        System.out.println("--- TEST 1: Getting Logger instances ---");

        // Getting instance the first time — Logger is created HERE
        Logger logger1 = Logger.getInstance();

        // Getting instance the second time — NO new Logger is created
        Logger logger2 = Logger.getInstance();

        // Getting instance the third time — Still the SAME logger
        Logger logger3 = Logger.getInstance();

        System.out.println("\nAre logger1 and logger2 the SAME object? "
                + (logger1 == logger2));  // Should print: true

        System.out.println("Are logger2 and logger3 the SAME object? "
                + (logger2 == logger3));  // Should print: true

        System.out.println("logger1 memory address: " + logger1.hashCode());
        System.out.println("logger2 memory address: " + logger2.hashCode());
        System.out.println("logger3 memory address: " + logger3.hashCode());
        // All three hashCodes will be IDENTICAL — same object!

        // -------------------------------------------------------
        // TEST 2: Log from different "modules" of the application
        // -------------------------------------------------------
        System.out.println("\n--- TEST 2: Logging from different modules ---");

        // Module 1: Login Service
        Logger.getInstance().logInfo("User 'john_doe' attempted login");
        Logger.getInstance().logInfo("Login successful for 'john_doe'");

        // Module 2: Database Service
        Logger.getInstance().logInfo("Database connection established");
        Logger.getInstance().logWarning("Query took longer than expected: 2.3s");

        // Module 3: Payment Service
        Logger.getInstance().logInfo("Payment of $99.99 initiated");
        Logger.getInstance().logError("Payment gateway timeout! Retrying...");
        Logger.getInstance().logInfo("Payment successful on retry");

        // -------------------------------------------------------
        // TEST 3: Verify all logs are in the SAME logger
        // -------------------------------------------------------
        System.out.println("\n--- TEST 3: All logs collected in ONE place ---");
        logger1.printAllLogs();  // logger1 = logger2 = logger3, so ALL logs are here

        // -------------------------------------------------------
        // TEST 4: Simulate usage from separate "classes"
        // -------------------------------------------------------
        System.out.println("--- TEST 4: Logging from helper classes ---");
        new UserService().createUser("Alice");
        new OrderService().placeOrder("Book", 2);

        // Show final log count
        System.out.println("\nTotal log entries across entire application: "
                + Logger.getInstance().getLogCount());

        System.out.println("\n========================================");
        System.out.println("  Singleton Verified! Only 1 instance.");
        System.out.println("========================================");
    }
}

// ---- Simulated UserService class ----
class UserService {
    // Each class calls Logger.getInstance() — they all get the SAME logger
    private Logger logger = Logger.getInstance();

    public void createUser(String name) {
        logger.logInfo("UserService: Creating user '" + name + "'");
        logger.logInfo("UserService: User '" + name + "' created successfully");
    }
}

// ---- Simulated OrderService class ----
class OrderService {
    // Again — same singleton instance
    private Logger logger = Logger.getInstance();

    public void placeOrder(String item, int quantity) {
        logger.logInfo("OrderService: Placing order for " + quantity + "x " + item);
        logger.logWarning("OrderService: Low stock alert for '" + item + "'");
        logger.logInfo("OrderService: Order confirmed!");
    }
}
