package view;

import bean.User;
import bean.UserDetail;


public class Ex01BuilderPatternDemo {
    public static void main(String[] args){
        // instance userA with full info
        User userA = User.builder()
                .withFirstName("Hien")
                .withLastName("Tran")
                .withAge(24)
                .withPhone("0909123134")
                .withAddress("Da Nang")
                .build();
        // instance userB with only require info
        User userB = User.builder()
                .withFirstName("Kim")
                .withLastName("Linh")
                .build();

        User userC = User.builder().withFirstName("Est Rouge inc").build();        System.out.println(userA);
        System.out.println(userC);

        UserDetail userD = new UserDetail()
                .withAddress("Da Nang")
                .withFirstName("Mao")
                .withLastName("Ma");
        System.out.println(userD);
    }
}
