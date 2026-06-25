// Logger.java
// This class follows the Singleton Design Pattern

public class Logger {

    // STEP A: Create a private static variable to hold the ONE instance
    // - 'static' means it belongs to the class, not any object
    // - 'private' means no one outside can access it directly
    // - 'volatile' ensures thread safety in multi-threaded environments
    private static volatile Logger instance = null;

    // STEP B: Keep track of log history
    private StringBuilder logHistory;
    private int logCount;

    // STEP C: Make the constructor PRIVATE
    // This PREVENTS anyone from doing: Logger log = new Logger();
    // The only way to get a Logger is through getInstance()
    private Logger() {
        logHistory = new StringBuilder();
        logCount = 0;
        System.out.println("Logger instance CREATED (this should appear only once!)");
    }

    // STEP D: Provide a public static method to get the single instance
    // 'static' means you can call it without creating an object: Logger.getInstance()
    // This uses "Double-Checked Locking" for thread safety
    public static Logger getInstance() {
        if (instance == null) {                    // First check (no locking)
            synchronized (Logger.class) {          // Lock so only one thread enters
                if (instance == null) {            // Second check (with locking)
                    instance = new Logger();       // Create the ONE and ONLY instance
                }
            }
        }
        return instance;  // Return the same instance every time
    }

    // STEP E: Add logging methods
    public void log(String message) {
        logCount++;
        String logEntry = "[LOG #" + logCount + "] " + message;
        logHistory.append(logEntry).append("\n");
        System.out.println(logEntry);
    }

    public void logInfo(String message) {
        log("[INFO]  " + message);
    }

    public void logWarning(String message) {
        log("[WARN]  " + message);
    }

    public void logError(String message) {
        log("[ERROR] " + message);
    }

    // Show all logs collected so far
    public void printAllLogs() {
        System.out.println("\n====== FULL LOG HISTORY ======");
        System.out.println(logHistory.toString());
        System.out.println("Total logs recorded: " + logCount);
        System.out.println("==============================\n");
    }

    public int getLogCount() {
        return logCount;
    }
}
