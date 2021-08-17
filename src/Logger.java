public class Logger {

    private static Logger instance = null;

    private Logger() {
    }

    public static Logger getInstance() {
        if(Logger.instance == null){
            instance = new Logger();
        }
        return instance;
    }

    public void warning(String s) {
        System.out.println("[Warning] " + java.time.LocalDate.now() + " " + s);
    }

    public void info(String i) {
        System.out.println("[Info] " + java.time.LocalDate.now() + " " + i);
    }
}

//System.out.println(java.time.LocalDate.now());