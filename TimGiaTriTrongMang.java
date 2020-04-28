package TH_TimGiaTriTrongMang.TH_TimGiaTriTrongMang;

import java.util.Scanner;

public class TimGiaTriTrongMang {
    public static void main(String[] args) {
        // 1-  ta có 1 mảng các danh sách các sinh viên
        String[] students = {"Christian", "Michael", "Camila", "Sienna", "Tanya", "Connor", "Zachariah", "Mallory", "Zoe", "Emily","Lien"};
        // 2- khai báo 1 biến để lưu tên tìm kiếm và gán giá trị nhập vào
        Scanner scanner=new Scanner(System.in);
        System.out.println("Nhập Tên Muốn Tìm");
        String name=scanner.nextLine();
        // 3- Duyệt Mảng
        boolean isExist=false;
        for (int i=0;i<students.length;i++){
            if (students[i].equals(name)){
                System.out.println("STT: "+(i+1)+"\n"+"Tên SV : "+name);
                isExist=true;
                break;
            }
        }
        if (!isExist){
            System.out.println("Not Found "+name+"in the list");
        }
    }
}
