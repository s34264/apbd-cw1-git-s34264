public class Calculator {

    public void sum(int a, int b) {
        int sum = a + b;
        System.out.println(sum);
    }

    public void sumArray(int[] tab){
        int sum = 0;
        for(int i = 0; i<tab.length; i++){
            sum += tab[i];
        }
        System.out.println(sum);
    }

    public void sub(int a, int b) {
        int sub = a - b;
        System.out.println(sub);
    }

    public void mul(int a, int b) {
        int mul = a * b;
        System.out.println(mul);
    }

    public void div(int a, int b) {
        int div = a / b;
        System.out.println(div);
    }
}
