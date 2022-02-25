package com.yichen.useall.utils;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;

/**
 * @author Qiuxinchao
 * @version 1.0
 * @date 2022/2/25 14:41
 * @describe json 转换相关工具  => 最终处理格式  {"name":"yichen","age":”18“}
 *   问题： json 区分数字和字符串吗   => 简单测试没区别
 *      =>  场景1  {name=yichen}
 *      =>  场景2  (name=yichen)  => toString 场景
 *      =>  场景3  {\"name\":\"{}\"}   =>
 */
public class JsonUtils {





    public static void main(String[] args) {
//        String s = "{\"age\":1}";
        String s = "{\"age\":\"1\"}";
        JSONObject jsonObject = JSONObject.parseObject(s);
        System.out.println(jsonObject.get("age"));
    }

}
