﻿import java.util.List;


public interface AnimalCage<T extends Animal> {
    public abstract int addAnimalINCage(T animal);

    // public abstract String getFeedToCage(int countPiecesOfMeat);

    public abstract String ClearCage(int levelDirty);

    // public abstract Animal getFirstAnimal();

    // public void sortByAge();


}
