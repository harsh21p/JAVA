#include<stdio.h>
#include<conio.h>
struct students
{ char Name[10];
int Roll_no;
float English,Science,Maths;
float Average;
float Attendance;
}s[5];
int main()
{
	int i,n,flag=0;
        printf("\n\t\tNAME: HARSHAD R. PACHORE\n\n\t\t\tMITU18BTBI0036\n\n");
	printf("\t\tFILL THE DETAILS OF STUDENTS ");
		printf("\n\nEnter how many students you want to take into the list =\t");
		scanf("%d",&n);
	for(i=1;i<=n;i++)
	{	
	
		
		printf("\nEnter a Roll No of Student %d  =\t",i);
		scanf("%d",&s[i].Roll_no);
		printf("\nName of Student %d =\t",i);
		scanf("%s",s[i].Name);
		printf("\n Student No. %d Marks of English =\t",i);
		scanf("%f",&s[i].English);
		printf("\n Student No. %d Marks of Science =\t",i);
		scanf("%f",&s[i].Science);
		printf("\n Student No. %d Marks of Maths =\t\t",i);
		scanf("%f",&s[i].Maths);
		s[i].Average=(s[i].English+s[i].Science+s[i].Maths)/3;
		printf("\nEnter Attendance of Student %d (in percentage) =\t",i);
		scanf("%f",&s[i].Attendance);
		
		}
	
	printf("\nRoll No.\tName of Student\t\tEnglish\tScience\tMaths\t\tAverage\t\tAttendance\tPromotion Status");
	for(i=1;i<=n;i++)
	{
		printf("\n\n%d\t\t%s\t\t\t%.2lf\t%.2lf\t%.2lf\t\t%.2lf\t\t%.2lf\t\t",s[i].Roll_no,s[i].Name,s[i].English,s[i].Science,s[i].Maths,s[i].Average,s[i].Attendance);
		if(s[i].Average>=40)
		{
			if(s[i].Attendance>=75)
			{
				flag=1; 
			}else{
				flag=2;
			}
		}else{
			if(s[i].Attendance>=75)
			{
				flag=3;
			}else{
				flag=4;
			}
				
			}
		
		
		if(flag==1)
		{
			printf("Promoted");
		}else{
			if(flag==2){
				printf("Result with held");
			}else{
				if(flag==3)
				{
						printf("Retest to be given");
				}else{
					if(flag==4){
					printf("Failed");
				}
				}
			}
		}
	}
	
		return(0);
}
