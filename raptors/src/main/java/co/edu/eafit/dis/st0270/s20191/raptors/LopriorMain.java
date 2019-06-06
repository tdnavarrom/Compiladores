package co.edu.eafit.dis.st0270.s20191.raptors;

import co.edu.eafit.dis.st0270.s20191.raptors.parser.LopriorParser;
import co.edu.eafit.dis.st0270.s20191.raptors.visitors.LopriorPrint;
import co.edu.eafit.dis.st0270.s20191.raptors.abs.Loprior;
import co.edu.eafit.dis.st0270.s20191.raptors.flex.LopriorLexer;

import java.io.FileReader;
import java.io.FileNotFoundException;
import java.io.IOException;


public class LopriorMain {
	public static boolean s = false;
	public static boolean p = false;
	public static boolean o = false;
	
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
    
}