public class MetodoFactoriales {
   int factCalculator(int n){
        int store_fact=1;
        for ( int i=1;  i<=detectnegative(n); i++){
            store_fact =store_fact*i;
        }
        return store_fact;
    }

    double mathematicalconstant(double c){
       double e = 0;
       for (int a = 1; a<=c; a++){
           e = e +(1/factCalculator(a));
       }
       e =e +1;
       return e;
    }
    int detectnegative(int p){
        int numeronegativo = -1;
        if(p <0){
            p *= numeronegativo;
        }
        return p;
    }

    double calculate_value_ex(int base, int n_terminos){
        double ex = 0;
        int resultado_potencia =0 ;
        for(int i = 1; i <= n_terminos; i++ ){
            resultado_potencia = (int) Math.pow(base, i);
            ex += (resultado_potencia/factCalculator(i));
        }
        ex = ex +1;
        return ex;
    }
}

