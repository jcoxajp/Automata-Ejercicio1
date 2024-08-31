package com.coxaj;

public class Automata {
    int cont;
    boolean aceptado;
    char [] car;

    public void inicio(){
        cont =0;
        aceptado=false;
        q0();
    }

    public void q0(){
        System.out.println("En q0");
        if(cont<car.length){
            aceptado=false;
            if(car[cont]=='a'){
                cont++;
                q1();
            }else if(car[cont]=='b'){
                cont++;
                q2();
            }else if(car[cont]=='c'){
                cont++;
                q0();
            }else if(car[cont]=='d'){
                cont++;
                q3();
            }
        }
    }

    public void q1(){
        System.out.println("En q1");
        if(cont<car.length){
            aceptado=false;
            if(car[cont]=='a'){
                cont++;
                q2();
            }else if(car[cont]=='b'){
                cont++;
                q0();
            }else if(car[cont]=='c'){
                cont++;
                q2();
            }else if(car[cont]=='d'){
                cont++;
                q2();
            }
        }
    }
    public void q2(){
        System.out.println("En q2");
        if(cont<car.length){
            aceptado=false;
            if(car[cont]=='a'){
                cont++;
                q2();
            }else if(car[cont]=='b'){
                cont++;
                q2();
            }else if(car[cont]=='c'){
                cont++;
                q2();
            }else if(car[cont]=='d'){
                cont++;
                q2();
            }
        }
    }
    public void q3(){
        System.out.println("Estado q3 en aceptación");
        aceptado=true;
        if(cont<car.length){
            if(car[cont]=='a'){
                cont++;
                q2();
            }else if(car[cont]=='b'){
                cont++;
                q2();
            }else if(car[cont]=='c'){
                cont++;
                q2();
            }else if(car[cont]=='d'){
                cont++;
                q2();
            }
        }
    }
}
