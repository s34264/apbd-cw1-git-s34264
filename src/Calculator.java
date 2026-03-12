public class Calculator {

    public int sum(int a, int b){
        return a+b;
    }
    public int sub(int a, int b){
        return a-b;
    }
    public int multi(int a, int b){
        return a*b;
    }
    public int div(int a, int b){
        return a/b;
    }
    public int mod(int a, int b){
        return a%b;
    }

    public int pow(int base, int n){
        for(int i=0;i<n;i++){
            base*=base;
        }
        return base;
    }
}
