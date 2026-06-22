package Digital_Nurture_Deepskilling.Mandatory_Exercises.Design_Patterns_and_Principles.SingletonPatternExample;
public class TestLogger {
    public static void main(String[] args) {
        Logger logger1=Logger.getInstance();
        logger1.log("First message");

        Logger logger2=Logger.getInstance();
        logger2.log("Second message");
        if(logger1==logger2){
            System.out.println("Only one logger instance exists");
        }else{
            System.out.println("Multiple logger instances exist");
        }
    }
}
