package ch07.home.hr2.dao;

import ch07.home.hr2.domain.Worker;

public interface WorkerDao {
	Worker[] selectWorkers();
	void insertWorker(Worker worker);
	Worker[] removeWorker(int workerId);
	Worker updateWorkerName(int workerId, String workerName);
	Worker updateWorkerJoinDate(int workerId, String joinDate);
}