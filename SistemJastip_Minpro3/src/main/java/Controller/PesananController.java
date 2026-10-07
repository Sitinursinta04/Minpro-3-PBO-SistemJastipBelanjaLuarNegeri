/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java 
 */
package Controller;

/**
 *
 * @author Lenovo
 */

import Model.BatchJastip;
import Model.Barang;
import Model.JastipFashion;
import Model.JastipSkincare;
import Model.JastipElektronik;
import Model.Pelanggan;
import Model.Pembayaran;
import Model.PesananJastip;
import View.PesananView;

import java.util.ArrayList;

public class PesananController {

    private ArrayList<PesananJastip> daftarPesanan;
    private ArrayList<BatchJastip> daftarBatch;
    private PesananView view;

    public PesananController() {

        daftarPesanan = new ArrayList<>();
        daftarBatch = new ArrayList<>();
        view = new PesananView();

        // ==========================================
        // DATA AWAL BATCH
        // ==========================================

        BatchJastip batch1 =
                new BatchJastip(
                        "BTH-001",
                        "Korea Selatan",
                        "1 Oktober 2026",
                        "10 Oktober 2026",
                        "15 Oktober 2026",
                        "Dibuka"
                );

        daftarBatch.add(batch1);

        BatchJastip batch2 =
                new BatchJastip(
                        "BTH-002",
                        "USA",
                        "5 Oktober 2026",
                        "15 Oktober 2026",
                        "20 Oktober 2026",
                        "Dibuka"
                );

        daftarBatch.add(batch2);

        // ==========================================
        // DATA AWAL PESANAN FASHION
        // ==========================================

        Pelanggan pelanggan1 =
                new Pelanggan(
                        "PLG-001",
                        "Sinta",
                        "081234567890"
                );

        Barang barang1 =
                new Barang(
                        "Dress",
                        "USA",
                        750000,
                        1.2
                );

        Pembayaran pembayaran1 =
                new Pembayaran(
                        "Transfer Bank"
                );

        JastipFashion fashion =
                new JastipFashion(
                        "FSH-001",
                        pelanggan1,
                        barang1,
                        1,
                        pembayaran1,
                        "Menunggu Pembayaran",
                        100000,
                        batch2,
                        "Pastikan ukuran sesuai pesanan",
                        "M",
                        "Hitam"
                );

        daftarPesanan.add(fashion);

        // ==========================================
        // DATA AWAL PESANAN SKINCARE
        // ==========================================

        Pelanggan pelanggan2 =
                new Pelanggan(
                        "PLG-002",
                        "Nursinta",
                        "082345678901"
                );

        Barang barang2 =
                new Barang(
                        "Serum",
                        "Korea Selatan",
                        350000,
                        0.5
                );

        Pembayaran pembayaran2 =
                new Pembayaran(
                        "E-Wallet"
                );

        JastipSkincare skincare =
                new JastipSkincare(
                        "SKN-001",
                        pelanggan2,
                        barang2,
                        2,
                        pembayaran2,
                        "Pembayaran Berhasil",
                        50000,
                        batch1,
                        "Pastikan segel produk masih utuh",
                        "Normal",
                        30
                );

        skincare.ubahStatus(
                "Sedang Dibeli"
        );

        daftarPesanan.add(skincare);

        // ==========================================
        // DATA AWAL PESANAN ELEKTRONIK
        // ==========================================

        Pelanggan pelanggan3 =
                new Pelanggan(
                        "PLG-003",
                        "Siti",
                        "083456789012"
                );

        Barang barang3 =
                new Barang(
                        "Headphone",
                        "USA",
                        1200000,
                        0.8
                );

        Pembayaran pembayaran3 =
                new Pembayaran(
                        "Transfer Bank"
                );

        JastipElektronik elektronik =
                new JastipElektronik(
                        "ELK-001",
                        pelanggan3,
                        barang3,
                        1,
                        pembayaran3,
                        "Pembayaran Berhasil",
                        75000,
                        batch2,
                        "Pastikan barang masih tersegel",
                        "Sony",
                        12
                );

        elektronik.ubahStatus(
                "Sedang Dibeli"
        );

        daftarPesanan.add(elektronik);
    }

    // ==========================================
    // GENERATE ID FASHION
    // ==========================================

    public String generateIdFashion() {

        int nomor = 1;

        for (PesananJastip pesanan :
                daftarPesanan) {

            String id =
                    pesanan.getIdPesanan();

            if (id != null &&
                    id.startsWith("FSH-")) {

                try {

                    int nomorPesanan =
                            Integer.parseInt(
                                    id.substring(4)
                            );

                    if (nomorPesanan >= nomor) {

                        nomor =
                                nomorPesanan + 1;
                    }

                } catch (NumberFormatException e) {

                    // Abaikan jika format ID tidak sesuai
                }
            }
        }

        return String.format(
                "FSH-%03d",
                nomor
        );
    }

    // ==========================================
    // GENERATE ID SKINCARE
    // ==========================================

    public String generateIdSkincare() {

        int nomor = 1;

        for (PesananJastip pesanan :
                daftarPesanan) {

            String id =
                    pesanan.getIdPesanan();

            if (id != null &&
                    id.startsWith("SKN-")) {

                try {

                    int nomorPesanan =
                            Integer.parseInt(
                                    id.substring(4)
                            );

                    if (nomorPesanan >= nomor) {

                        nomor =
                                nomorPesanan + 1;
                    }

                } catch (NumberFormatException e) {

                    // Abaikan jika format ID tidak sesuai
                }
            }
        }

        return String.format(
                "SKN-%03d",
                nomor
        );
    }

    // ==========================================
    // GENERATE ID ELEKTRONIK
    // ==========================================

    public String generateIdElektronik() {

        int nomor = 1;

        for (PesananJastip pesanan :
                daftarPesanan) {

            String id =
                    pesanan.getIdPesanan();

            if (id != null &&
                    id.startsWith("ELK-")) {

                try {

                    int nomorPesanan =
                            Integer.parseInt(
                                    id.substring(4)
                            );

                    if (nomorPesanan >= nomor) {

                        nomor =
                                nomorPesanan + 1;
                    }

                } catch (NumberFormatException e) {

                    // Abaikan jika format ID tidak sesuai
                }
            }
        }

        return String.format(
                "ELK-%03d",
                nomor
        );
    }

    // ==========================================
    // GENERATE ID BATCH
    // ==========================================

    public String generateIdBatch() {

        int nomor = 1;

        for (BatchJastip batch :
                daftarBatch) {

            String id =
                    batch.getIdBatch();

            if (id != null &&
                    id.startsWith("BTH-")) {

                try {

                    int nomorBatch =
                            Integer.parseInt(
                                    id.substring(4)
                            );

                    if (nomorBatch >= nomor) {

                        nomor =
                                nomorBatch + 1;
                    }

                } catch (NumberFormatException e) {

                    // Abaikan jika format ID tidak sesuai
                }
            }
        }

        return String.format(
                "BTH-%03d",
                nomor
        );
    }

    // ==========================================
    // GENERATE ID PELANGGAN
    // ==========================================

    public String generateIdPelanggan() {

        int nomor = 1;

        for (PesananJastip pesanan :
                daftarPesanan) {

            String id =
                    pesanan.getPelanggan()
                            .getIdPelanggan();

            if (id != null &&
                    id.startsWith("PLG-")) {

                try {

                    int nomorPelanggan =
                            Integer.parseInt(
                                    id.substring(4)
                            );

                    if (nomorPelanggan >= nomor) {

                        nomor =
                                nomorPelanggan + 1;
                    }

                } catch (NumberFormatException e) {

                    // Abaikan jika format ID tidak sesuai
                }
            }
        }

        return String.format(
                "PLG-%03d",
                nomor
        );
    }

    // ==========================================
    // TAMBAH PESANAN
    // ==========================================

    public void tambahPesanan(
            PesananJastip pesanan) {

        if (pesanan != null) {

            daftarPesanan.add(
                    pesanan
            );
        }
    }

    // ==========================================
    // TAMPILKAN SEMUA PESANAN
    // ==========================================

    public void tampilkanPesanan() {

        view.tampilkanSemuaPesanan(
                daftarPesanan
        );
    }

    // ==========================================
    // TAMPILKAN PESANAN FASHION
    // ==========================================

    public void tampilkanPesananFashion() {

        ArrayList<PesananJastip> hasil =
                new ArrayList<>();

        for (PesananJastip pesanan :
                daftarPesanan) {

            if (pesanan instanceof JastipFashion) {

                hasil.add(
                        pesanan
                );
            }
        }

        view.tampilkanPesananFashion(
                hasil
        );
    }

    // ==========================================
    // TAMPILKAN PESANAN SKINCARE
    // ==========================================

    public void tampilkanPesananSkincare() {

        ArrayList<PesananJastip> hasil =
                new ArrayList<>();

        for (PesananJastip pesanan :
                daftarPesanan) {

            if (pesanan instanceof JastipSkincare) {

                hasil.add(
                        pesanan
                );
            }
        }

        view.tampilkanPesananSkincare(
                hasil
        );
    }

    // ==========================================
    // TAMPILKAN PESANAN ELEKTRONIK
    // ==========================================

    public void tampilkanPesananElektronik() {

        ArrayList<PesananJastip> hasil =
                new ArrayList<>();

        for (PesananJastip pesanan :
                daftarPesanan) {

            if (pesanan instanceof JastipElektronik) {

                hasil.add(
                        pesanan
                );
            }
        }

        view.tampilkanPesananElektronik(
                hasil
        );
    }

    // ==========================================
    // CARI PESANAN BERDASARKAN ID
    // ==========================================

    public PesananJastip cariPesanan(
            String idPesanan) {

        for (PesananJastip pesanan :
                daftarPesanan) {

            if (pesanan.getIdPesanan()
                    .equalsIgnoreCase(
                            idPesanan
                    )) {

                return pesanan;
            }
        }

        return null;
    }

    // ==========================================
    // CARI PESANAN BERDASARKAN NAMA
    // ==========================================

    public ArrayList<PesananJastip> cariPesananNama(
            String nama) {

        ArrayList<PesananJastip> hasil =
                new ArrayList<>();

        for (PesananJastip pesanan :
                daftarPesanan) {

            if (pesanan.getPelanggan()
                    .getNamaPelanggan()
                    .equalsIgnoreCase(
                            nama
                    )) {

                hasil.add(
                        pesanan
                );
            }
        }

        return hasil;
    }

    // ==========================================
    // TAMPILKAN PESANAN BERDASARKAN STATUS
    // ==========================================

    public void tampilkanPesananBerdasarkanStatus(
            String status) {

        ArrayList<PesananJastip> hasil =
                new ArrayList<>();

        for (PesananJastip pesanan :
                daftarPesanan) {

            if (pesanan.getStatusPesanan()
                    .equalsIgnoreCase(
                            status
                    )) {

                hasil.add(
                        pesanan
                );
            }
        }

        view.tampilkanPesananBerdasarkanStatus(
                hasil,
                status
        );
    }

    // ==========================================
    // UBAH PESANAN
    // ==========================================

    public boolean ubahPesanan(
            String idPesanan,
            String namaPelanggan,
            String nomorTelepon,
            String namaBarang,
            double harga,
            double berat,
            int jumlah,
            String requestKhusus) {

        PesananJastip pesanan =
                cariPesanan(
                        idPesanan
                );

        if (pesanan == null) {

            return false;
        }

        pesanan.getPelanggan()
                .setNamaPelanggan(
                        namaPelanggan
                );

        pesanan.getPelanggan()
                .setNomorTelepon(
                        nomorTelepon
                );

        pesanan.getBarang()
                .setNamaBarang(
                        namaBarang
                );

        pesanan.getBarang()
                .setHarga(
                        harga
                );

        pesanan.getBarang()
                .setBerat(
                        berat
                );

        pesanan.setJumlah(
                jumlah
        );

        pesanan.setRequestKhusus(
                requestKhusus
        );

        return true;
    }

    // ==========================================
    // UBAH STATUS PESANAN
    // ==========================================

    public boolean ubahStatusPesanan(
            String idPesanan,
            String statusBaru) {

        PesananJastip pesanan =
                cariPesanan(
                        idPesanan
                );

        if (pesanan == null) {

            return false;
        }

        return pesanan.ubahStatus(
                statusBaru
        );
    }

    // ==========================================
    // HAPUS PESANAN
    // ==========================================

    public boolean hapusPesanan(
            String idPesanan) {

        PesananJastip pesanan =
                cariPesanan(
                        idPesanan
                );

        if (pesanan == null) {

            return false;
        }

        return daftarPesanan.remove(
                pesanan
        );
    }

    // ==========================================
    // TAMPILKAN STRUK
    // ==========================================

    public void tampilkanStruk(
            String idPesanan) {

        PesananJastip pesanan =
                cariPesanan(
                        idPesanan
                );

        if (pesanan != null) {

            view.tampilkanStruk(
                    pesanan
            );

        } else {

            System.out.println();
            System.out.println(
                    "Pesanan tidak ditemukan."
            );
        }
    }

    // ==========================================
    // TAMPILKAN RINGKASAN
    // ==========================================

    public void tampilkanRingkasan() {

        view.tampilkanRingkasan(
                daftarPesanan
        );
    }

    // ==========================================
    // TAMPILKAN RIWAYAT STATUS
    // ==========================================

    public void tampilkanRiwayatStatus(
            String idPesanan) {

        PesananJastip pesanan =
                cariPesanan(
                        idPesanan
                );

        if (pesanan != null) {

            pesanan.tampilkanRiwayatStatus();

        } else {

            System.out.println();
            System.out.println(
                    "Pesanan tidak ditemukan."
            );
        }
    }

    // ==========================================
    // GET DAFTAR BATCH
    // ==========================================

    public ArrayList<BatchJastip> getDaftarBatch() {

        return daftarBatch;
    }

    // ==========================================
    // TAMBAH BATCH
    // ==========================================

    public void tambahBatch(
            BatchJastip batch) {

        if (batch != null) {

            daftarBatch.add(
                    batch
            );
        }
    }

    // ==========================================
    // CARI BATCH
    // ==========================================

    public BatchJastip cariBatch(
            String idBatch) {

        for (BatchJastip batch :
                daftarBatch) {

            if (batch.getIdBatch()
                    .equalsIgnoreCase(
                            idBatch
                    )) {

                return batch;
            }
        }

        return null;
    }

    // ==========================================
    // GET DAFTAR PESANAN
    // ==========================================

    public ArrayList<PesananJastip> getDaftarPesanan() {

        return daftarPesanan;
    }
}