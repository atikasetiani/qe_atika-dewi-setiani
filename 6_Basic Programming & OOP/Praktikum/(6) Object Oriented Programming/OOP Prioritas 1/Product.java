/*
 * SECTION 6 - BASIC PROGRAMMING & OOP
 * Object Oriented Programming
 * Praktikum Soal Prioritas 1 
 * Class Produk
 */
package OOPPriotitas1;

public class Product {
    private String nama;
    private String deskripsi;
    private int harga;
    private int jumlah_stok;
    
    public Product(String nama, String deskripsi, int harga, int jumlah_stok) {
        this.nama = nama;
        this.deskripsi = deskripsi;
        this.harga = harga;
        this.jumlah_stok = jumlah_stok;
    }
    
    public void setNama(String nama) {
        this.nama = nama;
    }
    
    public String getNama() {
        return nama;
    }
    
    public void setDeskripsi(String deskripsi) {
        this.deskripsi = deskripsi;
    }
    
    public String getDeskripsi() {
        return deskripsi;
    }
    
    public void setHarga(int harga) {
        this.harga = harga;
    }
    
    public double getHarga() {
        return harga;
    }
    
    public void setJumlah_stok(int jumlah_stok) {
        this.jumlah_stok = jumlah_stok;
    }
    
    public int getJumlah_stok() {
        return jumlah_stok;
    }
    
    public void getInfo() {
        System.out.println("===\nINFO PRODUK");
        System.out.println("Nama: " + nama);
        System.out.println("Deskripsi: " + deskripsi);
        System.out.println("Harga: " + harga);
        System.out.println("Jumlah stok: " + jumlah_stok);
        System.out.println("===");
    }
}

