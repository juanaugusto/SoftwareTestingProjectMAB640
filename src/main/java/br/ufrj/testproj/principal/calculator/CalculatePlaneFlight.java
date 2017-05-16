package br.ufrj.testproj.principal.calculator;

public class CalculatePlaneFlight {

	public static int readTime(String s) {
		String sep[] = s.split(":");

		int h = Integer.parseInt(sep[0]);
		int m = Integer.parseInt(sep[1]);

		return h * 60 + m;

	}

	public static int[] calculateRightDurationAndFuseDifference(String pA, String cB, String pB, String cA) {

		int times[] = new int[4];
		
		times[0] = readTime(pA);
		times[1] = readTime(cB);
		times[2] = readTime(pB);
		times[3] = readTime(cA);
		
		System.out.println(times[0] + " "+ times[1]+ " "+ times[2]+ " "+ times[3]);

		int d1 = times[1] - times[0];
		int d2 = times[3] - times[2];
		int d = (d1 + d2) / 2;
		int delta = (d1 - d2) / 120;
		int cnt = 0;
		while (d < 0) {
			cnt += 1;
			d += 12 * 60;
		}

		while (delta <= -12) {
			delta += 24;
		}
		while (12 < delta) {
			delta -= 24;
		}

		if (cnt % 2 == 1) {
			if (delta > 0) {
				delta -= 12;
			} else if (delta <= 0) {
				delta += 12;

			}
		}

		
		int result[] = new int[2];
		
		result[0] = d;
		result[1] = delta;

		return result;
	}
	
	
	public static int[] calculateWrongDurationAndFuseDifference(String pa, String cb, String pb, String ca){
		
	    int mpa = readTime(pa);
	    int mcb = readTime(cb);

	    int mpb = readTime(pb);
	    int mca = readTime(ca);
	    
	    int ida = mcb - mpa;
	    int volta = mca - mpb;
	    int fuso = (ida - volta)/2;
	    int dura = ida - fuso;
	    fuso = fuso/60;

		int result[] = new int[2];

	    result[0] = dura;
		result[1] = fuso;

		return result;
	
	}
	
	
	

}
