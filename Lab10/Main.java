// Main Class
public class Main {
    public static void main(String[] args) {
        // สร้าง Object ของ LoggerFactory
        LoggerFactory factory = new LoggerFactory();
        // สร้าง Object ของ LogManager โดยส่งเข้าไป Object ของ LoggerFactory
        LogManager manager = new LogManager(factory);

        // ทดสอบการ Log ข้อความตามระดับ
        manager.logMessage("INFO", "This is an information.");
        manager.logMessage("DEBUG", "This is a debug information.");
        manager.logMessage("ERROR", "This is an error information.");
    }
}