package org.example;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class TaskTest {

    private Task task;
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

    @Test
    void editTitleTaskTest1(){
        Task task = tasks.get(0);
        String title = "exercise";
        task.setTitle(title);
        assertEquals(title,task.getTitle());
    }

    @Test
    void editTitleTaskTest2(){
        Task task = tasks.get(1);
        String title = "study";
        task.setTitle(title);
        assertEquals(title,task.getTitle());
    }

    @Test
    void editDescTaskTest1(){
        Task task = tasks.get(0);
        String desc = "make a lot of exercise";
        task.setdescription(desc);
        assertEquals(desc,task.getDescription());
    }

    @Test
    void editDescTaskTest2(){
        Task task = tasks.get(1);
        String desc = "read a book";
        task.setdescription(desc);
        assertEquals(desc,task.getDescription());
    }

    @Test
    void deleteTaskTest1(){
        Task task = tasks.get(2);
        tasks.remove(task);
        assertFalse(tasks.contains(task));
    }
    @Test
    void deleteTaskTest2(){
        Task task = tasks.get(2);
        tasks.remove(task);
        assertEquals(2,tasks.size());
    }

    @Test
    void deleteTaskTest3(){
        System.out.println("Lista de tareas"+tasks);
        Task task = tasks.get(2);
        tasks.remove(task);
        assertEquals(2,tasks.size());
        System.out.println("Lista de tareas"+tasks);
    }

    @Test
    void completedTaskTest1(){
        Task task = tasks.get(0);
        task.setCompleted(true);
        assertTrue(task.getCompleted(),"tarea completada");
    }

    @Test
    void completedTaskTest2(){
        Task task = tasks.get(0);
        assertEquals(false,task.getCompleted());
    }


}