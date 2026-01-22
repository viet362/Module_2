import java.util.Scanner;

public class BT_Mang {

    //[Bài tập] Xoá phần tử khỏi mảng
    /*
    public static void main(String[] args) {
        int[] arr = {4, 12, 7, 8, 1, 6, 9};
        Scanner input = new Scanner(System.in);
        System.out.print("Nhập số muốn xóa: ");
        int number = input.nextInt();
        int index_del = -1;

        for (int i = 0; i < arr.length-1; i++) {
            if (arr[i] == number) {
                index_del = i;
                break;
            }
        }
        if (index_del == -1) {
            System.out.println("Không tìm thấy số cần xóa trong mảng.");
        } else {
            for (int i = index_del; i < arr.length-1; i++) {
                arr[i] = arr[i + 1];
            }
            System.out.print("Mảng sau khi xóa: ");
            for (int i = 0; i < arr.length - 1; i++) {
                System.out.print(arr[i] + " ");
            }
        }
    }
     */

    //[Bài tập] Thêm phần tử vào mảng
    /*
    public static void main(String[] args) {
        int[] arr = {4, 12, 7, 8, 1, 6, 9};
        Scanner input = new Scanner(System.in);
        System.out.print("Nhập số muốn thêm: ");
        int number = input.nextInt();
        System.out.print("Nhập vị trí thêm (0~" + (arr.length - 1) + "): ");
        int index = input.nextInt();

        if (index <0 || index > arr.length -1) {
            System.out.println("Vị trí không hợp lệ");
        } else {
            int[] newArr = new int[arr.length + 1];
            for (int i = 0; i < index; i++) {
                newArr[i] = arr[i];
            }
            newArr[index] = number;
            for (int i = index; i < arr.length; i++) {
                newArr[i + 1] = arr[i];
            }
            System.out.print("Mảng sau khi thêm: ");
            for (int i = 0; i < newArr.length; i++) {
                System.out.print(newArr[i] + " ");
            }
        }
    }
     */

    //[Bài tập] Gộp mảng
    /*
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số phần tử mảng 1:");
        int size1 = scanner.nextInt();
        int[] array1;
        array1 = new int[size1];
        int i1 = 0;
        while (i1 < array1.length) {
            System.out.print("Nhập vị trí " + (i1 + 1) + ": ");
            array1[i1] = scanner.nextInt();
            i1++;
        }

        System.out.print("Nhập số phần tử mảng 2:");
        int size2 = scanner.nextInt();
        int[] array2;
        array2 = new int[size2];
        int i2 = 0;
        while (i2 < array2.length) {
            System.out.print("Nhập vị trí " + (i2 + 1) + ": ");
            array2[i2] = scanner.nextInt();
            i2++;
        }

        int size3 = size1 + size2;
        int[] array3 = new int[size3];
        for(int i=0; i< array1.length; i++){
            array3[i] = array1[i];
        }
        for(int i=0; i< array2.length; i++){
            array3[i+array1.length] = array2[i];
        }
        System.out.print("Mảng sau khi gộp: ");
        for (int i = 0; i < array3.length; i++) {
            System.out.print(array3[i] + " ");
        }
    }
     */

    //[Bài tập] Tìm phần tử lớn nhất trong mảng hai chiều
    /*
    public static void main(String[] args) {
        int[][] arr = {
                {4, 12, 7, 8},
                {1, 6, 9, 11},
                {15, 3, 2, 10}
        };
        int max = 0;
        int row = 0, col = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                if(max < arr[i][j]){
                    max = arr[i][j];
                    row = i;
                    col = j;
                }
            }
        }
        System.out.println("Giá trị lớn nhất là: " + max);
        System.out.println("Tọa độ là: (" + row + "," + col +")");
    }
     */

    //[Bài tập] Tìm giá trị nhỏ nhất trong mảng
    /*
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số phần tử mảng:");
        int size1 = scanner.nextInt();
        int[] array1;
        array1 = new int[size1];
        int i1 = 0;
        while (i1 < array1.length) {
            System.out.print("Nhập vị trí " + (i1 + 1) + ": ");
            array1[i1] = scanner.nextInt();
            i1++;
        }

        int min = array1[0];
        for (int i = 0; i < array1.length; i++) {
            if(array1[i] < min){
                min = array1[i];
            }
        }
        System.out.println("Số nhỏ nhất của mảng là: " + min);
    }
     */

    //[*Bài tập] Tính tổng các số ở một cột xác định
    /*
    public static void main(String[] args) {
        int[][] arr = {
                {4, 12, 7, 8},
                {1, 6, 9, 11},
                {15, 3, 2, 10}
        };

        int sum_col = 0;
        Scanner input = new Scanner(System.in);
        System.out.print("Nhập số cột muốn tính tổng: ");
        int col = input.nextInt();

        for(int i=0; i<arr.length; i++){
            sum_col += arr[i][col-1];
        }
        System.out.println("Tổng giá trị của cột thứ " + col + " là: " + sum_col);
    }
     */

    //[*Bài tập] Mảng hai chiều - tính tổng các số ở đường chéo chính của ma trận vuông
    /*
    public static void main(String[] args) {
        int[][] arr = {
                {4, 12, 7, 8},
                {1, 6, 9, 11},
                {15, 3, 2, 10},
                {13, 7, 5, 8}
        };

        int sum_diagonal = 0;
        for(int i=0; i<arr.length; i++){
            for (int j = 0; j < arr[0].length; j++) {
                if(i==j){
                    sum_diagonal += arr[i][j];
                }
            }
        }
        System.out.println("Tổng đường chéo chính là: " + sum_diagonal);
    }
     */

    //[*Bài tập] Đếm số lần xuất hiện của ký tự trong chuỗi

    public static void main(String[] args) {
        String str = "gbvaibgoaogboagbaoeigbiuabgab";
        Scanner input = new Scanner(System.in);
        System.out.print("Nhập ký tự muốn đối chiếu: ");
        char find_str = input.nextLine().charAt(0);
        int count = 0;

        for(int i=0; i<str.length();i++){
            if(str.charAt(i) == find_str){
                count++;
            }
        }
        System.out.println("Số lần kí tự " + find_str + " xuất hiện là: " + count);
    }

}
