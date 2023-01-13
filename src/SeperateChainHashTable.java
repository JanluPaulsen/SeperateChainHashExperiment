public class SeperateChainHashTable {
    private Bucket[] data;
    private int n;
    final int BLANK = -999;

    public SeperateChainHashTable(){
        data = new Bucket[5];
        for (int i = 0; i < data.length; i++){
            data[i] = new Bucket(BLANK);
        }
    }

    public int hash(int k){
        return k % 5;
    }
    public void insert(int value){
        int index = hash(value);
        if (data[index].getValue() == BLANK){
            data[index].setValue(value);
            n++;
        }else {
            data[index].getList().append(value);
        }
    }

    public void display(){
        for (int i = 0; i < data.length; i++){
            System.out.println(data[i].getValue() + " ");
            if (!data[i].getList().isEmpty()){
                data[i].getList().display();
            }
        }
    }
}
