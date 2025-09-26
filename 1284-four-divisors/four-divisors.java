class Solution {
    public int sumFourDivisors(int[] nums) {
        int total=0;
        for(int num:nums){
            int count=0;
            int sum=0;
            for(int i=1;i*i<=num;i++){
                if(num%i==0){
                    int div1=i;
                    int div2=num/i;
                    sum+=div1;
                    count++;
                    if(div1!=div2){
                        sum+=div2;
                        count++;
                     }
                }
            }
            if(count==4){
                total+=sum;
            }
        }
        return total;
    }
}