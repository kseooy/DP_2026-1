package hw.ch05;

public enum LoggerEnum {
    INSTANCE;

    private StringBuilder logBuffer = new StringBuilder();

    LoggerEnum() {
        System.out.println("인스턴스를 생성했습니다.");
    }

    public void log(String message) {
        logBuffer.append(message).append("\n");
        System.out.println(message);
    }

    public String getLog() {
        return logBuffer.toString();
    }
}