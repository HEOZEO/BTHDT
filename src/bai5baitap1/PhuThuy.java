package bai5baitap1;

public class PhuThuy extends NhanVat {
    private boolean choi;
    private boolean gay;

    public PhuThuy(boolean choi, boolean gay, String ten, String id, String gioitinh, String hanhdong, int sucmanh) {
        super(ten, id, gioitinh, hanhdong, sucmanh);
        this.choi = choi;
        this.gay = gay;
    }

    public boolean isChoi() {
        return choi;
    }

    public void setChoi(boolean choi) {
        this.choi = choi;
    }

    public boolean isGay() {
        return gay;
    }

    public void setGay(boolean gay) {
        this.gay = gay;
    }

    @Override
    public void sucmanh() {
        System.out.println("power 14000"); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    public void hanhdong() {
        System.out.println("nem cay kiem"); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }
    
    
    @Override
    public String toString() {
        return "PhuThuy{" + "choi=" + choi + ", gay=" + gay + '}';
    }
    
    
}
