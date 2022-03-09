/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author iqbal
 */
public class Konversi {
    double suhuCelcius;

    public Konversi(double suhuCelcius) {
        this.suhuCelcius = suhuCelcius;
    }
    
    int hasilSuhu(){
        double R = (4*this.suhuCelcius)/5;
        double F = ((9*this.suhuCelcius)/5)+32;
        double K = this.suhuCelcius + 273.15;
        
        System.out.println("Suhu Dalam Celcius\t: " + this.suhuCelcius + "°C");
        System.out.println("Suhu Dalam Fahrenheit\t: " + F + "°F");
        System.out.println("Suhu Dalam Reamur\t: " + R + "°R");
        System.out.println("Suhu Dalam Kelvin\t: " + K + "°K");
        
        if (this.suhuCelcius<=0){
            System.out.println("Kondisi Air Beku.\n");
        }
        else if (this.suhuCelcius>0 && this.suhuCelcius<100){
            System.out.println("Kondisi Air Normal.\n");
        }
        else{
            System.out.println("Kondisi Air Mendidih.\n");
        }
        return 0;
    } 
}