import java.lang.reflect.Array;

public class ArrayList<T> implements List<T>{

    private int capacity;

    private int size;

    private int initialCapacity = 10;

    private T[] array;

    private int index = 0;

    private Class<T> cls;

    public ArrayList(Class<T> cls){
        this.cls = cls;
        array = (T[]) Array.newInstance(this.cls, initialCapacity);
        capacity = array.length;
    }

    @Override
    public void add(T e) {
        if (index == array.length-1){
            resize();
        }
        array[index++] = e;
        size++;
    }

    @Override
    public void add(T value, int index) {
        if (index == size && index != 0) {
            add(value);
            return;
        }
        if (index >= 0 && index <= size) {
            if (isFull()) {
                resize();
            }
            if (size == 1 && index == 0) {
                T temp = array[index];
                array[index] = value;
                array[index + 1] = temp;
                size++;
            } else {
                for (int i = size; i > index - 1; i--) {
                    array[i + 1] = array[i];
                }
                array[index] = value;
                size++;
            }
        }
    }

    @Override
    public void clear() {
        for (int i = 0; i < array.length; i++){
            array[i] = null;
        }
    }

    @Override
    public T get(int index) {
        return  array[index];
    }


    @Override
    public int indexOf(T e) {
        for (int i = 0; i < array.length; i++) {
            if (array[i].equals(e)) {
                return i;
            }
        }
        return 0;
    }

    @Override
    public T remove(int index) {
        T removedValue = array[index];
        array[index] = null;
        for (int i = index+1; i < size; i++) {
            array[i-1] = array[i];
        }
        return removedValue;
    }

    @Override
    public T remove(T value) {
        T removedValue;
        for (int i = 0; i < size; i++) {
            if (array[i].equals(value)) {
                removedValue = (T) array[i];
                array[i] = null;
                return removedValue;
            }
            for (int j = index+1; j < size; j++) {
                array[i-1] = array[i];
            }
        }
        return null;
    }

    @Override
    public T set(T e, int index) {
        T oldValue = array[index];
        array[index] = e;
        return array[index];
    }

    @Override
    public int size() {
        return size;
    }

    private void resize(){
        T[] newArray = (T[]) Array.newInstance(this.cls, array.length * 2);
        System.arraycopy(array,0, newArray,0, index);
        array = newArray;
    }

    private boolean isFull(){
        return size == array.length -1;
    }

    public boolean isEmpty(){
        return size == 0;
    }
}

