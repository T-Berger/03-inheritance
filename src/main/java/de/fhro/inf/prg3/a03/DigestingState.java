package de.fhro.inf.prg3.a03;

public class DigestingState extends State {

    private final int remainingWakeTime;

    DigestingState(Animal animal, int duration, int remainingWakeTime) {
        super(animal, duration);
        this.remainingWakeTime = remainingWakeTime;
    }

    @Override
    public State successor() {
        logger.info("Getting in a playful mood!");
        return new Playful(animal, remainingWakeTime - animal.getDigest());
    }
}
