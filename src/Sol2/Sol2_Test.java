package Sol2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

public class Sol2_Test {
    Map<Integer, Integer> mp = new HashMap<>();
    Sol2 s = new Sol2();
    post p1 = new post(1,null,120);
    post p2 = new post(2,p1,60);
    post p3 = new post(3,p1,30);
    post p4 = new post(4,p2,90);
    post p5 = new post(5,p3,40);
    post p6 = new post(6,p4,10);
    post p7 = new post(7,null,240);
    post p8 = new post(8,p7,190);
    post p9 = new post(9,p7,50);
    post[] posts ={p1,p2,p3,p4,p5,p6,p6,p7,p8,p9};

    @Test
    void cal() {
        mp = s.calculate(posts);
        Assertions.assertEquals(mp.size(),2);
        Assertions.assertEquals(mp.get(1),360);
        Assertions.assertEquals(mp.get(7),480);
    }

    @Test
    void cal2() {
        p7.repostId=p1;
        mp = s.calculate(posts);
        Assertions.assertEquals(mp.size(),1);
        Assertions.assertEquals(mp.get(1),840);

    }








}
