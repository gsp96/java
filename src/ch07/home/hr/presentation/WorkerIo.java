package ch07.home.hr.presentation;



import ch07.home.hr.domain.Worker;
import ch07.home.hr.service.WorkerService;

public class WorkerIo {
	private WorkerService workerService;
	
	public WorkerIo(WorkerService workerService) {
		this.workerService = workerService;
	}
	
	public void newWorker() {
		boolean isGood= false;
		do {
		int select = Console.inNum("노동자를 추가하려면1번 취소하려면 0번을 입력하세요");
		if(select == 1) {
		String workerName = Console.inStr("노동자의 이름을 입력하세요");
		String joinDate = Console.inStr("입사일을 입력하세요.");
		Worker worker = new Worker(workerName, joinDate);
		workerService.addWorker(worker);
		}
		else if(select == 0)break;
		else {
			System.out.println("1번 혹은 0번을 입력해 주세요.");
		}
		}while(!isGood);
	}
	
	public void fixWorker() {
		boolean isGood = false;
		
		do {
			int select = Console.inNum("1.노동자의 이름을 변경\n2.입사일을 수정\n0.종료");
			if(select == 1) {
				int workerId = Console.inNum("바꾸려는 노동자의 노동자ID를 입력해 주세요");
				String name = Console.inStr("바꾸려는 이름을 입력해 주세요.");
				
				workerService.fixWorkerName(workerId - 1, name);
			}
			else if(select == 2) {
				int workerId = Console.inNum("바꾸려는 노동자의 노동자ID를 입력해 주세요");
				String joinDate = Console.inStr("입사일을 입력해 주세요");
				workerService.fixWorkerJoinDate(workerId - 1, joinDate);
			}
			else if(select == 0) {
				break;
			}
			else {
				System.out.println("1번과 2번 혹은 0번중에 선택해 주세요");
			}
		
		}while(!isGood);
	}
	public void removeWorker() {
		boolean isGood = false;
		do {
			int select = Console.inNum("삭제하려는 노동자의 Id를 입력해 주세요");
			if(select <= 99 || select >= 1) {
				workerService.removeWorker(select - 1);
				isGood = true;
			}
			else {
				select = Console.inNum("2자리 이하의 자연수중에 선택해 주세요");
			}
		}while(!isGood);
	}
	
	
	public void inquireList() {
		if(workerService.getWorkers().isEmpty()) System.out.println("노동자가 없습니다.");
		else {
			System.out.println("노동자Id   노동자명    입사일");
			for(int i = 0; i <= workerService.getWorkers().size(); i++) {
				
				
			}
		}
	}
	public void play() {
		boolean isGood = false;
		do {
			int select = Console.inNum("1.노동자 목록을 조회\n2.노동자를 추가\n3.노동자를 수정\n4.노동자를 삭제\n0.종료");
			switch(select) {
			case 0: isGood = true;break;
			case 1: this.inquireList();break;
			case 2: this.newWorker();break;
			case 3: this.fixWorker();break;
			case 4: this.removeWorker();break;
			default:System.out.println("0,1,2,3,4 번중에 선택해 주십시오.");
			}
			
		}while(!isGood);
	}
}
