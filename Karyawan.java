public class Karyawan {
    private String nama;
    private int usia;
    private String posisi;
    private double gaji;

    public Karyawan(String nama, int usia, String posisi) {
        this(nama, usia, posisi, 0);
    }

    public Karyawan(String nama, int usia, String posisi, double gaji) {
        this.nama = nama;
        this.usia = usia;
        this.posisi = posisi;
        this.gaji = gaji;
    }

    public void setPosisi(String posisi) {
        this.posisi = posisi;
    }

    public void setGaji(double gaji) {
        this.gaji = gaji;
    }

    public double hitungBonus() {
        double bonus = 0;

        if (this.posisi.equals("Manager")) {
            bonus = this.gaji * 0.1;
        } else if (this.posisi.equals("Supervisor")) {
            bonus = this.gaji * 0.05;
        } else if (this.posisi.equals("Staff")) {
            bonus = this.gaji * 0.02;
        }

        return bonus;
    }

    public void printkaryawanData() {
        System.out.println("Nama: " + this.nama);
        System.out.println("Usia: " + this.usia);
        System.out.println("Posisi: " + this.posisi);
        System.out.println("Gaji: " + this.gaji);
        System.out.println("Bonus: " + this.hitungBonus());
    }

    public static void main(String[] args) {
        Karyawan karyawan1 = new Karyawan("Imanda", 22, "Manager", 5000);
        karyawan1.printkaryawanData();

        System.out.println();

        Karyawan karyawan2 = new Karyawan("David", 25, "Supervisor");
        karyawan2.setGaji(3000);
        karyawan2.printkaryawanData();
    }
}
