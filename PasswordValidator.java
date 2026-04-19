import java.util.*; 

class PasswordValidator
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in); 
        
        boolean lengthFlag = false;
        boolean uppercaseFlag = false;
        boolean digitFlag = false;
        boolean isPasswordStrong = false;

        do
        {
            lengthFlag = false;
            uppercaseFlag = false;
            digitFlag = false;

            System.out.print("Enter the password : ");
            String password = sc.nextLine();
            int passwordLength = password.length();

            if (passwordLength >= 8)
            {
                lengthFlag = true;
            }

            for (int i = 0; i < passwordLength; i++)
            {
                char ch = password.charAt(i);

                if (Character.isUpperCase(ch))
                {
                    uppercaseFlag = true;
                }

                if (Character.isDigit(ch))
                {
                    digitFlag = true;
                }
            }

            if (lengthFlag && uppercaseFlag && digitFlag)
            {
                isPasswordStrong = true;
                System.out.println("Password is valid");
            }

            if (!lengthFlag)
            {
                System.out.println("The password is too short.");
            }

            if (!digitFlag)
            {
                System.out.println("The password is missing a digit.");
            }

            if (!uppercaseFlag)
            {
                System.out.println("Password must contain one uppercase letter.");
            }

        } while (!isPasswordStrong);
    }
}