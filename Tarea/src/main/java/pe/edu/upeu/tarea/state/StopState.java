/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.edu.upeu.tarea.state;

public class StopState implements State {

   public void doAction(Context context) {
      System.out.println("La jugadora está en estado de parada");
      context.setState(this);
   }

   public String toString(){
      return "Estado de parada";
   }
}
