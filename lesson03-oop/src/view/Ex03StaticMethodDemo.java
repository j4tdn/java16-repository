package view;

public class Ex03StaticMethodDemo {
    private int x;
    private int y;

    public Ex03StaticMethodDemo(int x, int y){
        this.x = x;
        this.y = y;
    }
    public static void main(String[] args) {
        System.out.println("sum 1 : " + sum(5, 10));
        Ex03StaticMethodDemo o1 = new Ex03StaticMethodDemo(50, 8);

        System.out.println(o1.sub());
    }


    // Ham chi phu thuoc vao tham so truyen vao, khong phu thuoc vao doi tuong dang goi
    // ==> Cho ham static
    private static int sum(int a, int b){
        return a + b;
    }

    // Ham phu thuoc vao doi tuong dang goi
    // ==> Cho ham non-static
    private int sub(){
        return x - y;
    }
}
