package com.example.ppw.controller;

import com.example.ppw.model.orders;
import com.example.ppw.repository.ordersRepo;
import com.example.ppw.repository.testNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/shoppingcart")
//ini untuk menambah case ketidka ada kondisi pembelian lebih dari satu
public class ContohKondisi {

    public static void main(String[] args) {
        boolean kondisi;

        kondisi= (1+1) == 2 && 2>1;

        if (kondisi){
            System.out.println("Jawaban anda benar...");
        }
        else {
            System.out.println("Jawaban anda benar salah...");
        }
    }
}

class CetakAngka{
/*contoh membuat variabel dan scanner
 contoh komentar*/
    public static void main(String[] argumen){

        for(int i=0; i <= 10; i++){
            System.out.print( i + " " );
        }

    }
}
