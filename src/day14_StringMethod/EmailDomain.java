package day14_StringMethod;

public class EmailDomain {
    public static void main(String[] args) {
        
        String email = "cydeo.school@hotmail.com";

        int beginningIndex = email.indexOf("@")+1;
        int endingIndex = email.lastIndexOf(".");

        String domain = email.substring(beginningIndex, endingIndex);
        System.out.println(domain);

        System.out.println("_______________________________");

        String str1 = "Java is fun, Java is cool, I Love Java";

        String s1 = str1.substring(0,10+1); //Java is fun

        int begIndex = str1.indexOf(" J")+1;
        int endIndex = str1.lastIndexOf(",");
        String s2 = str1.substring(begIndex,endIndex);

        String s3 = str1.substring(str1.lastIndexOf("I"));

        System.out.println("s1 = " + s1);
        System.out.println("s2 = " + s2);
        System.out.println("s3 = " + s3);




    }
}
