#include<stdio.h>
#include<stdlib.h>
#include<string.h>
#include<time.h>
#include <ctype.h>

struct complaints{
	char details[500];
	int complaintNo;
	char solution[500];
	int phoneNo;
	struct complaints *link;
};


typedef struct complaints *node;

//function definations
int newClient();
int existingClient();
int devloperLogin();
void userComplain();
void existing_status();
int complaintNoGenerator();
void developer_update();

int main()
{
	//variable Declarations
	char ch[10],choiceClient[10];
	int clientGenerated=0,loginPassed=0,devloperLoged=0;
        int choiceUser=0,clientChoice=0,user_complain;
	//Menu Driven
	while(1){

		printf("\nEnter '1' for Client login and '2' for Service Provider login.Enter '3' to  Exit\n");
		scanf("%d",&choiceUser);
			switch(choiceUser)
			{
				case 1:
				//Client Login choice begins

					printf("\nEnter '1' for new login and '2' for existing login\n");
					scanf("%d",&clientChoice);
					switch(clientChoice)
					{
						case 1:
							clientGenerated=newClient();
							if(clientGenerated==1)
							{
								printf("\nNew Record Generated\n");
								userComplain();

							}
							else
							{
								printf("\nSome Error occured.Login not created.Please try again\n");
							}
							break;
						case 2:

							loginPassed=existingClient();
							char userCom[20];
							int chh;
							if(loginPassed==1){
								printf("\nLogin Successful\n");
								printf("\nEnter '1' if you want to Register complain or '2' to Check status of previous complaints\n");
								scanf("%d",&chh);
								if(chh==1){
									userComplain();
								}
								else if(chh==2){
										existing_status();
								}
								else{
                                    printf("\nWrong Choice.\n");
								}
							}
							else {
								printf("\nLogin Failed.Try Again\n");
							}
							break;
						default:
							printf("\nWrong Choice\n");
					}
					break;
					//Client login choice ends
					//Devlopers login choice begins
						case 2:

								devloperLoged=devloperLogin();
								if(devloperLoged==1){
									printf("\nLogin Successful\n");
									printf("\nUpdate the status of the Complaints");
                                        developer_update();
								}
								else{
									printf("\nLogin Failed.Try Again\n");
								}
							break;
					//Devlopers login choice ends
						case 3:
							exit(0);
						default:
							printf("\nWrong Choice\n");
		}//end of switch
	}//end of while
	return 0;
}//end of main
int newClient()
{
	FILE *fp;
	//error checking
	if((fp=fopen("loginRecordsClients.txt","r"))==NULL){
		return 0;
	}
	char tempName[25],tempUser[25],tempPass[25];
	//variable declarations
	fp=fopen("loginRecordsClients.txt","a");
	char name[50],password[20],username[20];
	//taking input
	printf("\nEnter your name\n");
	scanf("%s",name);
	printf("\nEnter your username\n");
	scanf("%s",username);
	printf("\nEnter your password(Min: 8 characters)\n");
	scanf("%s",password);
	//process
	fprintf(fp,"%s\t%s\t%s\n",name,username,password);
	fclose(fp);
	return 1;
}

int existingClient(){
	FILE *fp;
	//error checking
	if((fp=fopen("loginRecordsClients.txt","r"))==NULL){
		return 0;
	}
	//variable deslarations
	char name[50],password[20],username[20];
	//int dd,mm,yyyy;
	char passwordEntered[20],nameEntered[50];
	printf("\nEnter your Username\n");
	scanf("%s",nameEntered);
	printf("\nEnter your Password\n");
	scanf("%s",passwordEntered);
	fp=fopen("loginRecordsClients.txt","r");
	while((fscanf(fp,"%s%s%s",name,username,password))!=EOF){
	if(strcmp(username,nameEntered)==0 && strcmp(password,passwordEntered)==0){
		return 1;
	}
	}
	return 0;
}
int devloperLogin()
{
	FILE *fp;
	//error checking
	if((fp=fopen("loginRecordsDevloper.txt","r"))==NULL){
		return 0;
	}
	//variable declaration
	char name[50],password[20],username[20];
	char passwordEntered[20],nameEntered[50];
	printf("\nEnter your Username\n");
	scanf("%s",nameEntered);
	printf("\nEnter your Password\n");
	scanf("%s",passwordEntered);
	fp=fopen("loginRecordsDevloper.txt","r");
	while((fscanf(fp,"%s%s%s",name,username,password))!=EOF){
	if(strcmp(username,nameEntered)==0 && strcmp(password,passwordEntered)==0){
		return 1;
	}
	}
}
void userComplain()
{
    FILE *fp;
    time_t seconds;
    int second,min,hr;
    int user_complain;
    char details[100];
    fp=fopen("user_complain.txt","a");
    printf("\n=====================================");
    printf("\nWELCOME TO THE COMPLAIN DESK");
    printf("\n\nEnter Your complain :\n");
    scanf("%[^\t]s",details);
    int comNo=complaintNoGenerator();
    // time function
    time_t mytime;
    mytime=time(NULL);
    printf("\nTime of Complaint:");
    printf(ctime(&mytime));
    fprintf(fp,"%s\t%d",details,comNo);
    printf("\nYour Complaint Number is %d",comNo);
    user_complain=1;
    fclose(fp);
    if(user_complain==1)
    {
        printf("\nWe are SORRY for your inconvenience.");
        printf("\nIt will be solved AS SOON AS possible.");
        printf("\n=======================================");
        printf("\nDo you want to continue or log out?");
        printf("\nPress 1 to continue and 2 to log out\n");
        int ch;
        scanf("%d",&ch);
        if(ch==1)
        {

            userComplain();

        }
        else{
            return;
        }
    }
 }
void existing_status()
{
    FILE *fp;
    int comNo;
    printf("\nEnter your complaint No:");
    scanf("%d",&comNo);
    char tempdetails[500],tempSol[500];
    int tempComNo,tempPhone;
    fp=fopen("updated_complain.txt","r");
    while(fscanf(fp,"%s%s%d%d",tempdetails,tempSol,&tempPhone,&tempComNo)!=EOF){
            if(comNo==tempComNo){
                    printf("\nYour Complaint was:%s",tempdetails);
                    printf("\nSolution is:%s",tempSol);
                    printf("\nFor any query contact:%d",tempPhone);
                    return;
            }
    }
    printf("\nComplaint Number Not found.\n");

}
void developer_update()
{
    char read[500];
    FILE *fp,*fp1,*fp2;
    int compNo;
    char solution[500];
    fp=fopen("user_complain.txt","r");
    fp1=fopen("updated_complain.txt","w");
    fp2=fopen("complaintNo.txt","r");
    int count;
    fscanf(fp2,"%d",&count);
    fclose(fp2);
    int i=1;
    //struct complaints temp[count];
    node temp[i];
    while(fscanf(fp,"%[^\t]s%d",read,&compNo)!=EOF && i<=count)
    {
        temp[i]=(node)malloc(sizeof (struct complaints));
        strcpy(temp[i]->details,read);
        temp[i]->complaintNo=compNo;
        printf("\nEnter the solution for this Problem:(Fixed or Not Fixed)");
        printf("\nProblem: %s\n",read);
        scanf("%[^%\t]s",temp[i]->solution);
        printf("\nEnter the phone number to contact");
        scanf("%d",&temp[i]->phoneNo);
     //   temp[i].link=NULL;
        fprintf(fp1,"%s\t%s\t%d\t%d\n",read,temp[i]->solution,temp[i]->phoneNo,i);
        i++;
    }
    fclose(fp);
    fclose(fp1);
    printf("\n*****************************");
}
int complaintNoGenerator(){
	FILE *fp;
	int comNo;
	fp=fopen("complaintNo.txt","r");
	fscanf(fp,"%d",&comNo);
	fclose(fp);
	++comNo;
	fopen("complaintNo.txt","w");
	fprintf(fp,"%d",comNo);
	fclose(fp);
	return (comNo);
}
