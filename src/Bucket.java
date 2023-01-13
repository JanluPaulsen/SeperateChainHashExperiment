public class Bucket {
    private int value;
    private MyLinkedList aList;

    //initialized object
    public Bucket(int defaultValue){
        value = defaultValue;
        aList = new MyLinkedList();
    }

    public int getValue(){
        return value;
    }

    public MyLinkedList getList(){
        return aList;
    }

    public void setValue(int aValue){
        value = aValue;
    }

    public void setList(MyLinkedList list){
        aList = list;
    }
}
