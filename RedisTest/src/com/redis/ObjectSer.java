package com.redis;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
/**
 * Title: Objecter.java
 * Description:序列化 与反序列化
 * Company: htfg
 * @author 胡小东
 * @date 2017年10月18日 下午1:36:10
 */
public class ObjectSer {
	  /** 
     * 对象序列化 
     * @param obj 
     * @return 
     */  
    public static byte[] ObjectToByte(Object obj) {  
        byte[] bytes = null;  
        try {  
            ByteArrayOutputStream bo = new ByteArrayOutputStream();  
            ObjectOutputStream oo = new ObjectOutputStream(bo);  
            oo.writeObject(obj);  
            bytes = bo.toByteArray();  
            bo.close();  
            oo.close();    
        }  
        catch(Exception e) {   
            e.printStackTrace();  
        }  
        return bytes;  
    }  
      
    /** 
     * 反序列化 
     * @param bytes 
     * @return 
     */  
    public static Object ByteToObject(byte[] bytes) {  
        Object object = null;  
        try {  
            ByteArrayInputStream bais = new ByteArrayInputStream(bytes);  
            ObjectInputStream ois = new ObjectInputStream(bais);  
            object = ois.readObject();  
        } catch (Exception e) {  
            e.printStackTrace();  
        }  
        return object;  
    }  
}  