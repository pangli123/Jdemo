package com.atguigu.test;

import javax.sql.ConnectionPoolDataSource;
import java.math.BigDecimal;
import java.util.*;

public class ConnectsTest {
    public static void main(String[] args) {
        BigDecimal nm=new BigDecimal(23.98);
        BigDecimal nm2=new BigDecimal(23.1);
        System.out.println(nm.add(nm2));
        Set set=new HashSet();
        Map<String,String> map=new HashMap<String,String>();
        map.put("k1","m1");
        map.put("k2","m2");
        map.put("k3","m3");
        map.put("k4","m4");
        Set<Map.Entry<String,String>> sets = map.entrySet();
        for (Map.Entry<String,String> entry:sets
             ) {
            System.out.println(entry.getKey()+"  "+entry.getValue());
        }
    }
}
