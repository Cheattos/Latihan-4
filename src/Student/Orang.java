package Student;

public class Orang {

    private String nama;
    private String alamat;
    private String kota;
    private int umur;
    private char jenis_kelamin;

    protected void setnama(String nama) {
        this.nama = nama;
    }

    protected void setalamat(String alamat) {
        this.alamat = alamat;
    }

    protected void setkota(String kota) {
        this.kota = kota;
    }

    protected void setumur(int umur) {
        if (umur <= 0) {
            System.out.println("Maaf tidak bisa");
        } else {
            this.umur = umur;
        }
    }

    protected void setjenis_kelamin(char jenis_kelamin) {
        if (jenis_kelamin == 'l' || jenis_kelamin == 'L')
            this.jenis_kelamin = 'L';
        else if (jenis_kelamin == 'p' || jenis_kelamin == 'P')
            this.jenis_kelamin = 'P';
        else
            System.out.println("Maaf ...");
    }

    String getnama() {
        return this.nama;
    }

    String getalamat() {
        return this.alamat;
    }

    String getkota() {
        return this.kota;
    }

    int getumur() {
        return 0;
    }

    char getjenis_kelamin() {
        return this.jenis_kelamin;
    }

    public String toString() {
        String str = "nama       :" + this.nama + " \n" +
                " Alamat     :" + this.alamat + "\n" +
                " Kota       :" + this.kota + "\n" +
                " Umur       :" + this.umur + "";
        return str;
    }
}