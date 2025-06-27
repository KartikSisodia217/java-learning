class Operations{
    public int add(int n1, int n2)
    {
        return n1 + n2;
    }
    public int subtract(int n1, int n2)
    {
        return n1 - n2;
    }
    public int multiply(int n1, int n2)
    {

        return n1 * n2;
    }
    public int divide(int n1, int n2)
    {

        return  n1 / n2;
    }
}



public class Calculator {
    public static void main (String[] args){
        int num1 = 10;
        String op = "/";
        int num2= 5;
        Operations calc = new Operations();
//        if(op=="+") {
//            int result1 = calc.add(num1, num2);
//            System.out.println(num1 + " + " + num2 + " = " + result1);
//        }
//
//        else if(op=="-") {
//            int result2 = calc.subtract(num1, num2);
//            System.out.println(num1 + " - " + num2 + " = " + result2);
//        }
//
//        else if(op=="*") {
//            int result3 = calc.multiply(num1, num2);
//            System.out.println(num1 + " * " + num2 + " = " + result3);
//        }
//
//        else if (op == "/") {
//            int result4 = calc.divide(num1, num2);
//            System.out.println(num1 + " / " + num2 + " = " + result4);
//        }
//        else
//            System.out.println("invalid operation");
        switch (op){
            case("+"):
                int result1 = calc.add(num1, num2);
                System.out.println(result1);
                break;
            case("-"):
                int result2 = calc.subtract(num1, num2);
                System.out.println(result2);
                break;
            case("*"):
                int result3 = calc.multiply(num1, num2);
                System.out.println(result3);
                break;
            case("/"):
                int result4 = calc.divide(num1, num2);
                System.out.println(result4);
                break;
        }
    }
}
