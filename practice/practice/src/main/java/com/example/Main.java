package com.example;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Main {
    static Scanner scan=new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Hello world!");
    
        // Contact contact1=new Contact("Alice","9182732","1998-11-21");
        
        // Contact contact2=new Contact("boke","123454","1948-10-01");
        // Contact[] contacts={contact1,contact2};
      //  Contact contact3=new Contact(contact1);
        //Contact contact4=new Contact(contact2);
        // ContactManager contactManager=new ContactManager(contacts);

        // Contact retriveContact=contactManager.getContact(0);
        // contact1.setBirthDate("1989-01-02");
        // System.out.println(retriveContact.getName());
        // Contact newContact=new Contact("ask","123454","1948-10-01");
        // contactManager.setContact(newContact, 0);

        // retriveContact=contactManager.getContact(0);
        //  System.out.println(retriveContact.getName());
        ContactManager contactManager1=new ContactManager(contactDate());
        displayContacts(contactManager1);

        System.out.println("u have 3 contacts, enter continue to edit them");
        String status=scan.nextLine();
        while(status.equals("continue")){
            System.out.println("chosse btw 0 t0 2");
            int index=scan.nextInt();
            scan.nextLine();
            contactManager1.setContact(editedContact(), index);
             displayContacts(contactManager1);
             System.out.println("enter continue");
             status=scan.nextLine();
           

        }


       

scan.close();
    }
    public static Contact[] contactDate(){
        return new Contact[]{
            new Contact("qwek","123454","1948-10-01"),
            new Contact("derk","123454","1948-10-01"),
            new Contact("zx","123454","1948-10-01")      
        };
    }
    public static void displayContacts(ContactManager contactManager){
        for (int i = 0; i < 3; i++) {
            Contact contact=contactManager.getContact(i);
            System.out.println(contact+"\n");
        }

    }
    public static Contact editedContact(){
        System.out.println("enter name");
        String name=scan.nextLine();
        System.out.println("enterphne");
                String phone=scan.nextLine();
        System.out.println("enter date of birthh  yyyy-mm-dd");
               String dateOfBirth=scan.nextLine();


        return new Contact(name,phone,dateOfBirth);

    }
    
    
    
}