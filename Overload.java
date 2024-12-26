class Overload
{
void print(int a,int b)
{
System.out.printf("value of a & b =%d , %d\n",a, b);
}
void print(int a,int b,float c)
{
System.out.printf("value of a ,b& c =%d , %d and %f",a, b,c);
}
}
class Maino
{
public static void main(String args[])
{
Overload o=new Overload();
o.print(4,5);
o.print(4,5,6.3f);
}
} 