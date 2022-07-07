package ch07.home.hr.dao;

import java.util.List;

import ch07.home.hr.domain.Worker;

public class WorkerDaoImpl implements WorkerDao{
	private List<Worker> workers;
	
	public WorkerDaoImpl(List<Worker> workers) {
		this.workers = workers;
	}

	@Override
	public List<Worker> selectWorkers() {
		return this.workers;
	}

	@Override
	public void insertWorker(Worker worker) {
		workers.add(worker);
		worker.setWorkerId(workers.indexOf(worker));
	}

	@Override
	public List<Worker> removeWorker(int workerId) {
		workers.remove(workerId);
		workers.add(workerId, null);
		return this.workers;
	}

	@Override
	public Worker updateWorkerName(int workerId, String workerName) {
		Worker worker = workers.get(workerId);
		worker.setName(workerName);
		return worker;
	}

	@Override
	public Worker updateWorkerJoinDate(int workerId, String joinDate) {
		Worker worker = workers.get(workerId);
		worker.setJoinDate(joinDate);
		return worker;
	}


}
