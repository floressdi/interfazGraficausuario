public class MetodoFactoriales {
   int factCalculator(int n){
        int store_fact=1;
        for ( int i=1;  i<=detectnegative(n); i++){
            store_fact =store_fact*i;
        }
        return store_fact;
    }

    double mathematicalconstant(int c){
       double e = 0;
       double b = 1;
       double convertir = 0;
       for (int a = 1; a<=c; a++){
           convertir = factCalculator(a);
           e = b +(b/convertir);
           e += e;
       }
       return e;
    }

    int detectnegative(int p){
        int numeronegativo = -1;
        if(p <0){
            p *= numeronegativo;
        }
        return p;
    }
}