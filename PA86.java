//50. Pow(x, n) 
//Time Complexity: O(log(n)), where n is the power of x
//Space Complexity: O(log(n)), where n is the power of x
class Solution {
    double result=1;
    public double myPow(double x, int n) {
     return helper(x,n);
    }
    public double helper(double x, int n){
         if(n==0) return 1;
     
        double temp = myPow(x,n/2);
        if(n%2==0){
            result=temp*temp;
        }
        else{
            if(n>0){
                result=temp*temp*x; 
            }
            else{
                result=temp*temp*(1/x); 
            }
        }
        return result;
    }
}