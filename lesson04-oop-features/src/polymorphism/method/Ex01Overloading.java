package polymorphism.method;

public class Ex01Overloading {
    public static void main(String[] args){
        // Tim tong 2 so, 3 so, n so - so nguyen
        int a = 10;
        int b = 5;
        int c = 20;
        System.out.println("sum2: " + sum(4, 6));
        System.out.println("sum3: " + sum(4, 6, 8));


    }

    private static int sum(int a, int b){
        return a + b;
    }


    private static int sum(int a, int b, int c){
        return a + b + c;
    }

    private static int sum(int a, int b, int c, int d){
        return a + b + c + d;
    }

    private static int sum(int... numbers){
        int sum = 0;
        for(int num : numbers){
            sum += num;
        }
        return sum;
    }
}
