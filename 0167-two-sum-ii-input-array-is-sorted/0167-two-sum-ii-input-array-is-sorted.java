class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int i = 0;
        int j = numbers.length-1;

        int val1 = 0;
        int val2 = 0;
        while(i<j){
            if(numbers[i] + numbers[j] == target){
                val1 = i+1;
                val2 = j+1;
                break;
            }
            else if( numbers[i]+numbers[j]>target){
                j--;
            }
    else{
        i++;
    }
        }
        return new int []{val1 , val2};

        
    }
}