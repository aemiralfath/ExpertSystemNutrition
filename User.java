public class User{
    private String nama;
    private char jk;
    private int umur;
    private double bb;
    private double tinggi;
    private double imt;
    private String penyakit;

    public void setNama(String nama){
        this.nama = nama;
    }

    public void setJK(char jk){
        this.jk = jk;
    }

    public void setUmur(int umur){
        this.umur = umur;
    }
    public void setBB(double bb){
        this.bb = bb;
    }
    public void setTinggi(double tinggi){
        this.tinggi = tinggi;
    }
    public void setIMT(double imt){
        this.imt = imt;
    }
    public void setPenyakit(String penyakit){
        this.penyakit = penyakit;
    }

    public String getNama(){
        return nama;
    }

    public char getJK(){
        return jk;
    }

    public int getUmur(){
        return umur;
    }

    public double getBB(){
        return bb;
    }

    public double getTinggi(){
        return tinggi;
    }
    public double getIMT(){
        return imt;
    }

    public String getPenyakit(){
        return penyakit;
    }
}