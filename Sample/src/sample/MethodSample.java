package sample;


public class MethodSample {

    public static void main(String[]args) {
        var number1 = 100;
        var number2 = 10;
         
        sumMethod1 (number1,number2);
        
        //------追記（ここから）ーーーーーーー
        var result2 = sumMethod2(number1,number2);
   System.out.print("sumMethod2の結果は" ＋ result2);
//---------追記（ここまで）ーーーーーーーー
    
    }

    private static Object sumMethod2(int number1, int number2) {
        // TODO 自動生成されたメソッド・スタブ
        return null;
    }

    public static void sumMethod1(int num1,int num2) {
        var result = num1 + num2;
        System.out.println("sumMethod1の結果は" + result) ;
        
        
        //ーーーーーー追記（ここから）ーーーーーー
        
     public static record sumMethod2(int num1,int num2) {
           var resukt = num1 + num2;
           return result;           
       }
       //ーーーーーーー追記（ここまで）ーーーーーー
    }
    
}