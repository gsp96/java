package ch07.ex08.presentation;

import java.util.List;

import ch07.ex08.domain.Score;
import ch07.ex08.service.GradeService;

public class GradeIo {
	private GradeService gradeService;
	
	public GradeIo(GradeService gradeService) {
		this.gradeService = gradeService;
	}
	
	public void play() {
		for(int i = 0; i < 5; i++) {
			int korScore = Console.inNum("국어 점수를 입력하세요.");
			int engScore = Console.inNum("영어 점수를 입력하세요.");
			int mathScore = Console.inNum("수학 점수를 입력하세요.");
			
			Score score = new Score(korScore,engScore,mathScore);
			gradeService.addScore(score);
		}
		
		List<Score> scores = gradeService.getScores();
		for(Score score2: scores)
			System.out.println(score2);
	}
}