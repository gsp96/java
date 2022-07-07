package ch07.ex08;

import java.util.ArrayList;
import java.util.List;

import ch07.ex08.dao.ScoreDao;
import ch07.ex08.dao.ScoreDaoImpl;
import ch07.ex08.domain.Score;
import ch07.ex08.presentation.GradeIo;
import ch07.ex08.service.GradeService;
import ch07.ex08.service.GradeServiceImpl;

public class Main {
	public static void main(String[] args) {
		List<Score> scores = new ArrayList<>();
		ScoreDao scoreDao = new ScoreDaoImpl(scores);
		GradeService gradeService = new GradeServiceImpl(scoreDao);
		GradeIo gradeIo = new GradeIo(gradeService);
		
		gradeIo.play();
		
	}
}