class PersonalDetails{
    public String name;
    private int age;
    private String Email;
    private long  mobileNo;

    public String GetName(){
        return name;
    }

    public  void  SetName(String name){
        this.name = name;
    }

    public int  GetAge(){
        return  age;
    }
    public void SetAge(int age){
        this.age = age;
    }
    public String GetEmail(){
        return Email;
    }
    public void SetEmail(String Email){
        this.Email = Email;
    }
    public long GetMobileNum(){
        return mobileNo;
    }
    public void SetMobileNum(long mobileNo){
        this.mobileNo = mobileNo;
    }

}
public class Encaps {
    public static void main(String[] args) {
        PersonalDetails person1 = new PersonalDetails();
        person1.SetName("praveen");
        person1.SetAge(21);
        person1.SetEmail("Praveen134@gamil.com");
        person1.SetMobileNum(936086906);
        System.out.println(person1.GetName());
        System.out.println(person1.GetAge());
        System.out.println(person1.GetEmail());
        System.out.println(person1.GetMobileNum());
    }
        
}
