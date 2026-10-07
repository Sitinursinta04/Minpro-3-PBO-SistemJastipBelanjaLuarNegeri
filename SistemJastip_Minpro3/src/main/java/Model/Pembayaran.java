/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt 
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java 
 */
package Model;

/**
 *
 * @author Lenovo
 */
public class Pembayaran {

    private String metodePembayaran;

    // Constructor
    public Pembayaran(String metodePembayaran) {
        this.metodePembayaran = metodePembayaran;
    }

    // Getter
    public String getMetodePembayaran() {
        return metodePembayaran;
    }

    // Setter
    public void setMetodePembayaran(String metodePembayaran) {
        this.metodePembayaran = metodePembayaran;
    }
}