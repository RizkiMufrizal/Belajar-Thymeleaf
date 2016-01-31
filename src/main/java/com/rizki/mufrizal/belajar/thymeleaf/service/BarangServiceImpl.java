package com.rizki.mufrizal.belajar.thymeleaf.service;

import com.rizki.mufrizal.belajar.thymeleaf.dao.BarangDao;
import com.rizki.mufrizal.belajar.thymeleaf.model.Barang;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @Author Rizki Mufrizal <mufrizalrizki@gmail.com>
 * @Since Jan 31, 2016
 * @Time 12:48:09 PM
 * @Encoding UTF-8
 * @Project Belajar-Thymeleaf
 * @Package com.rizki.mufrizal.belajar.thymeleaf.service
 *
 */
@Service
@Transactional(readOnly = true)
public class BarangServiceImpl implements BarangService {

    @Autowired
    private BarangDao barangDao;

    @Transactional
    @Override
    public void save(Barang barang) {
        barangDao.save(barang);
    }

    @Transactional
    @Override
    public void update(Barang barang) {
        barangDao.update(barang);
    }

    @Transactional
    @Override
    public void delete(Barang barang) {
        barangDao.delete(barang);
    }

    @Override
    public Barang getBarang(String idBarang) {
        return barangDao.getBarang(idBarang);
    }

    @Override
    public List<Barang> getBarangs() {
        return barangDao.getBarangs();
    }

}
