package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class TaskTest {

    @Test
    void createTaskTest1(){
        Task task1 = new Task("get groceries", "buy eggs, bread, milk");
    }

}