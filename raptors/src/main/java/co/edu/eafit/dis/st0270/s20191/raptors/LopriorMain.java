package co.edu.eafit.dis.st0270.s20191.raptors;

import co.edu.eafit.dis.st0270.s20191.raptors.parser.LopriorParser;
import co.edu.eafit.dis.st0270.s20191.raptors.visitors.LopriorPrint;
import co.edu.eafit.dis.st0270.s20191.raptors.abs.Loprior;
import co.edu.eafit.dis.st0270.s20191.raptors.flex.LopriorLexer;

import java.io.*;
import java.util.HashMap;

public class LopriorMain {
	public static boolean s = false;
	public static boolean p = false;
	public static boolean o = false;
	private static HashMap<String, String> nombres = new HashMap<String,String>();
	private static HashMap<String, String> variables = new HashMap<String,String>();
	  private static HashMap<String, String> functores = new HashMap<String,String>();
	  private static HashMap<String, String> predicados = new HashMap<String,String>();
	  private static int nombre=0;
	  private static int variable=0;
	  private static int functor=0;
	  private static int predicado=0;
	
    public static void main( String[] args )
    {
		
		for(int i=0;i<args.length;i++){
			System.out.print("En: "+i+" : "+args[i]+"|");
		}
		System.out.println();
		int columna=0;
		String comand = args[columna];
		if (comand.equals("-s")){
			columna++;
			s=true;
			System.out.println("S Selected");
		} else if(comand.equals("-o")){
			columna++;
			o=true;
			System.out.println("O Selected");
		} else if(comand.equals("-p")){
			columna++;
			p=true;
			System.out.println("P Selected");
		}
		
        boolean verificador = false;
        for(int i = columna; i < args.length; i++){
            try {
				if(o){
				FileReader fs = new FileReader(args[columna]);
				BufferedReader bs = new BufferedReader(fs);
				String sos=bs.readLine();
				System.out.println(pretyPrinter(sos));
				escribir(args[args.length-1],sos);
				}
	
				
                FileReader fr = new FileReader(args[columna]);
                LopriorLexer lexer = new LopriorLexer(fr);
                LopriorParser parser = new LopriorParser(lexer);
                verificador = true;

                Loprior tree = (Loprior) parser.parse().value;

                LopriorPrint lp = new LopriorPrint();
                tree.accept(lp);

                System.out.println(lp.getResult());
                

            } catch (FileNotFoundException info ) {
                System.err.println("File: " + args[i] + " not found");
            } catch (IOException ioe){
                System.err.println("IOException: " + args[i]);
            } catch (Exception e){
                verificador = false;
                System.err.println("File: " + args[i] + " Parser: " + false);
            }

            if(verificador == true && !s && !o) System.out.println("File: " + args[i] + " Parser: " + true);

        }       
    }
	
	public static void escribir(String nombre,String ejemplo) throws IOException {
        String ruta;
		String nom=nombre.substring(0,(nombre.length()-4));
        ruta = nom+".lpof";
        File archivo = new File(ruta);
        BufferedWriter bw;
        if(archivo.exists()){
            bw = new BufferedWriter(new FileWriter(archivo));
            bw.write(pretyPrinter(ejemplo));
        }
        else {
            bw = new BufferedWriter(new FileWriter(archivo));
            bw.write(pretyPrinter(ejemplo));
        }
        bw.close();
    }

	
	 public static String pretyPrinter(String s){
    String respuesta="";
    for (int n = 0; n <s.length (); n++) { 
      char c = s.charAt (n);
      switch(c) {
        case '$':
          respuesta+="\u2200";
          break;
        case '&':
         respuesta+="\u2203";
          break;
        case '!':
         respuesta+="\u00AC";
          break;
        case '>':
         respuesta+="\u2192";
          break;
        case '<':
          respuesta+="\u2194";
          n++;
          break;
        case '*':
         respuesta+="\u2227";
          break;
        case '+':
         respuesta+="\u2228";
          break;
        case ',':
          respuesta+=",";
        break;
        case '(':
          respuesta+="(";
        break;
        case ')':
          respuesta+=")";
        break;
        case 'a':
        case 'b':
        case 'c':
        case 'd':
        case 'e':
        case 'x':
        case 'y':
        case 'z':
         String lol=termino(s.substring(n));
          if(lol.length()>0){
            if(lol.charAt(0)=='x'||lol.charAt(0)=='y'||lol.charAt(0)=='z'){
                respuesta+=variables.get(lol);
            }else{
                respuesta+=nombres.get(lol);
            }
          }
          n+=(lol.length()-1);
        break;
        case 'P':
        case 'f':
        String lel=terminos(s.substring(n));
        if(lel.length()>0){
            if(lel.charAt(0)=='P'){
                respuesta+=predicados.get(lel);
            }else{
                respuesta+=functores.get(lel);
            }
          }
          n+=(lel.length()-1);
          break;
        default:
      }
    } 
    return respuesta;
  }

  public static boolean verificar(char c){
    return c=='a'||c=='b'||c=='c'||c=='d'||c=='e'||c=='f'||c=='g'||c=='h'||c=='i'||c=='j'
            ||c=='k'||c=='l'||c=='m'||c=='n'||c=='o'||c=='p'||c=='q'||c=='r'||c=='s'||c=='t'
            ||c=='u'||c=='v'||c=='x'||c=='y'||c=='z'||c=='1'||c=='2'||c=='3'||c=='4'
            ||c=='5'||c=='6'||c=='7'||c=='8'||c=='9'||c=='0'||c=='w';
  }
  
  public static String terminos(String s){
    String respuesta="";
    String termFunctor="";
    String termPredicado="";
    int n = 0;
    char c = s.charAt(n);
    switch(c) {
      case 'f':
      int ast=1;
      boolean finNombre=false;
      n++;
      termFunctor+=c;
      c = s.charAt(n);
      while(c!=')'){
        if (c==','){
            ast++;
        }
        if(c=='('){
            finNombre=true;
        }
        if(!finNombre){
            termFunctor+=c;
        }
        n++;
        c = s.charAt(n);
      }
      if(functores.get(termFunctor)==null){
        functor++;
        String f="f";
        for(int i=0;i<ast;i++){
          f+="*";
        }
        for(int i=0;i<functor;i++){
          f+="'";
        }
        functores.put(termFunctor,f);
        return termFunctor;
      }else{
        return termFunctor;
      }

      case 'P':
      int aster=1;
      boolean finNombreP=false;
      n++;
      termPredicado+=c;
      c = s.charAt(n);
      while(c!=')'){
        if (c==','){
            aster++;
        }
        if(c=='('){
            finNombreP=true;
        }
        if(!finNombreP){
            termPredicado+=c;
        }
        n++;
        c = s.charAt(n);
      }
      if(predicados.get(termPredicado)==null){
        predicado++;
        String p="P";
        for(int i=0;i<aster;i++){
          p+="*";
        }
        for(int i=0;i<predicado;i++){
          p+="'";
        }
        predicados.put(termPredicado,p);
        return termPredicado;
      }else{
        return termPredicado;
      }
       
    }
    
    return respuesta;
  }
  public static String termino(String s){
    String respuesta="";
    String termNombre="";
    String termVariable="";
    int n = 0;
    char c = s.charAt(n);
    switch(c) {
      case 'a':
      case 'b':
      case 'c':
      case 'd':
      case 'e':
      n++;
      termNombre+=c;
      c = s.charAt(n);
      while(verificar(c)){
        termNombre+=c;
        n++;
        c = s.charAt(n);
      }
      if(nombres.get(termNombre)==null){
        nombre++;
        String a="a";
        for(int i=0;i<nombre;i++){
          a+="'";
        }
        nombres.put(termNombre,a);
        return termNombre;
      }else{
        return termNombre;
      }

      case 'x':
      case 'y':
      case 'z':
      termVariable+=""+c;
      n++;
      c = s.charAt(n);
      while(verificar(c)){
        termVariable+=""+c;
        n++;
        c = s.charAt(n);
      }
      if(variables.get(termVariable)==null){
        variable++;
        String x="x";
        for(int i=0;i<variable;i++){
          x+="'";
        }
        variables.put(termVariable,x);
        return termVariable;
      } else {
        return termVariable;
      }
    }
    
    return respuesta;
  }

    
}