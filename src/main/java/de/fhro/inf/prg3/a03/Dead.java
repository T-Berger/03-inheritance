package de.fhro.inf.prg3.a03;

public class Dead extends State {
    public Dead(Animal animal, int duration) {
        super(animal, duration);
    }

    @Override
    public State successor() {
        throw new IllegalStateException("This is no buddhistic animal - reincarnation is no option!");
    }
}
