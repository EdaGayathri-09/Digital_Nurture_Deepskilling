package Digital_Nurture_Deepskilling.Mandatory_Exercises.Design_Patterns_and_Principles.FactoryMethodPatternExample;

public class WordDocument implements Document {
    @Override
    public void open(){
        System.out.println("Opening Word Document");
    }
}
