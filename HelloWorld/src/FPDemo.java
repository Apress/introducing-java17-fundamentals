public class FPDemo {

    public double sum() {
        double num1 = 10e+10;
        double num2 = 6e+08;

        return num1+num2;

    }

    public static void main(String ...args){
        FPDemo o = new FPDemo();
        System.out.println(o.sum());

    }

}
