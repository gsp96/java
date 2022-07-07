package ch07.ex08.service;

import java.util.List;

import ch07.ex08.domain.Score;

public interface GradeService {
	void addScore(Score socre);
	List<Score> getScores();
	
}
