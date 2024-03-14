// Factory สำหรับสร้าง Logger ตามประเภทที่กำหนด
class LoggerFactory {
    Logger getLogger(String loggerType) {
        if (loggerType.equalsIgnoreCase("CONSOLE")) {
            return new ConsoleLogger();
        } else if (loggerType.equalsIgnoreCase("FILE")) {
            return new FileLogger();
        } else if (loggerType.equalsIgnoreCase("ERROR")) {
            return new ErrorLogger();
        }
        return null;
    }
}