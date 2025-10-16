package problem2;

public class IntegerList {
    int[] list;       // values in the list
    int numsOfInt;    // current number of elements
    int capacity;     // current array size

    //-------------------------------------------------------
    // create a list of the given size
    //-------------------------------------------------------
    public IntegerList(int size) {
        list = new int[size];
        capacity = size;
        numsOfInt = 0; // start empty
        for (int i = 0; i < size; i++)
            list[i] = 0;
    }

    //-------------------------------------------------------
    // fill array with integers between 1 and 100, inclusive
    //-------------------------------------------------------
    public void randomize() {
        for (int i = 0; i < list.length; i++)
            list[i] = (int) (Math.random() * 100) + 1;
        numsOfInt = list.length;
    }

    //-------------------------------------------------------
    // print array elements with indices
    //-------------------------------------------------------
    public void print() {
        for (int i = 0; i < numsOfInt; i++)
            System.out.println(i + ":\t" + list[i]);
    }

    //-------------------------------------------------------
    // double the array size when it's full
    //-------------------------------------------------------
    public void increaseSize() {
        capacity *= 2;
        int[] newList = new int[capacity];
        for (int i = 0; i < numsOfInt; i++)
            newList[i] = list[i];
        list = newList;
    }

    //-------------------------------------------------------
    // add a new element, resizing if necessary
    //-------------------------------------------------------
    public void addElement(int value) {
        if (numsOfInt == capacity) {
            increaseSize();
        }
        list[numsOfInt] = value;
        numsOfInt++;
    }


    public void removeFirst(int newVal){
        for(int i=0;i<numsOfInt;i++){
            if(list[i]==newVal){
                for (int j=i+1;j<numsOfInt;j++){
                    list[j-1]=list[j];
                }
                numsOfInt--;
                break;
            }
        }
    }
    public int search(int value){
        for (int i = 0; i < numsOfInt; i++) {
            if (list[i]==value) return i;
        }
        return -1;
    }
    public void removeAll(int value){
        while(search(value) != -1){
            removeFirst(value);
        }
    }
}
