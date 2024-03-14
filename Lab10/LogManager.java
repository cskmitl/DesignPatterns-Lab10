// Class สำหรับจัดการ Log Levels
class LogManager {
    private LoggerFactory factory;

    public LogManager(LoggerFactory factory) {
        this.factory = factory;
    }

    // Method สำหรับ Log ข้อความตามระดับที่กำหนด
    public void logMessage(String level, String message) {
        Logger logger;
        if (level.equalsIgnoreCase("INFO")) {
            logger = factory.getLogger("CONSOLE");
            logger.log(message);
        } else if (level.equalsIgnoreCase("DEBUG")) {
            logger = factory.getLogger("CONSOLE");
            logger.log(message);
            logger = factory.getLogger("FILE");
            logger.log(message);
        } else if (level.equalsIgnoreCase("ERROR")) {
            logger = factory.getLogger("ERROR");
            logger.log(message);
            logger = factory.getLogger("CONSOLE");
            logger.log(message);
            logger = factory.getLogger("FILE");
            logger.log(message);
        }
    }
}