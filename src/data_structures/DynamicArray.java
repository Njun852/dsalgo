package data_structures;

public class DynamicArray {
    public int length = 1;
    private Object[] data = new Object[length*2];

    public DynamicArray() {

    }
    public void add(Object element) {
        if(length > data.length) {
            expand();
        }
        data[length-1] = element;
        length++;
    }

    public Object get(int index) {
        return data[index];
    }

    private void expand() {
        Object[] newData = new Object[length*2];
        for(int i = 0; i < data.length; i++){
            newData[i] = data[i];
        }
        data = newData;
    }
}
