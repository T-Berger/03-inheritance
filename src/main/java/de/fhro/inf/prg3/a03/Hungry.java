package de.fhro.inf.prg3.a03;

public class Hungry extends State {

    protected Hungry(Animal animal, int duration) {
        super(animal, duration);
    }

    @Override
    public State successor() {
        logger.info("I've been starving for a too long time...");
        return new Dead(animal, -1);
    }

    public State feed(){
        logger.info("Om nom nom...");
        return new DigestingState(animal, animal.getDigest(), duration - time);
    }
}
