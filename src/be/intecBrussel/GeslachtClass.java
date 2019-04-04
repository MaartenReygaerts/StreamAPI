package be.intecBrussel;

public class GeslachtClass<E> {
    private E geslacht;

    public GeslachtClass(E geslacht){
        this.geslacht = geslacht;
    }


    public enum Geslacht{
        MAN,VROUW;
    }

    //todo
    @Override
    public String toString() {
        return "GeslachtClass{" +
                "geslacht=" + geslacht +
                '}';
    }
}
