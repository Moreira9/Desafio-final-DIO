/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author User
 */
public class Guerreiro extends Heroi {

    @Override
    public String atacar() {
        return "O Guerreiro: " + getNome() + " com " + getIdade() +
                " anos, atacou com golpe demolidor";
    }
    
    
}
