package com.malex.model;

import com.malex.model.entity_test.Worker;
import com.malex.model.entity_test.WorkerStatus;

import java.util.ArrayList;
import java.util.List;

public class WorkerUtil {

    public static Worker createWorker() {
        Worker worker = new Worker();
        worker.setId((long)1);
        worker.setFirst_name("AnnaFirst");
        worker.setLast_name("AnnaLast");
        worker.setPhoneNumber("001");
        worker.setStatus(WorkerStatus.MANAGER);
        return worker;
    }

    public static Worker createWorkerWithBank() {
        Worker worker = new Worker();
        worker.setId((long)1);
        worker.setFirst_name("AnnaFirst");
        worker.setLast_name("AnnaLast");
        worker.setPhoneNumber("001");
        worker.setStatus(WorkerStatus.MANAGER);
        worker.setBank(BankUtil.createBank());
        return worker;
    }

    public static List<Worker> createWorkers() {
        List<Worker> workers = new ArrayList<>();
        Worker worker_01 = new Worker();
        worker_01.setId((long)1);
        worker_01.setFirst_name("MaxFirst");
        worker_01.setLast_name("MaxLast");
        worker_01.setPhoneNumber("002");
        worker_01.setStatus(WorkerStatus.CLIENT);

        Worker worker_02 = new Worker();
        worker_02.setId((long)2);
        worker_02.setFirst_name("AlexFirst");
        worker_02.setLast_name("AlexLast");
        worker_02.setPhoneNumber("003");
        worker_02.setStatus(WorkerStatus.CLIENT);

        Worker worker_03 = new Worker();
        worker_03.setId((long)3);
        worker_03.setFirst_name("BobFirst");
        worker_03.setLast_name("BobLast");
        worker_03.setPhoneNumber("123456789");
        worker_03.setStatus(WorkerStatus.MANAGER);

        workers.add(worker_01);
        workers.add(worker_02);
        workers.add(worker_03);
        return workers;
    }

}
