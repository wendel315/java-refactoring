package parrot;

public class Parrot {

    private final ParrotTypeEnum type;
    private final int numberOfCoconuts;
    private final double voltage;
    private final boolean isNailed;

    public Parrot(ParrotTypeEnum type, int numberOfCoconuts, double voltage, boolean isNailed) {
        this.type = type;
        this.numberOfCoconuts = numberOfCoconuts;
        this.voltage = voltage;
        this.isNailed = isNailed;
    }

    public double getSpeed() {
        return switch (type) {
            case EUROPEAN -> getSpeedForEuropean();
            case AFRICAN -> getSpeedForAfrican();
            case NORWEGIAN_BLUE -> getSpeedForNorwegianBlue();
        };
    }

    private double getSpeedForEuropean() {
        return BASE_SPEED;
    }

    private double getSpeedForAfrican() {
        return Math.max(0.0, BASE_SPEED - LOAD_FACTOR * numberOfCoconuts);
    }

    private double getSpeedForNorwegianBlue() {
        return isNailed ? 0 : getBaseSpeed(voltage);
    }

    private static final double BASE_SPEED = 12.0;
    private static final double LOAD_FACTOR = 9.0;
    private static final double MAX_SPEED = 24.0;


    private double getBaseSpeed(double voltage) {
        return Math.min(24.0, voltage * getBaseSpeed());
    }

    private double getLoadFactor() {
        return 9.0;
    }

    private double getBaseSpeed() {
        return 12.0;
    }

    public String getCry() {
        return switch (type) {
            case EUROPEAN -> "Sqoork!";
            case AFRICAN -> "Sqaark!";
            case NORWEGIAN_BLUE -> voltage > 0 ? "Bzzzzzz" : "...";
        };
    }
}
