public class MergeSortedArrays {
    public static void merge(int[] A, int[] B) {
        int i = A.length - B.length - 1; // point to the last element of set A
        int j = B.length - 1; // point to the last element of set B
        int k = A.length - 1; // point to the last element of merge set

        //from end to start, insert larger elements at the end of set A in sequence
        while (i >= 0 && j >= 0) {
            if (A[i] > B[j]) {
                A[k--] = A[i--];
            } else {
                A[k--] = B[j--];
            }
        }

        // put the remainin in set B into set A
        while (j >= 0) {
            A[k--] = B[j--];
        }
    }

    public static void main(String[] args) {
        int[] A = {1, 3, 5, 0, 0, 0, 0, 0, 0}; 
        int[] B = {2, 4, 6}; 

        // merge B into A
        merge(A, B);

        for (int num : A) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
