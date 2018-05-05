package org.almansa.easybl.easybl_core;

import static org.junit.Assert.fail;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import org.junit.Test;

public class FreeTest {
    @Test
    public void test() {
        String sql = "select name as a, age as b from test";
        
        String[] splitedByWhiteSpace = sql.split("\\s+");
        Stream<String> splitedStream = Arrays.stream(splitedByWhiteSpace);
        
        if(splitedByWhiteSpace.length < 0) {
            fail();
        }
        
        String select = splitedByWhiteSpace[0];
        
        List<String> fields = new ArrayList<String>();
        for(String item : splitedByWhiteSpace) {
            //if(item)
        }
        
        splitedStream.forEach((s)->{
            print(s);
        });
    }
    
    public void test2() {
        
    }
    
    private void print(String str) {
        System.out.println(str);
    }
}
