package bookStore.utils;

public class MainList<T> {
    private Object[] table = new Object[0];

    public void add(T item) {
        increaseTable();
        table[table.length - 1] = item;
    }

    private void increaseTable() {
        Object[] tempTable = new Object[table.length + 1];
        for (int i = 0; i < table.length; i++) {
            tempTable[i] = table[i];
        }
        table = tempTable;
    }
    public void remove (int index) {
        if(index >= table.length) {
            throw new IllegalArgumentException("No such item in the list");
        }
        int i = 0;
        int j = 0;
        Object[] tempTable = new Object[table.length-1];
        // TODO: trzeba dokonczyc petle FOR

    }

    public T getItem(int index) {
        return (T) table[index];
    }

    public T[] getTable() {
        return (T[]) table;
    }
}
