public class myOperator{
	public static void main (String args[]){
		int age = 24;
		boolean isEligible;

		if ((age >=21) && (age <=100))
		{
			isEligible = true;
		}
		else
		{
			isEligible = false;
		}

		String eligibilityToVote;

		eligibilityToVote = (isEligible)?"Yes Candidate is Eligible":"Sorry Candidate not Eligible";
		System.out.println("Candidate Eligibility: " +eligibilityToVote);

		int score = 78;
		String placement;

		placement = (score>75)?"Eligible for placement":"Sorry not eligible";
		System.out.println("Placement Eligibility: " +placement);

	}
}