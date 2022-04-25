
public class orange {

		String name, address;
		int datacommMarks, dbmsMarks, casetoolsMarks;
		orange(int datacommMarks, int dbmsMarks, int casetoolsMarks)
		  {
		          this.datacommMarks = datacommMarks;
		          this.dbmsMarks = dbmsMarks;
		          this.casetoolsMarks = casetoolsMarks;
		  }
		     void displayGrade()
		  {
		     double avg;
		     char grade;
		    //compute average
		   avg = (datacommMarks + dbmsMarks + casetoolsMarks)/3;
		   //compute grade
		      if (avg>=80)
		              grade = 'A';
		      else if (avg>=70 && avg<80)
		              grade = 'B';
		      else if (avg>=60 && avg<70)
		              grade = 'C';
		      else
		              grade = 'D';
		       System.out.println(" Grade is " + grade);
		       
		   }
		      public static void main(String[] args) {
		      // TODO Auto-generated method stub
		   }
		      
		
	}


