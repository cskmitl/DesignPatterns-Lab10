// Concrete Logger ประเภท Console
class ConsoleLogger implements Logger {
    @Override
    public void log(String message) {
        System.out.println("Standard Console::Logger: " + message);
    }
}