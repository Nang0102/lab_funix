package Lab1_bai2;

public class Lab1_bai2 {
    public int R;
    public float pi = 3.14f;
    public Lab1_bai2(int R){
        this.R = R;
    }
    public float tinhChuVi (){
        float chuvi = 2 * R * pi;
        return chuvi;
    }

    public float tinhDienTich(){
        float dientich = pi * R * R;
        return dientich;
    }

}
