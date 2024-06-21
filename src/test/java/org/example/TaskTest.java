package org.example;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class TaskTest {

    static List<Task> tasks = new ArrayList<>();

    @BeforeAll
    static void init(){
        tasks.add(new Task("get groceries", "buy eggs, bread, milk"));
        tasks.add(new Task("laundry", "put clothes in the washer"));
        tasks.add(new Task("make lunch", "boil pasta and make sauce, serve on a plate"));
    }


    @Test
    void createTaskTest1(){
        assertEquals("get groceries", tasks.get(0).getTitle());
        assertEquals("buy eggs, bread, milk", tasks.get(0).getDescription());
    }

    @Test
    void createTaskTest2(){
        assertEquals("laundry", tasks.get(1).getTitle());
        assertEquals("put clothes in the washer", tasks.get(1).getDescription());
    }

    @Test
    void createTaskTest3(){
        assertEquals("make lunch", tasks.get(2).getTitle());
        assertEquals("boil pasta and make sauce, serve on a plate", tasks.get(2).getDescription());
    }

    //------------------------------------------------------------------------------------------------

}