package SearchingAndSortingAlgorithm;
import java.util.ArrayList;
import java.util.Collections; 
import java.util.List;

public class K_thSmallestInMatrix {
    public static int kthSmallest(int[][] matrix, int k) {
        int n = matrix.length;
        List<Integer> list = new ArrayList<>();

        // Flatten matrix to 1D list
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                list.add(matrix[i][j]);
            }
        }

        // Sort the list
        Collections.sort(list);

        // Return kth smallest
        return list.get(k - 1);
    }
    
    public static void main(String[] args) {
        int[][] matrix = {{1,5,9},{10,11,13},{12,13,15}};
        System.out.println(kthSmallest(matrix,8));
    }
}
