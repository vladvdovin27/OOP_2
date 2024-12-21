public class User {
    private UserImpl user;

    public User(UserImpl u){
        user = u;
    }

    public void checkMsg(){
        user.checkMsg();
    }

    public void writeMsg(){
        user.writeMsg();
    }

    public void getInfo(){
        user.getInfo();
    }

    public void authorization(){
        user = new Admin();
    }
}


class UserImpl{
    public void checkMsg(){};
    public void writeMsg(){};
    public void getInfo(){}
}

class Guest extends UserImpl{
    public Guest(){}
    @Override
    public void checkMsg() {
        System.out.println("Сообщения нельзя проверить");
    }

    @Override
    public void writeMsg(){
        System.out.println("Вы не можете написать сообщения");
    }

    @Override
    public void getInfo(){
        System.out.println("У вас не достаточно прав");
    }

}

class Admin extends UserImpl{
    public Admin(){}
    @Override
    public void checkMsg(){
        System.out.println("Проверка сообщений");
    }

    @Override
    public void writeMsg(){
        System.out.println("Напишите сообщение");
    }

    @Override
    public void getInfo(){
        System.out.println("Выберите пользоватале, о которым вы хотите получить информацию");
    }
}