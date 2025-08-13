
class Student 
{
    public  String Name;
    public int Rno;
    public int Marks;

    public Student(String str,int A,int B)
    {
        System.out.println("Inside Constructor");
        this.Name = str;
        this.Rno = A;
        this.Marks= B;
    }
}

class ObjectDemo6
{
    public static void main(String A[])
    {
        Student sobj1 = new Student("Pooja",11,89);
        
        System.out.println(sobj1.toString());
    }
}