/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sphbutils.src;

import com.util.src.HibernateUtil;
import java.util.List;
import org.hibernate.Session;

/**
 *
 * @author krawler
 */
public class BaseDao {

    static Session session;

    public BaseDao() {
    }

    static {
        session = HibernateUtil.getSessionFactory().openSession();
    }

    public static List executeHQLQuery(String hql) throws Exception {
        return session.createQuery(hql).list();
    }
}
