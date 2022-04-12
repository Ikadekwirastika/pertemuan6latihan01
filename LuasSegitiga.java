package pert6latihan01;

/**
 *
 * @author Kadek Wirastika 20104040
 */
public class LuasSegitiga { 
    /*
    Luas segi 3 = Alas * Tinggi * 0.5
    Luas float/Double
    Tinggi : float/double
    Alas : float/double
    */
    float alas;
    float tinggi;
    double Luas;
    
    /*Constractur*/
    public LuasSegitiga (float AL, float TG){
        this.setALAS(AL);
        this.setTINGGI(TG);
    }
    
    /*
    Method setALAS
    Parameter float AL
    Untuk set nilai ke property/atribut alas
    */
     public void setALAS(float AL){
        this.alas = AL;
    }
     /*
     Method setTINGGI
     Parameter : float TG
     Untuk set nilai ke property/Atribut tinggi
     */
    
     public void setTINGGI (float TG){
         this.tinggi = TG;
     }
     /*
     Method double HitungLuas
     Parameter :-
     digunakan untuk menghitung luas segitiga
     */
     
     private double HitungLuas(){
         this.Luas = 0.5*this.alas*this.tinggi;
         return this.Luas;
     }
     /*Method : CetakLuas
     Parameter : -
     digunakan untuk menampilkan hasil luas segitiga
     */
     public void CetakLuas(){
         this.HitungLuas();
         System.out.println("Hitung Luas Segitiga");
         System.out.println("-----------------------");
         System.out.println("Nilai Alas   :"+this.alas+"cm");
         System.out.println("Nilai Tinggi :"+this.tinggi+"cm");
         System.out.println("Jadi Luasnya :"+this.Luas+"cm2");
     
     }
}
