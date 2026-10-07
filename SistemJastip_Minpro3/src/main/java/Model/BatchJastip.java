/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author Lenovo
 */
public class BatchJastip {

    private String idBatch;
    private String negaraTujuan;
    private String tanggalBuka;
    private String batasOrder;
    private String tanggalBerangkat;
    private String statusBatch;

    public BatchJastip(
            String idBatch,
            String negaraTujuan,
            String tanggalBuka,
            String batasOrder,
            String tanggalBerangkat,
            String statusBatch) {

        this.idBatch = idBatch;
        this.negaraTujuan = negaraTujuan;
        this.tanggalBuka = tanggalBuka;
        this.batasOrder = batasOrder;
        this.tanggalBerangkat = tanggalBerangkat;
        this.statusBatch = statusBatch;
    }

    public String getIdBatch() {
        return idBatch;
    }

    public String getNegaraTujuan() {
        return negaraTujuan;
    }

    public String getTanggalBuka() {
        return tanggalBuka;
    }

    public String getBatasOrder() {
        return batasOrder;
    }

    public String getTanggalBerangkat() {
        return tanggalBerangkat;
    }

    public String getStatusBatch() {
        return statusBatch;
    }

    public void setNegaraTujuan(String negaraTujuan) {
        this.negaraTujuan = negaraTujuan;
    }

    public void setTanggalBuka(String tanggalBuka) {
        this.tanggalBuka = tanggalBuka;
    }

    public void setBatasOrder(String batasOrder) {
        this.batasOrder = batasOrder;
    }

    public void setTanggalBerangkat(String tanggalBerangkat) {
        this.tanggalBerangkat = tanggalBerangkat;
    }

    public void setStatusBatch(String statusBatch) {
        this.statusBatch = statusBatch;
    }
}