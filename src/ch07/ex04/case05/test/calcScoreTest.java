package ch07.ex04.case05.test;

import ch07.ex04.case05.domain.Score;
import ch07.ex04.case05.service.GradeServiceImpl;

public class calcScoreTest {
	public static void main(String[] args) {
		GradeServiceImpl service = new GradeServiceImpl();
		
		Score[] scores = new Score[5];//fixture
		
		for(int i = 0 ; i < scores.length; i++) {
			scores[i] = new Score((i+1) * 10, (i+1) * 10, (i+1) * 10);
		}
		for(Score score: scores) System.out.println(score);
		
		//service.calcScore(scores);
		System.out.println();
		
		for(Score score: scores) System.out.println(score);
		
	}

}
