/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mvc.dao;

import com.mvc.beans.Userlogin;
import com.sphbutils.src.BaseDao;
import java.util.List;

/**
 *
 * @author Amit Gunjal
 */
public class UserLoginDao extends BaseDao {

    @SuppressWarnings("unchecked")
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
