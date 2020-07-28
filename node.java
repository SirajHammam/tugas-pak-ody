/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praktikum_akhsanu;

/**
 *
 * @author HP
 */
public class node {
    public node head = null;
    public node tail = null;
    
    public int data;
    public node next;
    
    public node (int s){
        this.data = s;
        this.next =null;
    }
    
    public void antrian_pertama(int aku){
        node newnode = new node(aku);
        
        if (head == null) {
            head =  newnode;
            tail =  newnode;
            
        }else{
            node kamu = head;
            
            head = newnode;
            
            head.next = kamu;
        }  
    }
    
    public void antrian_terakhir(int aku_akhir){
        node newnode = new node (aku_akhir);
        
        if (head == null) {
            head =  newnode;
            tail =  newnode;
        } else {
            tail.next = newnode;
            tail = newnode;
        }
    }
    
    public void hapus(int wow){
        if (wow == 0) {
            head=  head.getnext();
            return;
        }
        node current = head;
        int count = 0;
        while (count < wow -1) {            
            current = current.getnext();
            if (current == null) {
                throw new IndexOutOfBoundsException("gak ketemu");
            }
            count++;
        }
        if (current.getnext()== null) {
            throw new IndexOutOfBoundsException("gak ketemu");
        }
        current.setnext(current.getnext().getnext());
    }
    
    public node () {
        this.getClass();
    }
    
    public int getdata(){return data;}
    public node getnext() {return next;}
    public void setdata (int s){data=s;}
    public void setnext (node siraj_kece){next = siraj_kece;}
    
    
    public String txt(){
        String output ="";
        node current = head;
        while (current!=null) {            
            output += current.getdata()+",";
            current = current.getnext();
        }
        return output;
    }
    
    public static void main(String[] args) {
        node arfan = new node();
        arfan.antrian_pertama(93);
        arfan.antrian_pertama(19);
        arfan.antrian_terakhir(10);
        arfan.antrian_terakhir(5);
        
        System.out.println(arfan.txt());
        
        arfan.hapus(3);
        System.out.println(arfan.txt());
    }
}
