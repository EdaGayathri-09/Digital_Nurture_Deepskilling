package Digital_Nurture_Deepskilling.Mandatory_Exercises.Design_Patterns_and_Principles.FactoryMethodPatternExample;

public class ExcelDocument implements Document{
    @Override
    public void open(){
        System.out.println("Opening Excel Document");
    }
}
