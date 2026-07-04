package Digital_Nurture_Deepskilling.Additional_Exercises.Design_Patterns_and_Principles.BuilderPatternExample;

public class Computer {

    private String cpu;
    private String ram;
    private String storage;

    private Computer(Builder builder){
        this.cpu=builder.cpu;
        this.ram=builder.ram;
        this.storage=builder.storage;
    }
    public void displayConfiguration(){
        System.out.println("CPU: "+cpu);
        System.out.println("RAM: "+ram);
        System.out.println("Storage: "+storage);
        System.out.println();
    }
    public static class Builder{

        private String cpu;
        private String ram;
        private String storage;
        
        public Builder setCPU(String cpu){
            this.cpu=cpu;
            return this;
        }
        public Builder setRAM(String ram){
            this.ram=ram;
            return this;
        }
        public Builder setStorage(String storage){
            this.storage=storage;
            return this;
        }
        public Computer build(){
            return new Computer(this);
        }
    }
}
