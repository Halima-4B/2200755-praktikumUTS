package no4;

public class limasSegiEmpat{
    double luasAlas;
    double luasSelubungLimas;
    double tinggi;
    
    limasSegiEmpat(){
        luasAlas          = 1;
        luasSelubungLimas = 1;
        tinggi            = 1;
    }
    
    limasSegiEmpat(double luasAlasBaru, double luasSelubungLimasBaru, double tinggiBaru){
        luasAlas          = luasAlasBaru;
        luasSelubungLimas = luasSelubungLimasBaru;
        tinggi            = tinggiBaru;    
    }
    
    double getVolume(){
        return 0.33 * luasAlas * tinggi;
    }
        
    double getLuas(){
        return luasAlas + luasSelubungLimas;
    }

    void setLuasAlas(double luasAlasBaru){
        luasAlas = luasAlasBaru;
    }

    void setLuasSelubung(double luasSelubungLimasBaru){
        luasSelubungLimas = luasSelubungLimasBaru;
    }
    
    void setTinggi(double tinggiBaru){
        tinggi = tinggiBaru;
    }
}