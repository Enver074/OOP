package HW_4;


public class DynamicArray<T> {
    private static final int startLength = 1;
    private int length;
    private T[] data;


    public DynamicArray(){
        this.length = 0;
        this.data = (T[]) new Object[startLength];
    }

    public DynamicArray(T[] data){
        this.length = data.length;
        this.data = data;
    }

    public int getLength(){
        return this.length;
    }

    public T[] getData(){
        return this.data;
    }

    public void printArray() {
        System.out.print("[");
        for (int i = 0; i < this.getLength(); i++) {
            if (i != this.getLength() - 1)
                System.out.print(this.data[i] + ",");
            else
                System.out.print(this.data[i]);
        }
        System.out.print("]\n");
    }

    // Вставка в массив 
    public void add(T element) {
        if (this.length == this.data.length) {
            addLenth();
        }
        this.data[this.length++] = element;
    }

    private void addLenth() {
        int newlen = this.getLength() + 1;
        T[] newData = (T[]) new Object[newlen];
        for (int i = 0; i < this.getLength(); i++) {
            newData[i] = this.data[i];
        }
        this.data = newData;
    }
    
    // Удаление элемента по индексу
    public void remove(int index){
        if(index < 0 || index > this.getLength()){
            System.out.printf("Введеный индекс %d выходит за границы длинны списка %d\n", index, this.getLength());
        }
        else{
            int newlen = this.getLength() - 1;
            T[] newData = (T[]) new Object[newlen];
            int i = 0;
            while (i < index){
                newData[i] = this.data[i];
                i++;
            }
            i++;
            while (i < this.getLength()){
                newData[i - 1] = this.data[i];
                i++;
            }
            this.data = newData;
            this.length--;
        }
    }
    // Удаление всех элементов с заданным значением
    public void removeData(T element) {
        for (int i = 0; i < data.length; i++) {
            if (data[i] == element) {
                remove(i);
                i--;
            }
        }
    }
    public int minData() {
        int min = (int) this.data[0];
        for (int i = 0; i < data.length; i++) {
            if (min > (int) this.data[i]) {
                min = (int) this.data[i];
            }
        }
        return min;
    }

    public int maxData() {
        int max = (int) this.data[0];
        for (int i = 0; i < data.length; i++) {
            if (max < (int) this.data[i]) {
                max = (int) this.data[i];
            }
        }
        return max;
    }

    public int sumData(){
        int result = 0;
        for (int i = 0; i < data.length; i++) {
            result += (int) this.data[i]; 
        }
        return result;
    }


    public int multData(){
        int result = 1;
        for (int i = 0; i < data.length; i++) {
            result *= (int) this.data[i]; 
        }
        return result;
    }

    public int findIndex(T element){
        
        int count = 0;
        for (T t : data) {
            if (t == element){
                return count;
            }
            count++;
        }
        return -1;
    }

    public boolean findData(T element){
        for (T t : data) {
            if (t == element){
                return true;
            }
        }
        return false;
    }

    public void BubbleSort() throws NonComparableTypeException {
        T tmp = this.data[0];
        if (tmp instanceof Comparable) {
            for (int i = 0; i < this.getLength() - 1; i++) {
                boolean hasSwap = false;
                
                for (int j = 0; j < this.getLength() - i - 1; j++) {
                    Comparable<T> elem = (Comparable<T>)this.data[j];
                    T nextElem = this.data[j + 1];
                    if (elem.compareTo(nextElem) > 0) {
                        swap(j, j + 1);
                        hasSwap = true;
                    }
                }
                
                if (!hasSwap) {
                    break;
                }
            }
        }
        else {
            throw new NonComparableTypeException(tmp.getClass().getSimpleName());
        }
    }

    public void InsertionSort() throws NonComparableTypeException {
        T tmp = this.data[0];
        if (tmp instanceof Comparable) {
            for (int i = 1; i < this.getLength(); i++) {
                for (int j = i; j > 0; j--) {
                    Comparable<T> elem = (Comparable)this.data[j];
                    T prevElem = this.data[j - 1];
                    if (elem.compareTo(prevElem) < 0) {
                        swap(j, j - 1);
                    } else {
                        break;
                    }
                }
            }
        } else {
            throw new NonComparableTypeException(tmp.getClass().getSimpleName());
        }
    }

    public void SelectionSort() throws NonComparableTypeException {
        T min = this.data[0];
        if (min instanceof Comparable) {
            for (int i = 0; i < this.getLength(); i++) {
                min = this.data[i];
                int min_idx = i;

                for (int j = i; j < this.getLength(); j++) {
                    Comparable<T> elem = (Comparable<T>)this.data[j];
                    if (elem.compareTo(min) < 0) {
                        min = this.data[j];
                        min_idx = j;
                    }
                }

                if (i != min_idx) {
                    swap(i, min_idx);
                }                
            }
        } else {
            throw new NonComparableTypeException(min.getClass().getSimpleName());
        }
    }

    private void swap(int i, int j) {
        T tmp = this.data[i];
        this.data[i] = this.data[j];
        this.data[j] = tmp;
    }

}
