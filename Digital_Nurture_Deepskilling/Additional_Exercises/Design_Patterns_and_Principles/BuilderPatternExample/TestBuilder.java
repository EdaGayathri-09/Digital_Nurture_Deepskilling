package Digital_Nurture_Deepskilling.Additional_Exercises.Design_Patterns_and_Principles.BuilderPatternExample;

public class TestBuilder {
    public static void main(String[] args) {
        Computer computer1=new Computer.Builder().setCPU("Intel Core i7").setRAM("16 GB").setStorage("512 GB SSD").build();
        Computer computer2=new Computer.Builder().setCPU("AMD Ryzen 5").setRAM("8 GB").setStorage("1 TB HDD").build();
        System.out.println("Computer1 Configuration:");
        computer1.displayConfiguration();
        System.out.println("Computer2 Configuration:");
        computer2.displayConfiguration();
    }
}
