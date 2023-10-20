/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author User
 */
public class Mago extends Heroi{

    @Override
    public String atacar() {
        return "O Mago: " + getNome() + " com " + getIdade() + " anos, atacou com"
                + " bola de fogo";
    }
       
}
