package ch07.ex04.case05.service;

import ch07.ex04.case05.domain.Score;

public interface GradeService {
	void addScore(Score socre);
	Score[] getScores();
	
}
