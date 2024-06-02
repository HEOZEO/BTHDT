package bai5baitap1;

public class Game {
    public static void main(String[] args) {
        KyBinh kb = new KyBinh(true, true, true, true, "heo", "1234", "gioitinh", "cuocsong", (byte)0);
        System.out.println(kb);
        kb.hanhdong();
        kb.sucmanh();
    }

   
}
