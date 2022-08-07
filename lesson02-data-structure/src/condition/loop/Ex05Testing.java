package condition.loop;

public class Ex05Testing {
    // Viet 1 function tim max cua 2 so a va b

    private static int findMax(int a, int b){
        // toan tu 3 ngoi: N1 = Expression ? N2 : N3
        /* Su dung khi N2 va N3 don gian
        * if(expression){
        *   N1 = N2;
        * } else {
        *   N1 = N3;
        * }
        * */
        return a > b ? a : b;
    }

    public static void main(String[] args) {
        System.out.println("Max : "+findMax(2, 4));
    }
}
