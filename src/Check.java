import java.io.File;
import java.util.Scanner;
import java.io.FileNotFoundException;

public class Check{
    private String name, dataName;
    private String password, dataPassword;

    public void accessVerification() throws FileNotFoundException{
        Scanner file=new Scanner(new File("Out data for computer.txt"));
        int flagName=0,flagPassword=0;
        while(file.hasNext()){
            dataName=file.next();
            if (checkName()==true){
                flagName=1;
            }
            dataPassword=file.next();
            if(checkPassword()==true){
                flagPassword=1;
            }
        }
        if (flagName==1 && flagPassword==1){
            System.out.println("Access is allowed!");
        }
    }

    private boolean checkName(){
        if (name.equals(dataName)){
            return true;
        }
        else return false;
    }
    private boolean checkPassword(){
        if (password.equals(dataPassword)){
            return true;
        }
        else return false;
    }

    public String getName() {
        return name;
    }

    public String getPassword() {
        return password;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
