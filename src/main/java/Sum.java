public class Sum {
    public int GetSum(int a, int b) {
        if(a>b){
            int temp = a;
            a = b;
            b=temp;
        }
        int result = 0;
        while(a<=b){
            result = result + a;
            a++;
        }
        return result;
    }
}
