package com.atguigu;

import redis.clients.jedis.Jedis;

import java.util.HashMap;
import java.util.Map;

public class JedisDemo {
    public static void main(String[] args) {
        Jedis jedis=new Jedis("localhost",6379);
        String val=jedis.ping();
       Map<String,String> user=new HashMap<String,String>();
        user.put("id",1+"");
        user.put("age",11+"");
        user.put("name",1+"展示");
        jedis.hmset("user",user);
    }
}
