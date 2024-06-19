package src;

public interface IMyArrayList<E> {
    void add(E o);
    E find(int index);
    void update(int index, E o);
    void remove(int index);
    int getSize();
    void read();
}
