package com.rizki.mufrizal.belajar.thymeleaf.model;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import org.hibernate.annotations.GenericGenerator;

/**
 *
 * @Author Rizki Mufrizal <mufrizalrizki@gmail.com>
 * @Since Jan 31, 2016
 * @Time 12:40:12 PM
 * @Encoding UTF-8
 * @Project Belajar-Thymeleaf
 * @Package com.rizki.mufrizal.belajar.thymeleaf.model
 * 
 */

@Entity
@Table(name = "tb_barang")
public class Barang implements Serializable{

    @Id
    @GeneratedValue(generator = "uuid2")
    @GenericGenerator(name = "uuid2", strategy = "uuid")
    private String idBarang;
    
    private String namaBarang;
    
    @Enumerated(EnumType.STRING)
    private JenisBarang jenisBarang;
    
    private String tanggalKadaluarsa;

    /**
     * @return the idBarang
     */
    public String getIdBarang() {
        return idBarang;
    }

    /**
     * @param idBarang the idBarang to set
     */
    public void setIdBarang(String idBarang) {
        this.idBarang = idBarang;
    }

    /**
     * @return the namaBarang
     */
    public String getNamaBarang() {
        return namaBarang;
    }

    /**
     * @param namaBarang the namaBarang to set
     */
    public void setNamaBarang(String namaBarang) {
        this.namaBarang = namaBarang;
    }

    /**
     * @return the jenisBarang
     */
    public JenisBarang getJenisBarang() {
        return jenisBarang;
    }

    /**
     * @param jenisBarang the jenisBarang to set
     */
    public void setJenisBarang(JenisBarang jenisBarang) {
        this.jenisBarang = jenisBarang;
    }

    /**
     * @return the tanggalKadaluarsa
     */
    public String getTanggalKadaluarsa() {
        return tanggalKadaluarsa;
    }

    /**
     * @param tanggalKadaluarsa the tanggalKadaluarsa to set
     */
    public void setTanggalKadaluarsa(String tanggalKadaluarsa) {
        this.tanggalKadaluarsa = tanggalKadaluarsa;
    }
    
}
