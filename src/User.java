public class User {
    private String nickname, password;

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getNickname() {
        return nickname;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPassword() {
        return password;
    }

    User(String nickname, String password){
        this.nickname=nickname;
        this.password=password;
    }
    User(){}
}
