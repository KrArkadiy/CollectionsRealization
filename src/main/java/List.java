public interface List<T> {
    void add(T e);

    void add(T e, int index);

    void clear();

    T get(int index);

    int indexOf(T e);

    T remove(int index);

    T remove(T e);

    T set(T e, int index);

    int size();

}
