package ch07.home.hr2.service;

import ch07.home.hr2.domain.Worker;

public interface WorkerService {
	void addWorker(Worker worker);
	Worker[] getWorkers();
	//List<Worker> fixWorkerName(Worker worker,String name);
	void fixWorkerName(int workerId,String name);
	//List<Worker> fixWorkerJoinDate(Worker worker,LocalDate joinDate);
	void fixWorkerJoinDate(int workerId,String joinDate);
	Worker[] removeWorker(int workerId);

}
