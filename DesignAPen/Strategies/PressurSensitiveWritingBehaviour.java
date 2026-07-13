package Projects.DesignAPen.Strategies;

public class PressurSensitiveWritingBehaviour implements WriteBeahviourStrategies{
    @Override
    public void write() {
        System.out.println("Pressure-Sensitive Write Behaviour");
    }
}
