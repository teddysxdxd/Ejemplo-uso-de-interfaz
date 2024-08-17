/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author USUARIO
 */
public class Suma implements Operacion  {

    @Override
    public String operacion(Integer num1, Integer num2) {
    
        double resultado = (num1 + num2);
        
        return String.valueOf(resultado);
        
    }

    public Suma() {
    }
    
    private String string;

    public String getString() {
        return string;
    }

    public void setString(String string) {
        this.string = string;
    }

}
