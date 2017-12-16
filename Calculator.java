
package case3;

public class Calculator {

    public long refactor(int id,int min,int max){
        long result = 0;
        for (int i = min ; i <= max ; i++)
            if(id==0) {
                result += i;
            }else{
                result += i * i;
            }
        return result;
    }
    public long sum(int min, int max) {
        return refactor(0,min,max);
    }

    public long sumOfSquares(int min, int max) {
        return refactor(1,min,max);
    }

}
