public class MyLinkedListNode {
    private int data;
    private MyLinkedListNode next;

    public void setData(int value){
        data = value;
    }

    public void setNext(MyLinkedListNode p){
        next = p;
    }

    public int getData(){
        return data;
    }

    public MyLinkedListNode getNext(){
        return next;
    }
}
