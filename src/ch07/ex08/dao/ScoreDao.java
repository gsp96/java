package ch07.ex08.dao;

import java.util.List;

import ch07.ex08.domain.Score;

public interface ScoreDao {
	void insertScore(Score score);
	List<Score> selectScores();

}
