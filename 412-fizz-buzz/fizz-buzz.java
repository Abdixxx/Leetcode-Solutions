class Solution {
    public List<String> fizzBuzz(int n) {
       String arr []= new String[n];
        for(int i=1;i<n+1;i++){
            
            if(i%3==0 && i%5==0){
                arr[i-1]="FizzBuzz";
            }
            else if(i%3==0){
                arr[i-1]="Fizz";
            }
            else if(i%5==0){
                arr[i-1]="Buzz";
            }
            else {
                String str= String.valueOf(i);
                arr[i-1]=str;
            }

        }
        
   return Arrays.asList(arr); }
}