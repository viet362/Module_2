public class BT_Loop {

    //[Bài tập] Hiển thị 20 số nguyên tố đầu tiên
    /*
    public static void main(String[] args) {
        int count = 0;
        int number = 2;
        while (count < 20) {
            int i = 2;
            boolean check = true;
            while (i <= Math.sqrt(number)) {
                if (number % i == 0) {
                    check = false;
                    break;
                }
                i++;
            }
            if (check) {
                System.out.println(number);
                count++;
            }
            number++;
        }
    }
     */

    // [Bài tập] Hiển thị các số nguyên tố nhỏ hơn 100
    public static void main(String[] args) {
        int max = 100;
        int number = 2;
        while (number < max) {
            int i = 2;
            boolean check = true;
            while (i <= Math.sqrt(number)) {
                if (number % i == 0) {
                    check = false;
                    break;
                }
                i++;
            }
            if (check) {
                System.out.println(number);
            }
            number++;
        }
    }

    // [Bài tập] Hiển thị các loại hình
    //

}
