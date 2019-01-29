package com.example.admin1.firstlogin;


import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class activity_customer_home {

   int image;

   String name, number, email_address;

   public activity_customer_home(int image, String name, String number, String email_address) {
       this.image = image;
       this.name = name;
       this.number = number;
       this.email_address = email_address;
   }

    public int getImage() {
        return image;
    }

    public String getName() {
        return name;
    }

    public String getNumber() {
        return number;
    }

    public String getEmail_address() {
        return email_address;
    }
}
