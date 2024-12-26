class This
{
int x,y;
void set(int x,int y)
{
this.x=x;
this.y=y;

}
void display()
{
System.out.println("**IMPLEMENTATION OF this KEYWORD**");
}
}
class Implement
{
public static void main(String args[])
{
This t=new This();
t.display();
t.set(5,10);
System.out.println("x="+t.x);
System.out.println("y="+t.y);
}
}
