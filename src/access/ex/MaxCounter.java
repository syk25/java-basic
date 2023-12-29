package access.ex;

public class MaxCounter {
    private int count;
    private int max;

    public MaxCounter(int max) {
        this.max = max;
    }

    public void increment(){
        if(incrementValid()){
            count++;
        } else {
            System.out.println("최대치까지 수가 증가하였습니다.");
        }

    }

    public int getCount(){
        return count;
    }

    private boolean incrementValid(){
        return count < max;
    }
}
