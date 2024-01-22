import java.util.Stack;
import java.util.ArrayList;
public class Stacks {
    private Stack<String> stacks;
    public Stacks(){
        this.stacks = new Stack<>();
    }
    public boolean isEmpty(){
        return this.stacks.isEmpty();
    }
    public void add(String value){
        this.stacks.add(value);
    }
    public String take(){
        if(!isEmpty()){
            return this.stacks.pop();
        } else return null;
    }
    public ArrayList<String> values(){
        ArrayList<String> holder = new ArrayList<>();
        for(String items : this.stacks){
            holder.add(items);
        }
        return holder;
    }

    public static void main(String[] args){
        Stacks s = new Stacks();
        s.add("1");
        s.add("2");
        s.add("3");
        s.add("4");
        s.add("5");

        while (!s.isEmpty()) {
            System.out.println(s.take());
        }
    }
}
