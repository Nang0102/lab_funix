package Lab1_bai1;
class Lab1Triangle {
    public int a;
    public int b;
    public int c;

    public Lab1Triangle (int a, int b, int c){
        this.a = a;
        this.b = b;
        this.c = c;
    }
    public int tinhChuVi(){
        int chuVi = a + b + c;
        return chuVi;
    }

    public  float tinhDienTich(){
        float p = (float)(a + b + c)/2;
        float dientich = (float) Math.sqrt(p * (p - a) * (p - b) * (p - c));
        return dientich;
    }

}
