package Student;

public class MahasiswaReport
{
    private static final int A = 4;
    private static final int B = 3;
    private static final int C = 2;
    private static final int D = 1;
    private static final int E = 0;
    private String mk1;
    private String mk2;
    private int sks1;
    private int sks2;
    private String nilai1;
    private String nilai2;

    MahasiswaReport(String mk1, String mk2, int sks1, int sks2, String nilai1, String nilai2) {
        this.mk1 = mk1;
        this.mk2 = mk2;
        this.sks1 = sks1;
        this.sks2 = sks2;
        this.nilai1 = nilai1;
        this.nilai2 = nilai2;
    }
    MahasiswaReport(MahasiswaReport sp) {}
    public String getmk1()
    {
        return  "";
    }
    public void setmk1(String mk1) {

    }
    public String getmk2()
    {
        return  "";
    }
    public void setmk2(String mk2) {

    }
    public int getsks1()
    {
        return  0;
    }
    public void setsks1(int sks1) {

    }
    public int getsks2()
    {
        return  0;
    }
    public void setsks2(int sks2) {

    }
    public String getnilai1()
    {
        return  "";
    }
    public void setnilai1(String nilai1) {

    }
    public String getnilai2()
    {
        return  "";
    }
    public void setnilai2(String nilai2) {

    }
    public float HitungNR()
    {
//        int NR;
//        NR = (mk1 + mk2) / (sks1 + sks2);
        /*
            Nilai NR adalah : ( Nilai mutu MK1 + Nilai mutu MK2 ) / (sks MK1 + sks MK2)
         */
        return 0;
    }
    public float ConvertNilaiMutu(String HurufMutu){
        float mutu;
//        if(HurufMutu == 'A'){
//            System.out.println("4");
//        }else if(HurufMutu == 'B'){
//            System.out.println("3");
//        }else if(HurufMutu == 'C'){
//            System.out.println("2");
//        }else if(HurufMutu == 'D'){
//            System.out.println("1");
//        }else if(HurufMutu == 'E'){
//            System.out.println("0");
//        }
        /*
            Huruf mutu A : nilai mutu 4
            Huruf mutu B : nilai mutu 3
            Huruf mutu C : nilai mutu 2
            Huruf mutu D : nilai mutu 1
            Huruf mutu E : nilai mutu 0
         */
        return 0;
    }
    public String toString() {
        /*
            Mengembalikan informasi laporan nilai mahasiswa
         */
        return "";
    }
}
