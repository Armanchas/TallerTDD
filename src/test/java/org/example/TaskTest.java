package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class TaskTest {

    @Test
    void createTaskTest1(){
        Task task1 = new Task("get groceries", "buy eggs, bread, milk");
        assertEquals("get groceries", task1.getTitle());
        assertEquals("buy eggs, bread, milk", task1.getDescription());
    }

    @Test
    void createTaskTest2(){
        Task task2 = new Task("laundry", "put clothes in the washer");
        assertEquals("laundry", task2.getTitle());
        assertEquals("put clothes in the washer", task2.getDescription());
    }

    @Test
    void createTaskTest3(){
        Task task2 = new Task("make lunch", "boil pasta and make sauce, serve on a plate");
        assertEquals("make lunch", task2.getTitle());
        assertEquals("boil pasta and make sauce, serve on a plate", task2.getDescription());
    }
}