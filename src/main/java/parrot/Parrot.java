package parrot;

public abstract class Parrot {
    protected static final double BASE_SPEED = 12.0;
    protected static final double LOAD_FACTOR = 9.0;
    protected static final double MAX_SPEED = 24.0;

    public abstract double getSpeed();
    public abstract String getCry();
}
