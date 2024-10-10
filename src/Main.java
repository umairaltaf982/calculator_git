public class Main {
    public int add(int a , int b){
        if(a >= 0 && b >= 0 && Character.isDigit(a) && Character.isDigit(b)) {
            return a + b;
        }
        return 0;
    }
   public int multiplication(int a ,int b){
       if(a >= 0 && b >= 0 && Character.isDigit(a) && Character.isDigit(b)) {
           return a * b;
       }
       return 0;
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