package com.rizki.mufrizal.belajar.thymeleaf.dao;

import com.rizki.mufrizal.belajar.thymeleaf.model.Barang;
import java.util.List;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 *
 * @Author Rizki Mufrizal <mufrizalrizki@gmail.com>
 * @Since Jan 31, 2016
 * @Time 12:44:01 PM
 * @Encoding UTF-8
 * @Project Belajar-Thymeleaf
 * @Package com.rizki.mufrizal.belajar.thymeleaf.dao
 *
 */
@Repository
public class BarangDaoImpl implements BarangDao {

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public void save(Barang barang) {
        sessionFactory.getCurrentSession().save(barang);
    }

    @Override
    public void update(Barang barang) {
        sessionFactory.getCurrentSession().update(barang);
    }

    @Override
    public void delete(Barang barang) {
        sessionFactory.getCurrentSession().delete(barang);
    }

    @Override
    public Barang getBarang(String idBarang) {
        return sessionFactory.getCurrentSession().get(Barang.class, idBarang);
    }

    @Override
    public List<Barang> getBarangs() {
        return sessionFactory.getCurrentSession().createCriteria(Barang.class).list();
    }

}
