package com.rizki.mufrizal.belajar.thymeleaf.dao;

import com.rizki.mufrizal.belajar.thymeleaf.model.Barang;
import java.util.List;

/**
 *
 * @Author Rizki Mufrizal <mufrizalrizki@gmail.com>
 * @Since Jan 31, 2016
 * @Time 12:42:52 PM
 * @Encoding UTF-8
 * @Project Belajar-Thymeleaf
 * @Package com.rizki.mufrizal.belajar.thymeleaf.dao
 *
 */
public interface BarangDao {

    public void save(Barang barang);

    public void update(Barang barang);

    public void delete(Barang barang);

    public Barang getBarang(String idBarang);

    public List<Barang> getBarangs();
}
