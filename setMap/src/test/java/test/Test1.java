package test;

import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.org.TestMap;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:spring.xml"})
public class Test1 {
    
    @Autowired
    
    private TestMap test;
    @Test
    public void test(){
        
        Map<String,String> map=test.getMap();
        
        Iterator<Map.Entry<String, String>> it=map.entrySet().iterator();
        
        
        while(it.hasNext()){
            
            Entry<String, String> en=it.next();
            
            System.out.println("key:"+en.getKey()+" value:"+en.getValue());
            
            
        }
        
    }
    
}
