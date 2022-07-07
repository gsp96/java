package ch07.ex04.case05;

import ch07.ex04.case05.dao.ScoreDao;
import ch07.ex04.case05.dao.ScoreDaoImpl;
import ch07.ex04.case05.domain.Score;
import ch07.ex04.case05.presentation.GradeIo;
import ch07.ex04.case05.service.GradeService;
import ch07.ex04.case05.service.GradeServiceImpl;

public class Main {
	public static void main(String[] args) {
		Score[] scores = new Score[5];
		/*
		for(int i = 0 ; i < scores.length; i++) {
			scores[i] = new Score((i+1) * 10, (i+1) * 10, (i+1) * 10);
		}*/
		
		ScoreDao scoreDao = new ScoreDaoImpl(scores);
		GradeService gradeService = new GradeServiceImpl(scoreDao);
		GradeIo gradeIo = new GradeIo(gradeService);
		
		gradeIo.play();
		
	}
}