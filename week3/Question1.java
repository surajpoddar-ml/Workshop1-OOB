package week3;

public class Question1 {

    public static void main(String[] args) {
        
        int[] data = {12, 25, 33, 48, 50, 72};
        
        int last = data.length - 1;
        
        while (last >= 0) {
            System.out.println(data[last]);
            last--;
        }

    }

}