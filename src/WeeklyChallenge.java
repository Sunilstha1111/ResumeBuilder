import java.util.Scanner;

public class WeeklyChallenge {
      public static void main (String[] args){
    	  Scanner sc = new Scanner(System.in); 	 
    	 
    	 
    	  String[] Edu_Achievements;
    	  Edu_Achievements = new String[10];
    	  
    	  String[] Experience;
    	  Experience = new String[10];
    	 
    	  String[] Skill_Ratings;
    	  Skill_Ratings = new String[20];
    	  
    	  int i = 1;
    	  int i1 = 0;
    	  int i2 = 1;
    	  
    	  System.out.println("Enter you name:");
    	  String name = sc.nextLine();
    	  
    	  
    	  System.out.println("\nEnter your email:");
    	  String email = sc.nextLine();
    	  
    	  
    	  
    	  
    	  System.out.println("How many education acheivements do you have? You can input at max 10.");
    	  int num = sc.nextInt();
    	  sc.nextLine();
    	  
    	 
    	   while (i < (num+1)){
    		  String degree = sc.nextLine();
    		  String University = sc.nextLine();
    		  int GraduationYear = sc.nextInt();
    		  sc.nextLine();
    		  Edu_Achievements[i] = degree +","+"\n"+University+", "+GraduationYear; 
    		  i++;
    	   }
    	 
    	   System.out.println("How many work experience do you have? You can input at max 10.");
    	   int num1 = sc.nextInt();
    	   sc.nextLine();
    	 
    		 
    	   while(i1 < num1)
    		 {
    			 if (num1 > 0)
        		 {
        			 String JobName = sc.nextLine();
            		 String Company = sc.nextLine();
            	     String date = sc.nextLine(); 
            		 String Job1 = sc.nextLine();
            		 String Job2 = sc.nextLine();
            		 Experience[i1] = JobName +", "+"\n"+Company+", " +date+"\n-Duty 1, "+Job1+ "\n-Duty 2, "+Job2;
            		 i1++;
        		 }
        		  
    		 }
    		 
    	 
    	 
    	 System.out.println("How many skills do you have? You can input at max 20.");
    	 int num2 = sc.nextInt();
    	 sc.nextLine();
    	 
    	 while (i2 < (num2+1))
    	 {
    		 String skills = sc.nextLine();
    		 String ratings = sc.nextLine();
    		 
    		 Skill_Ratings[i2] = skills + ", "+ ratings;
    		 i2++;
    	 }
    	 
    	 //Output
    	 System.out.println("Resume");
    	 System.out.println("=======================================================================================================");
    	 System.out.println(name);
    	 System.out.println(email);
    	 
    	 
    	 System.out.println("\nEducation");
    	 System.out.println("-----------------------------------------------------------------------------------------------------");
    	 for (i = 1; i <(num+1); i++)
    	 {
			  System.out.println(Edu_Achievements[i]);
    	 }
	     
    	 
    	 System.out.println("\nExperience");
    	 System.out.println("-----------------------------------------------------------------------------------------------------");
    	 
    	 if (num1 == 0)
		 {
			 Experience[i1] = "No work experience";
			 System.out.println(Experience[i1]);
					 
		 }
    	 for (i1 = 0; i1 < num1; i1++)
	     {
	    	System.out.println(Experience[i1]);
	      }
    	 
    	 System.out.println("\nSkills");  
    	 System.out.println("------------------------------------------------------------------------------------------------------");
    	 for (i2 = 1; i2 < (num2+1); i2++)
    	 {
    		 System.out.println(Skill_Ratings[i2]);
    	 }
   }
    	  
    	   
    	  
      }


