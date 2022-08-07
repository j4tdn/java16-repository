package datastructure;

public class Ex13BasicArray {
    public static void main(String[] args) {
        // Mang la kieu du lieu doi tuong
        // 5 la do dai lengh cua mang
        // Tao 1 o nho o vung nho heap luu 5 gia tri mac dinh cua kieu int
        int[] digits = new int[5];

        // gan gia tri
        digits[1] = 99;
        System.out.println("digits[1] = " + digits[1]);

        // Khoi tao o nho va gia tri cho mang
        String[] sequences = {"a", "b", "c", "d"};
        System.out.println("Length: " + sequences.length);

        // for-index [0-length)
        for(int i = 0; i < sequences.length; i++){
            System.out.println(sequences[i]);
        }

        // for-each --> Get gia tri ko quan tam index
        for(String each : sequences){
            System.out.println("each: " + each);
        }

        // breank, continue in loop
    }
}
