package src;

public class MyArrayList<E> implements IMyArrayList<E>{
    private E[] container;

    public MyArrayList() {
        container = (E[]) new Object[0];
    }

    public void add(E o) {
        E[] newContainer = (E[]) new Object[container.length + 1];
        for (int i = 0; i < container.length; i++) {
            newContainer[i] = container[i];
        }
        newContainer[container.length] = o;
        this.container = newContainer;
    }

    @Override
    public E find(int index) {
        if (index >= 0 && index < getSize()) {
            return container[index];
        }
        return null;
    }

    @Override
    public void update(int index, E o) {
            if (index >= 0 && index < getSize()) {
                this.container[index] = o;
            }
    }

    @Override
    public void remove(int index) {
        if (index >= 0 && index < getSize()) {
            E[] newContainer = (E[]) new Object[container.length - 1];
            for (int i = 0; i < index; i++) {
                newContainer[i] = container[i];
            }
            for (int i = index + 1; i < getSize(); i++) {
                newContainer[i - 1] = container[i];
            }
            this.container = newContainer;
        }
    }

    @Override
    public int getSize() {
        return this.container.length;
    }

    @Override
    public void read() {
        for (E o : this.container) {
            System.out.println(o);
        }
    }


}
