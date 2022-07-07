package ch07.home.hr.service;

import java.util.List;

import ch07.home.hr.dao.WorkerDao;
import ch07.home.hr.domain.Worker;

public class WorkerServiceImpl implements WorkerService{
	private WorkerDao workerDao;
	
	public WorkerServiceImpl(WorkerDao workerDao) {
		this.workerDao = workerDao;
	}

	@Override
	public void addWorker(Worker worker) {
		workerDao.insertWorker(worker);
		
	}
	/*@Override
	public List<Worker> fixWorkerName(Worker worker, String name) {
		List<Worker> workerUpdate = workerDao.selectWorkers();
		worker.setName(name);
		workerUpdate.set(worker.getWorkerId() - 1, worker);
		return workerUpdate;
	}

	@Override
	public List<Worker> fixWorkerJoinDate(Worker worker, LocalDate joinDate) {
		List<Worker> workerUpdate = workerDao.selectWorkers();
		worker.setJoinDate(joinDate);
		workerUpdate.set(worker.getWorkerId() - 1, worker);
		return workerUpdate;
	}*/
	public void fixWorkerName(int workerId, String name) {
		Worker worker = workerDao.updateWorkerName(workerId,name);
		workerDao.selectWorkers().set(workerId, worker);
	}

	@Override
	public void fixWorkerJoinDate(int workerId, String joinDate) {
		Worker worker = workerDao.updateWorkerJoinDate(workerId,joinDate);
		workerDao.selectWorkers().set(workerId, worker);
	}

	@Override
	public List<Worker> removeWorker(int workerId) {
		return workerDao.removeWorker(workerId);
		
	}

	@Override
	public List<Worker> getWorkers() {
		return workerDao.selectWorkers();
	}

}
