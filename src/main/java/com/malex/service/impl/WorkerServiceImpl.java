package com.malex.service.impl;

import com.malex.model.entity_test.Worker;
import com.malex.repository.WorkerRepository;
import com.malex.service.WorkerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WorkerServiceImpl implements WorkerService {

    @Autowired
    private WorkerRepository repository;

    @Override
    public void addWorker(Worker worker) {
        repository.saveAndFlush(worker);
    }

    @Override
    public void addWorkers(List<Worker> workers) {
        repository.save(workers);
        repository.flush();
    }

    @Override
    public void updateWorker(Worker worker) {
        repository.saveAndFlush(worker);
    }

    @Override
    public void deleteWorker(Worker worker) {
        repository.delete(worker);
    }

    @Override
    public Worker getWorker(Long id) {
        return repository.findOne(id);
    }

    @Override
    public List<Worker> getAllWorkers() {
        return repository.findAll();
    }

    @Override
    public void deleteAll() {
        repository.deleteAllInBatch();
    }
}
