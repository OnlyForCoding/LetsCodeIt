package com.company.exception;
import java.sql.SQLException;

public class ExceptionsDemo {

    public static void main(String[] args){
        Account account = new Account();
        try {
            account.getConn();
        } catch (SQLException ex){
            System.out.println(ex.getMessage());
            System.out.println("try after some time");
        }
        finally {
            System.out.println("closing connection anyway ");
        }

    }
}
