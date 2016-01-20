package com.malex.servise;


import com.malex.configuration.AppConfig;
import com.malex.configuration.JPAConfig;
import com.malex.model.WorkerUtil;
import com.malex.model.entity_test.Worker;
import com.malex.service.WorkerService;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.annotation.DirtiesContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import java.util.List;

import static org.junit.Assert.*;

@DirtiesContext
@WebAppConfiguration
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {JPAConfig.class, AppConfig.class})
public class WorkerServiceTest {

    @Autowired
    private WorkerService service;

    @Before
    public void init() {
        this.service.deleteAll();

    }

    @Test
    public void testSaveWorker() {

        Worker workerExpected = WorkerUtil.createWorker();
        this.service.addWorker(workerExpected);

        Worker workerActual = this.service.getWorker((long) 1);

        assertEquals(workerExpected, workerActual);
    }


    @Test
    public void testSaveWorkerWithBank() {
        Worker workerExpected = WorkerUtil.createWorkerWithBank();
        this.service.addWorker(workerExpected);

        Worker workerActual = this.service.getWorker((long) 1);

        assertEquals(workerExpected, workerActual);

        System.err.println(workerActual);
    }

    @Test
    public void testSaveWorkers() {
        List<Worker> listExpected = WorkerUtil.createWorkers();
        this.service.addWorkers(listExpected);

        List<Worker> listActual= this.service.getAllWorkers();

        assertEquals(listExpected, listActual);
        System.err.println(listActual);
    }

    @Test
    public void testDeleteWorker() {
        Worker worker = WorkerUtil.createWorker();
        this.service.addWorker(worker);
        this.service.deleteWorker(worker);
        assertTrue(this.service.getAllWorkers().isEmpty());

        List<Worker> listExpected = WorkerUtil.createWorkers();
        this.service.addWorkers(listExpected);
        this.service.deleteWorker(listExpected.get(0));
        assertFalse(this.service.getAllWorkers().isEmpty());
    }


}
