import java.util.*;
class Solution {
    public double myPow(double x, int n) {
        if(n==0){return 1;}
        if(n==1){return x;}
        if(n<0){
            if(n%2==0){return 1/(Math.pow(myPow(x,Math.abs(n/2)),2));}
            else{return 1/(x*(Math.pow(myPow(x,Math.abs(n+1)/2),2)));}}
        else{
            if(n%2==0){return Math.pow(myPow(x,n/2),2);}
            else{return x*Math.pow(myPow(x,(n-1)/2),2);}}
    }
}