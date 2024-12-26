class Demo
{
int x,y;
void assign( int a,int b)
{
x=a;
y=b;
}
void display()
{
System.out.println("value of x="+x);
System.out.println("value of y="+y);
}
void print()
{
System.out.println("x*y="+(x*y));
System.out.println("x+y="+(x+y));
}
}
class Main
{
public static void main(String args[])
{
Demo f=new Demo();
f.assign(4,5);
f.display();
f.print();

}
}
