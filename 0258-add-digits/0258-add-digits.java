class Solution {
    public int addDigits(int num) {
        if(num<10){
            return num;
        }
        int temp=0;
        while(num>0){
            int digit=num%10;
            temp=temp+digit;
            num=num/10;
        }
        num=temp;
        return addDigits(num);
    }
}