package com.jdbc;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

import java.util.List;

/**
 * @Author JX
 * @ClassName: com.jdbc.JDBCTemplateTest
 * @Create 2023-09-07 20:51
 * @Description: TODO
 */
@SpringJUnitConfig(locations = "classpath:beans.xml")
public class JDBCTemplateTest {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    // 增删改
    @Test
    public void testUpdate() {
//        String sql = "INSERT INTO t_emp VALUES(NULL,?,?,?)";
//        int rows = jdbcTemplate.update(sql, "赵五", 60, "女");
//        System.out.println(rows);

//        String sql = "update t_emp set name=? where id=?";
//        int rows = jdbcTemplate.update(sql, "赵五_改", 3);
//        System.out.println(rows);

        String sql = "delete from t_emp where id = ?";
        int rows = jdbcTemplate.update(sql, 3);
        System.out.println(rows);
    }


    @Test
    public void testQueryForObject() {
//        // 写法一JDK8
//        String sql = "select * from t_emp where id=?";
//        Emp empResult = jdbcTemplate.queryForObject(sql,
//                (rs, rowNum) -> {
//                    Emp emp = new Emp();
//                    emp.setId(rs.getInt("id"));
//                    emp.setName(rs.getString("name"));
//                    emp.setAge(rs.getInt("age"));
//                    emp.setSex(rs.getString("sex"));
//                    return emp;
//                }, 1);
//        System.out.println(empResult);

        //写法二
        String sql = "select * from t_emp where id=?";
        Emp emp = jdbcTemplate.queryForObject(sql,
                new BeanPropertyRowMapper<>(Emp.class), 1);
        System.out.println(emp); // Emp{id=1, name='赵五', age=60, sex='女'} , 适用于单个返回
    }

    @Test
    public void testQueryList() {
        String sql = "select * from t_emp";
        List<Emp> list = jdbcTemplate.query(sql, new BeanPropertyRowMapper<>(Emp.class));
        System.out.println(list);
    }

    @Test
    //查询单行单列的值
    public void selectCount() {
        String sql = "select count(*) from t_emp";
        Integer count = jdbcTemplate.queryForObject(sql, Integer.class);
        System.out.println(count);
    }
}
