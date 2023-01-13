public class MyLinkedList {
    private MyLinkedListNode list;

    public MyLinkedList(){
        list = null;
    }

    public void append(int value){
        list = append(list, value);
    }

    private MyLinkedListNode append(MyLinkedListNode list, int value){
        if(list == null){
            list = new MyLinkedListNode();
            list.setData(value);
            list.setNext(null);
        }else {//recursive case
            list.setNext(append(list.getNext(), value));
        }
        return list;
    }

    public void display(){
        display(list);
        System.out.println(" ");
    }

    private void display(MyLinkedListNode list){
        if (list == null) {//base case
            return;
        }else {//recursive
            System.out.print(list.getData() + " "); //displaying head
            display(list.getNext());//displaying sub-list
        }
    }

    public boolean isEmpty(){
        return list == null;
    }

    public MyLinkedListNode search(int value){
        return null;
    }
}
