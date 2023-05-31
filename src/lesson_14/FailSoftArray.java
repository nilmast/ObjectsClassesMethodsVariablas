package lesson_14;

public class FailSoftArray {
    private int[] arr;
    private int errVal;
    public int length;

    public FailSoftArray(int length, int errVal){
        arr = new int[length];
        this.errVal = errVal;
        this.length = length;
    }
    public int get(int index){
        if(indexOK(index)){
            return arr[index];
        }
        return errVal;
    }
    public boolean put(int index, int val){
        if (indexOK(index)){
            arr[index] = val;
            return true;
        }
        return false;
    }
    private boolean indexOK(int index){
        if (index >= 0 & index < length) {
            return true;
        }
        return false;
    }

}
