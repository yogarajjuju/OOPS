package access;

public class ObjectDemo {
    int num;

    public ObjectDemo(int num) {
        this.num = num;
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public static void main(String[] args) {
        ObjectDemo obj = new ObjectDemo(22);
        ObjectDemo obj2 = new ObjectDemo(22);

        System.out.println(obj.hashCode());// the hashcode used to identify the unique value of obj
        System.out.println(obj2.hashCode());// the hashcode used to identify the unique value of obj(this has different value of hash code)
        //i.e it is just a random value  to find the uniqueness of the object:
        System.out.println(obj.getClass().getName());//use the get the class it belongs
    }

//    @Override
//    public String toString() {
//        return super.toString();
//    }
//
//    @Override
//    protected void finalize() throws Throwable {
//        super.finalize();
//    }

}

