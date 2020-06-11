//Leetcode: 658. Find K Closest Elements
//Time complexity: O(n), n is number of elements in array
//Space Complexity: O(1), only auxillary space used to return the result.

class Solution {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        int low=0;
        int high= arr.length-1;       
        while(low<high){            
            if(high-low==k-1) break;            
            if(x-arr[low]>arr[high]-x) low++;
            else high--;            
        }   
        List<Integer> res = new ArrayList<>();
        
        for(int i= low;i<=high;i++){
            res.add(arr[i]);
        }
        return res;
    }
}