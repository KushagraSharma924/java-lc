class Solution {
    public void rotate(int[][] matrix) {
        
        int m = matrix.length;
        int n = m;

        // transpose

        for(int i = 0; i < m; i++){
            for(int j = i+1; j<n;j++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
        //reverse

        for(int i = 0; i < n; i++){
            int left = 0; int right = n-1;
        while(left < right){
            int rev = matrix[i][left];
            matrix[i][left] = matrix[i][right];
            matrix[i][right] = rev;
            left++;
            right--;
        }
        }


    }
}