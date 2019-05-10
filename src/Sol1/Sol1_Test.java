package Sol1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Sol1_Test {
    Sol1 s = new Sol1();

    @Test
    void cal() {
        Integer [] current={1, 3, 5, 6, 8, 9};
        Integer [] target={1, 2, 5, 7, 9};
        s.change(current,target);
        Assertions.assertEquals(s.adddisplay(),2);
        Assertions.assertEquals(s.deldisplay(),3);
    }

    @Test
    void cal1() {
        Integer [] current={0,0,0,0,0};
        Integer [] target={0,0,0,0};
        s.change(current,target);
        Assertions.assertEquals(s.adddisplay(),0);
        Assertions.assertEquals(s.deldisplay(),0);
    }

    @Test
    void cal2() {
        Integer [] current= new Integer[4];
        Integer [] target= new Integer[3];
        s.change(current,target);
        Assertions.assertEquals(s.adddisplay(),0);
        Assertions.assertEquals(s.deldisplay(),0);
    }

    @Test
    void cal3() {
        Integer [] current= {1,2,2};
        Integer [] target= {3};
        s.change(current,target);
        Assertions.assertEquals(s.adddisplay(),1);
        Assertions.assertEquals(s.deldisplay(),3);
    }

    @Test
    void cal4() {
        Integer [] current= {1,2,2};
        Integer [] target= {2,3};
        s.change(current,target);
        Assertions.assertEquals(s.adddisplay(),1);
        Assertions.assertEquals(s.deldisplay(),1);
    }





}
