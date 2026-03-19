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

    public void calculateAverage(int[] nums){
        int sum = 0;
        for(int i = 0; i<nums.length; i++){
            sum += nums[i];
        }
        int average  = sum / nums.length;
        System.out.println(average);
    }

    public void calculateMin(int[] nums){
        //ustalamy początkowe minnimum
        int min = nums[0];
        for(int i = 1; i<nums.length; i++){
            //szukamy najmniejszej wartości z tablicy
            if(nums[i] < min){
                min = nums[i];
            }
        }
        //wyświetlamy wynik
        System.out.println(min);
    }
}
