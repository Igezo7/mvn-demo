package top.igezo.dao;

/**
 * Created by igezo on 25/04/2018.
 */
public class UserDao {
    private String name;
    private String password;

    public String getName(){
        return name;
    }
    public String getPassword(){
        return password;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setPassword(String password){
        this.password = password;
    }
}
