package ch07.home.hr2;

import ch07.home.hr2.dao.WorkerDao;
import ch07.home.hr2.dao.WorkerDaoImpl;
import ch07.home.hr2.domain.Worker;
import ch07.home.hr2.presentation.WorkerIo;
import ch07.home.hr2.service.WorkerService;
import ch07.home.hr2.service.WorkerServiceImpl;

public class Main {
	public static void main(String[] args) {
		Worker[] workers = new Worker[100];
		WorkerDao workerDao = new WorkerDaoImpl(workers);
		WorkerService workerService = new WorkerServiceImpl(workerDao);
		WorkerIo workerIo = new WorkerIo(workerService);
		
		workerIo.play();
		
	}
}