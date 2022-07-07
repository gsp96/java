package ch07.home.hr.service;

import java.util.List;

import ch07.home.hr.domain.Worker;

public interface WorkerService {
	void addWorker(Worker worker);
	List<Worker> getWorkers();
	//List<Worker> fixWorkerName(Worker worker,String name);
	void fixWorkerName(int workerId,String name);
	//List<Worker> fixWorkerJoinDate(Worker worker,LocalDate joinDate);
	void fixWorkerJoinDate(int workerId,String joinDate);
	List<Worker> removeWorker(int workerId);

}
