package praktikum2.soal3;
//nama file tidak sesuai dengan class yang ditulis
//public class Employee
public class Pegawai {
    public String nama;
    //Pada baris ini salah karena asal tempat pasti 1 kata dan bukan 1 huruf
    //public char asal
    public String asal;
    public String jabatan;
    public int umur;

    public String getNama(){
        return nama;
    }

    public String getAsal(){
        return asal;
    }

    //Pada baris ini salah karena tidak ada argumen yang ada dalam ()
    //public void setJabatan()
    public void setJabatan(String jabatan){
        //Pada baris ini salah karena this.variabel selalu ditunjuk ke variabel tersebut
        //this.jabatan = j;
        this.jabatan = jabatan;
    }
}

