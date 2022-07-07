package ch07.home.hr.dao;

import java.util.List;

import ch07.home.hr.domain.Worker;

public interface WorkerDao {
	List<Worker> selectWorkers();
	void insertWorker(Worker worker);
	List<Worker> removeWorker(int workerId);
	Worker updateWorkerName(int workerId, String workerName);
	Worker updateWorkerJoinDate(int workerId, String joinDate);
}