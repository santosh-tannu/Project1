import java.util.*;

public class Reverse {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        int n = s.nextInt();
        for (int i = 0; i < n; i++)
            list.add(s.nextInt());
        reverseArrayList(list);
        //for (int i = 0; i < list.size(); i++)
            //System.out.print(list.get(i) + " ");
    }

    // Method to reverse the ArrayList
    static void reverseArrayList(ArrayList<Integer> list) {
        // Write your code here
       // ArrayList<Integer> reverseList = new ArrayList<Integer>();
        for(int i = list.size(); i!=0; i--){
            System.out.print(list.get(i-1) + " ");
        }
    }
}