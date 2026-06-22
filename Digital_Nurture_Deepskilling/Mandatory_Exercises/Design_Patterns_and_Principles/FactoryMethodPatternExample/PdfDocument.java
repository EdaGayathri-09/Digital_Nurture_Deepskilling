package Digital_Nurture_Deepskilling.Mandatory_Exercises.Design_Patterns_and_Principles.FactoryMethodPatternExample;

public class PdfDocument implements Document{
    @Override
    public void open(){
        System.out.println("Opening PDF Document");
    }
}
