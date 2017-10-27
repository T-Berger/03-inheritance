package de.fhro.inf.prg3.a03;

public class Sleeping extends State {
    protected Sleeping(Animal animal, int duration) {
        super(animal, duration);
    }

    @Override
    public State successor() {
        logger.info("Yoan... getting hungry!");
        return new Hungry(animal, animal.getAwake());
    }

}
