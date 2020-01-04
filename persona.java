public class persona{
    public String nombre;
    public int edad;
    public char sexo;
    public String cedula;
    public double altura;
    public double peso;

    //Arquitecto por defecto
    public persona(){
        this("carlos",18,'H',"1516-2347-23000-A1",1.22,
                98.73);

    }
     //Arquitecto por defecto todos los atributos como, parametros
    public persona (String nombre,int edad, char sexo,
       String cedula,double altura, double peso){
        this.nombre=nombre;
        this.edad=edad;
        this.sexo=sexo;
        this.cedula=cedula;
        this.altura=altura;
        this.peso=peso;


    }

    //arqitecto de 3 parametros
     public persona(String nombre,int edad,char sexo){
        this(nombre,edad,sexo,"o",0,0);
    }
    // metodo
    // calcular masa del cuerco IMC.
    public int calcularIMC(){
        int bajopeso=-1;
        int pesoideal=0;
        int sobrepeso=1;
        String altura="altura";
        double imc=peso / 1;
        if (imc>=20 && imc<=25){
            return pesoideal;
        }else if (imc<20){
            return bajopeso;
            return sobrepeso;
        }
    }
}
