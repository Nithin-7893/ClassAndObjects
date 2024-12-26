class Teacher
{
int x,y;
Teacher()
{
 x=0;
y=0;
}
Teacher(int a)
{
 x=a;
y=10;
}
Teacher(int a,int b)
{
 x=a;
y=b;
}
void display()
{
System.out.printf("x=%d  ,  y=%d\n",x,y);
}
}
class Student 
{
public static void main(String args[])
{
Teacher t1=new Teacher();
Teacher t2=new Teacher(4);
Teacher t3=new Teacher(7,9);
t1.display();
t2.display();
t3.display();
}
}