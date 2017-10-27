package de.fhro.inf.prg3.a03;

public class Playful extends State{
    protected Playful(Animal animal, int duration) {
        super(animal, duration);
    }

    @Override
    public State successor() {
        logger.info("Yoan... getting tired!");
        return new Sleeping(animal, animal.getSleep());
    }
}
