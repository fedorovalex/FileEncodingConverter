package task.exception;

public class NoArgumentsWithNameFile extends Exception {
    public NoArgumentsWithNameFile() {
    }

    public NoArgumentsWithNameFile(String message) {
        super(message);
    }

    public NoArgumentsWithNameFile(String message, Throwable cause) {
        super(message, cause);
    }

    public NoArgumentsWithNameFile(Throwable cause) {
        super(cause);
    }

    public NoArgumentsWithNameFile(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
