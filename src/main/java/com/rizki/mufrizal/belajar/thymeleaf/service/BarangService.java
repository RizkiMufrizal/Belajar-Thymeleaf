package com.rizki.mufrizal.belajar.thymeleaf.service;

import com.rizki.mufrizal.belajar.thymeleaf.model.Barang;
import java.util.List;

/**
 *
 * @Author Rizki Mufrizal <mufrizalrizki@gmail.com>
 * @Since Jan 31, 2016
 * @Time 12:47:32 PM
 * @Encoding UTF-8
 * @Project Belajar-Thymeleaf
 * @Package com.rizki.mufrizal.belajar.thymeleaf.service
 *
 */
public interface BarangService {

    public void save(Barang barang);

    public void update(Barang barang);

    public void delete(Barang barang);

    public Barang getBarang(String idBarang);

    public List<Barang> getBarangs();
}
