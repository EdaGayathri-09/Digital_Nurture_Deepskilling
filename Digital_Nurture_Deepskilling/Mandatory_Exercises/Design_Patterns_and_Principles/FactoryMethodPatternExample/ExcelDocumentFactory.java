package Digital_Nurture_Deepskilling.Mandatory_Exercises.Design_Patterns_and_Principles.FactoryMethodPatternExample;

public class ExcelDocumentFactory extends DocumentFactory{
    @Override
    public Document createDocument(){
        return new ExcelDocument();
    }
}
