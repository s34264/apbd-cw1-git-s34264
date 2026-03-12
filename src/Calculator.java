import java.util.Scanner;

public class Calculator {

    public int sum(int a, int b){
        return a+b;
    }
    public int sub(int a, int b){
        return a-b;
    }
    public int mul(int a, int b){
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

    public void start(){
        Scanner input = new Scanner(System.in);
        String userdata = "";
        userdata = input.nextLine();
        while(!userdata.equals("exit")){
            int a = Integer.parseInt( userdata.split(" ")[0]);
            String op = userdata.split(" ")[1];
            int b = Integer.parseInt( userdata.split(" ")[2]);

            int res = -1;

            switch(op){
                case "+":
                    System.out.println(sum(a,b));
                    break;
                case "-":
                    System.out.println(sub(a,b));
                    break;
                case "*":
                    System.out.println(mul(a,b));
                    break;
                default:
                    System.out.println("error");
                    break;
            }
            userdata = input.nextLine();
        }


    }
}
