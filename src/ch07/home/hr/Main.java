package ch07.home.hr;

import java.util.ArrayList;
import java.util.List;

import ch07.home.hr.dao.WorkerDao;
import ch07.home.hr.dao.WorkerDaoImpl;
import ch07.home.hr.domain.Worker;
import ch07.home.hr.presentation.WorkerIo;
import ch07.home.hr.service.WorkerService;
import ch07.home.hr.service.WorkerServiceImpl;

public class Main {
	public static void main(String[] args) {
		List<Worker> workers = new ArrayList<>();
		WorkerDao workerDao = new WorkerDaoImpl(workers);
		WorkerService workerService = new WorkerServiceImpl(workerDao);
		WorkerIo workerIo = new WorkerIo(workerService);
		
		workerIo.play();
		
	}
}