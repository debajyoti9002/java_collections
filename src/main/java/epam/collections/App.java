package epam.collections;
import java.util.*;
public class App 
{
    public static void main( String[] args )
    {
        Scanner sc=new Scanner(System.in);
    	List<String> list= new ArrayList<String>();	
        list.add("John");
        list.add("Jack");
        list.add("Joe");
        list.add("Jenny");
        list.add("Baren");
        list.add("Alex");
        list.add("Paul");
        list.add("White");
        list.add("Mike");
        list.add("Johnson");
        boolean flag=true;
        while(flag) {
        System.out.println("Press \n1. for adding names \n"
        		                  + "2. for deleting a name\n"
        						   +"3. for printing contents of the list\n"
        		                  + "4. to fetch a name");
        System.out.println("Enter your choice : ");
        int ch= sc.nextInt();
        
        switch(ch) {
        case 1:
        	System.out.println("Enter the name to be added");
        	String s1=sc.next();
        	list.add(s1);
        	System.out.println("The list after adding is \n");
        	for(String s2 : list)
        		System.out.println(s2);
        	break;
        case 2:
        	System.out.println("Enter the name to be deleted");
        	String name= sc.next();
        	for(int j=0;j<list.size();j++) {
        		  if(list.get(j).equals(name)) {
        			list.remove(j);
        			System.out.println("Name removed!!");
        			System.out.println("The list after deleting is ");
                	for(String s2 : list)
                		System.out.println(s2);
        			break;
        		}
            }
        	
        case 3:
        	for(String s : list)
        		System.out.println(s);
        	
        	break;
        case 4:
        	System.out.println("Enter the name to be found");
        	String nm= sc.next();
        	for(int i=0;i<list.size();i++) {        		
        		String str=list.get(i);
        		if(str.equals(nm)) {
        			System.out.println("The Name "+ nm + " has been found in the list.");
        			break;
        		}
        	}   
        }
        System.out.println("Do you want to continue?\n Press Y for yes\n Press any other key to discontinue");
        String choice=sc.next();
        if(choice.compareToIgnoreCase("y")!=0)
        	flag=false;  
        	System.out.println("Succesfully Ended!!");
        }
        		
        sc.close();        
    }
}
