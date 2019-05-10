package Sol1;

import java.util.*;

public class Sol1 {
    private List<Integer> addition;
    private List<Integer> deletion;

    public void display() {
        System.out.println("Addition Array ");
        for (int i : addition) {
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println("Deletion Array ");
        for (int i : deletion) {
            System.out.print(i + " ");
        }

    }
    public int adddisplay(){
        return addition.size();
    }

    public int deldisplay(){
        return deletion.size();
    }


    public void change(Integer [] current, Integer [] target){
        addition = new ArrayList<>();
        deletion = new ArrayList<>();
        if(target.length==0){
            deletion = Arrays.asList(current);
            return;
        }
        if(current.length==0){
            addition = Arrays.asList(target);
            return;
        }
        //Current and Target Doesn't contain duplicate values
        // We can use lists here but since array was asked the

        Set<Integer> set = new HashSet<>(Arrays.asList(target));

        for (Integer temp: current ){
            if(!set.contains(temp))
                deletion.add(temp);
        }

        set = new HashSet<>(Arrays.asList(current));
        for (Integer temp: target ){
            if(!set.contains(temp))
                addition.add(temp);
        }

    }

    public static void main(String[] args) {
        /*Integer [] current = {1, 3, 5, 6, 8, 9};
        Integer [] target = {1, 2, 5, 7, 9};*/
        Integer [] current = {2,3};
        Integer [] target = {1,2,2};

        Sol1 s =new Sol1();
        s.change(current,target);
        s.display();
    }
}
