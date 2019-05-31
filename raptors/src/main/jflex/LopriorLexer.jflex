package co.edu.eafit.dis.st0270.s20191.raptors.flex;

import co.edu.eafit.dis.st0270.s20191.raptors.parser.LopriorSymbol;
import java_cup.runtime.Symbol;

%%
%class LopriorLexer
%public
%cup
%line
%column


startf = f
startn = [abcde]
startv = [xyz]
startp = [A-Z]

min = [a-z]
digit = [0-9]

mindigit = ({min} | {digit})*
maxdigit = ({startp} | {digit})*

%%


{startf}{mindigit} {     System.out.println("Lexer: " + yytext());
                    return new Symbol(LopriorSymbol.FUNCTOR, yytext()); }
{startn}{mindigit} {     System.out.println("Lexer: " + yytext());
                    return new Symbol(LopriorSymbol.NOMBRE, yytext()); }
{startv}{mindigit} {     System.out.println("Lexer: " + yytext());
                    return new Symbol(LopriorSymbol.VARIABLE, yytext()); }    
{startp}{maxdigit} {     System.out.println("Lexer: " + yytext());
                    return new Symbol(LopriorSymbol.PREDICADO, yytext()); }                                                  
.             {return new Symbol(LopriorSymbol.error);             }
<<EOF>>       {return new Symbol(LopriorSymbol.EOF);               }
