package generics;
// https://docs.oracle.com/javase/tutorial/java/generics/restrictions.html#createObjects
import java.util.Arrays;

public class Wildcard<T extends Number> {
//    the wildcard is used to restrict the datatyoe to use
    // now if we change the datatype it throws the error
    //Here  T should either be Number or its subclass;

    private Object[] data;
    private static int DEFAULT_SIZE = 10;
    private int size =0;// also works as index value

    public Wildcard() {
        this.data = new Object[DEFAULT_SIZE];
    }
    public void add(T num){
        if(isFull()){
            resize();
        }
        data[size++]=num;
    }

    private void resize() {
        Object [] temp = new Object[data.length*2];

        // Copy the current items  in the new array
        for(int i = 0; i < data.length ; i++) {
            temp[i]= data[i];

        }
        data=temp;
    }

    private boolean isFull() {
        return size== data.length;
    }
    public T remove() {
        T removed =(T)(data[--size]);
        return removed;
    }

    @Override
    public String toString() {
        return "CustomArrayList_generic{" +
                "data=" + Arrays.toString(data) +
                ", size=" + size +
                '}';
    }

    public T get(int index){
        return (T)data[index];
    }
    public int size(){
        return size;
    }

    public  void set(int index, T value){
        data[index]= value;
    }

    public static void main(String[] args) {
//        ArrayList list =new ArrayList();
//        CustomArrayList_generic list = new CustomArrayList_generic();
//        list.add(3);
//        list.add(5);
//        list.add(9);
//        for(int i=0; i<14;i++){
//            list.add(2*i);
//        }
//        System.out.println(list);
        Wildcard<Integer> list = new Wildcard<>();
        for(int i=0; i<14;i++){
            list.add(2*i);
        }
        System.out.println(list);
    }
}
