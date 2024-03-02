public class Komputer {
    // Deklarasi atribut kelas Komputer
    String jenis_komputer; // Deklarasi variabel jenis_komputer dengan tipe data String
    private String merk; // Deklarasi variabel merk dengan tipe data String dan modifier private

    // Metode untuk mengatur data jenis_komputer dan merk
    public void setDataKomputer(String Jenis, String merk){
        jenis_komputer = Jenis; // Inisialisasi nilai jenis_komputer dengan nilai parameter Jenis
        this.merk = merk; // Inisialisasi nilai merk dengan nilai parameter merk menggunakan keyword 'this' untuk merujuk ke variabel kelas
    }
    
    // Metode untuk mendapatkan nilai jenis_komputer
    public String getJenis(){
        return jenis_komputer; // Mengembalikan nilai jenis_komputer
    }
    
    // Metode untuk mendapatkan nilai merk
    public String getmerk(){
        return merk; // Mengembalikan nilai merk
    }

    // Metode utama (main) untuk melakukan uji coba
    public static void main(String[] args) {
        Komputer mykom = new Komputer(); // Membuat objek baru dari kelas Komputer dengan nama mykom
        mykom.setDataKomputer("LAPTOP", "MACBOOK"); // Memanggil metode setDataKomputer dengan nilai "LAPTOP" dan "MACBOOK"
        System.out.println(mykom.getJenis()); // Menampilkan jenis komputer dengan memanggil metode getJenis()
        System.out.println(mykom.getmerk()); // Menampilkan merk komputer dengan memanggil metode getmerk()
    }
}
