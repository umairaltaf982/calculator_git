public class Main {
    public int add(int a , int b){
        return a+b;
    }
   public int multiplication(int a ,int b){
        return a*b;
   }
    public static void main(String[] args) {
        Main m= new Main();
        int sum=0;
        System.out.println("sum of two nums");
        sum=m.add(3,4);
        System.out.println(sum);
        int mul=0;
        System.out.println("\n multiplication of two nums");
        mul=m.multiplication(4,8);
        System.out.println(mul);
    }
}