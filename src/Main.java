import data_structures.DynamicArray;
class Main {

    public static void main(String[] args) {
        DynamicArray arr = new DynamicArray();
        arr.add(1);
        arr.add(5);
        arr.add(3);
        arr.add(2);
        System.out.println(arr.get(3));
    }
}