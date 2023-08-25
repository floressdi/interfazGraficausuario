public class MetodoFactoriales {
   int factCalculator(int n){

        int store_fact=1;
        for ( int i=1;  i<=detectnegative(n); i++){
            store_fact =store_fact*i;
        }
        return store_fact;
    }

    int mathematicalconstant(int c){
       int e = 0;
       int b =1;
       for (int a = 1; a<=c; a++){
           e += b +(b/factCalculator(a));
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


