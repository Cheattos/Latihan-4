package Student;

public class Dosen extends Orang
{
    private String mk;
    private String strata;
    private int salary; // Nilai salary harus lebih dari 0

    public Dosen(String nama, String alamat, String kota, int umur, char jenis_kelamin, String mk, String strata, int salary) {
        setnama(nama);
        setalamat(alamat);
        setkota(kota);
        setumur(umur);
        setjenis_kelamin(jenis_kelamin);
        this.mk = mk;
        this.strata = strata;
        this.salary = salary;
    }
    public void setStrata(String strata) {}
    public void setMk(String tittle) { }
    public void setSalary(int salary) { }
    @Override
    public String toString()
    {
        System.out.println("Informasi Dosen");
        System.out.println("=========================");
        System.out.println(super.toString());
        System.out.println("MK  : " + this.mk);
        System.out.println("Strata  : " + this.strata);
        System.out.println("Salary  : " + this.salary);
        return "";
    }
}