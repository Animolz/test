/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.lhn.services;

import com.lhn.pojo.Category;
import com.lhn.utils.JdbcUtil;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Admin
 */
public class CategoryService {
    private int id;
    private String name;
    
    public List<Category> getCategories() throws SQLException{
        try(Connection conn = JdbcUtil.getConnection()){
            Statement stm = conn.createStatement();
            ResultSet rs = stm.executeQuery("SELECT * FROM category");
            
            List<Category> cates = new ArrayList<>();
            while(rs.next()){
                this.id = rs.getInt("id");
                this.name = rs.getString("name");
                
                cates.add(new Category(this.id, this.name));
            }
            return cates;
        }
    }
}
