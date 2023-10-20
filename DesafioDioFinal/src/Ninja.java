/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author User
 */
public class Ninja extends Heroi {

    @Override
    public String atacar() {
        return "O Ninja: " + getNome() + " com " + getIdade() + " anos, atacou com"
                + " taijutsu";
    }
    
}
