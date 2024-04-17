package no4;

public class main{
    public static void main(String[] args){
        limasSegiEmpat LimasSegiEmpat1 = new limasSegiEmpat();
        System.out.println("Limas segi empat dengan luas alas : " + LimasSegiEmpat1.luasAlas +
                           ", luas selubung limas : " + LimasSegiEmpat1.luasSelubungLimas +
                           " dan tinggi : " + LimasSegiEmpat1.tinggi + ".");
        System.out.println("Luasnya : " + LimasSegiEmpat1.getLuas() + ", sedangkan volumenya : " 
                            + LimasSegiEmpat1.getVolume());

        limasSegiEmpat LimasSegiEmpat2 = new limasSegiEmpat(30, 40, 50);
        System.out.println("Limas segi empat dengan luas alas : " + LimasSegiEmpat2.luasAlas +
                           ", luas selubung limas : " + LimasSegiEmpat2.luasSelubungLimas +
                           " dan tinggi : " + LimasSegiEmpat2.tinggi + ".");
        System.out.println("Luasnya : " + LimasSegiEmpat2.getLuas() + ", sedangkan volumenya : " 
                            + LimasSegiEmpat2.getVolume());

        limasSegiEmpat LimasSegiEmpat3 = new limasSegiEmpat(25, 35, 45);
        System.out.println("Limas segi empat dengan luas alas : " + LimasSegiEmpat3.luasAlas +
                           ", luas selubung limas : " + LimasSegiEmpat3.luasSelubungLimas +
                           " dan tinggi : " + LimasSegiEmpat3.tinggi + ".");
        System.out.println("Luasnya : " + LimasSegiEmpat3.getLuas() + ", sedangkan volumenya : " 
                            + LimasSegiEmpat3.getVolume());
    }
}