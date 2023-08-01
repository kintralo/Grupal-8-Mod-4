public class Calculator {
    double num1;
    double num2;
    double resultado;
    String respuesta;

    public Calculator(double num1, double num2, double resultado, String respuesta) {
        this.num1 = num1;
        this.num2 = num2;
        this.respuesta = respuesta;
        this.resultado = resultado;
    }

    public double getNum1() {
        return num1;
    }

    public void setNum1(double num1) {
        this.num1 = num1;
    }

    public double getNum2() {
        return num2;
    }

    public void setNum2(double num2) {
        this.num2 = num2;
    }

    public String getRespuesta() {
        return respuesta;
    }

    public void setRespuesta(String respuesta) {
        this.respuesta = respuesta;
    }

    public double getResultado() {
        return resultado;
    }

    public void setResultado(double resultado) {
        this.resultado = resultado;
    }
    public void suma(){
        this.setResultado(this.num1+this.num2);
    }
    public void resta(){
        this.setResultado(this.num1-this.num2);
    }
    public void multiplicacion(){
        this.setResultado(this.num1*this.num2);
    }
    public void division(){
        if(this.num2==0){
            this.setResultado(0);
            this.setRespuesta("División por 0 no es valida");
        }else if(this.num1==0) {
            this.setResultado(0);
            this.setRespuesta("");
        }else{
            this.setResultado(this.num1/this.num2);
        }
    }
}
