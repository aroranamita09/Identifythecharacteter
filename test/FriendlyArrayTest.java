package com.stackroute;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class FriendlyArrayTest {
    FriendlyArray obj;
    @Before
    public void setUp() throws Exception {
        obj = new FriendlyArray();
    }

    @After
    public void tearDown() throws Exception {
        obj = null;
    }
    @Test
    public void getPivot() {
        assertEquals(4,obj.getPivot(new int [] {5,10,1,4,8,7},2,4));

    }

    @Test
    public void quickSort() {
        assertEquals(72,obj.quickSort(new int [] {5,10,1,4,8,7},2,4));
    }
}
