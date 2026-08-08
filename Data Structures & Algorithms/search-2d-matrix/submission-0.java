class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int minRow = 0;
        int maxRow = matrix.length -1;
        int midRow = 0;
        int mid = 0;
        int min = 0;
        int max = matrix[0].length-1;
        while(minRow<=maxRow){
            midRow = (maxRow+minRow)/2;
            if(matrix.length <= 1){
                break;
            }
            if(midRow < 1){
                if((target<=matrix[midRow][max])){
                break;
                }
            }
            if((target<=matrix[midRow][max])&&(target>matrix[midRow-1][max])){
                break;
            }
            else if(target>matrix[midRow][max]){
                minRow = midRow+1;
            }
            else{
                maxRow = midRow-1;
            }
        }
        while(min<=max){
            mid = (max+min)/2;
            if((target==matrix[midRow][mid])){
                return true;
            }
            else if(target>matrix[midRow][mid]){
                min = mid+1;
            }
            else{
                max = mid-1;
            }
        }
        return false;
    }
}
