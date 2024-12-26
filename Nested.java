class Outer
{
 int x;
Outer()
{
x=10;
}
void test()
{
for(i=1;i<5;i++)
{
class Inner
{
void display()
{
System.out.println("outer class member x="+x);
}
}
Inner in =new Inner();
in.display();
}
}
}
class Nested
{
public static void main(String args[])
{
Outer out=new Outer();
out.test();
}
}