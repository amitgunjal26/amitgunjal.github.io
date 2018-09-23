/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mvc.dao;

import com.mvc.beans.Userlogin;
import com.sphbutils.src.BaseDao;
import com.util.src.HibernateUtil;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;

/**
 *
 * @author krawler
 */
public class UserLoginDao extends BaseDao {

    public static List<Userlogin> userList() {
        List<Userlogin> list = null;
        try {
            String HQL = "FROM Userlogin";
            list = executeHQLQuery(HQL);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }
}
