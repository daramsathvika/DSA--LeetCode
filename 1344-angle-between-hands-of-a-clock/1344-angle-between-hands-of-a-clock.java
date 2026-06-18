class Solution {
    public double angleClock(int hour, int minutes) {
        double hourhand=(30*hour)%360+((double)minutes/2);
        double minhand=minutes*6;
        double ans=Math.abs(hourhand-minhand);
        if(ans<180){return ans;}
        else{return 360-ans;}         
    }
}