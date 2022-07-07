package ch07.home.hr2.dao;

import ch07.home.hr2.domain.Worker;

public class WorkerDaoImpl implements WorkerDao{
	private Worker[] workers;
	
	public WorkerDaoImpl(Worker[] workers) {
		this.workers = workers;
	}

	@Override
	public Worker[] selectWorkers() {
		return this.workers;
	}

	@Override
	public void insertWorker(Worker worker) {
		workers[worker.getWorkerId()] = worker;
	}

	@Override
	public Worker[] removeWorker(int workerId) {
		workers[workerId]=null;
		return this.workers;
	}

	@Override
	public Worker updateWorkerName(int workerId, String workerName) {
		Worker worker = workers[workerId];
		worker.setName(workerName);
		return worker;
	}

	@Override
	public Worker updateWorkerJoinDate(int workerId, String joinDate) {
		Worker worker = workers[workerId];
		worker.setJoinDate(joinDate);
		return worker;
	}


}
