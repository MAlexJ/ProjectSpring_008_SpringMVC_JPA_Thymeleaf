package com.malex.service;

import com.malex.model.entity_test.Worker;

import java.util.List;

public interface WorkerService {
    void addWorker(Worker worker);

    void updateWorker(Worker worker);

    void deleteWorker(Worker worker);

    Worker getWorker(Long id);

    void addWorkers(List<Worker> workers);

    List<Worker> getAllWorkers();

    void deleteAll();
}
