class FinalizeEx
{
public void finalize()
{
System.out.println("finalize called");
}
public static void main(String[] args)
{
FinalizeEx f=new FinalizeEx();
FinalizeEx f1=new FinalizeEx();
f=null;
f1=null;
System.gc();
}
}