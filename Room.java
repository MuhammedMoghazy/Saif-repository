/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package safwa_project;

/**
 *
 * @author Cyber
 */
public class Room {
    protected int room_num;
    protected boolean available;
    protected String room_type;

    public Room(int room_num,String room_type) {
        this.room_num = room_num;
        this.available = true;
        this.room_type = room_type;
    }
    public void book_room(){
        if(available){
            available=false;
            System.out.println("The room num "+room_num+" is booked");
        }else{
            available=true;
            System.out.println("The room "+room_num+" is not available");
        }
    }
    public void check_in(){
        if(available){
            available=false;
            System.out.println("Checked into "+room_num);
        }else{
            available=true;
            System.out.println("The room "+room_num+" is not available");
        }
    }
    public void check_out(){
        available=true;
        System.out.println("Checked out of "+room_num);
    }

}
