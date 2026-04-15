package hw.ch05;

public class LoggerSynchronizedLazy {
    private static LoggerSynchronizedLazy instance;
    private StringBuilder logBuffer;

    private LoggerSynchronizedLazy() {
        System.out.println("인스턴스를 생성했습니다.");
        logBuffer = new StringBuilder();
    }

    public static synchronized LoggerSynchronizedLazy getInstance() {
        if (instance == null) {
            instance = new LoggerSynchronizedLazy();
        }
        return instance;
    }

    public void log(String message) {
        logBuffer.append(message).append("\n");
        System.out.println(message);
    }

    public String getLog() {
        return logBuffer.toString();
    }
}