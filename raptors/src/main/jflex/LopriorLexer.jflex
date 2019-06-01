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
s_for_all = "$"
s_exist = "&"
s_negation = "!"
s_then = ">"
s_bithen = "<>"
s_and = "+"
s_or = "*"
s_comma = ","
lparen  = "("
rparen  = ")"



min = [a-z]
digit = [0-9]

mindigit = ({min} | {digit})*
maxdigit = ({startp} | {digit})*

LineTerminator = \r|\n|\r\n
WhiteSpace     = {LineTerminator} | [ \t\n]

%%

{lparen}           { return new Symbol(LopriorSymbol.LPAREN, yytext());    }
{rparen}           { return new Symbol(LopriorSymbol.RPAREN, yytext());    }
{s_for_all}        { return new Symbol(LopriorSymbol.FORALL, yytext());    }
{s_exist}          { return new Symbol(LopriorSymbol.EXIST, yytext());     }
{s_negation}       { return new Symbol(LopriorSymbol.NEGATION, yytext());  }
{startv}{mindigit} { return new Symbol(LopriorSymbol.VARIABLE, yytext());  } 
{startp}{maxdigit} { return new Symbol(LopriorSymbol.PREDICADO, yytext()); }
{s_then}           { return new Symbol(LopriorSymbol.THEN, yytext());      }
{s_bithen}         { return new Symbol(LopriorSymbol.BITHEN, yytext());    }
{s_and}            { return new Symbol(LopriorSymbol.AND, yytext());       }
{s_or}             { return new Symbol(LopriorSymbol.OR, yytext());        }
{s_comma}          { return new Symbol(LopriorSymbol.SEPARATOR, yytext()); }
{startf}{mindigit} { return new Symbol(LopriorSymbol.FUNCTOR, yytext());   }
{startn}{mindigit} { return new Symbol(LopriorSymbol.NOMBRE, yytext());    }
   
                                                 
{WhiteSpace}       {                                                       }
.                  { return new Symbol(LopriorSymbol.error);               }
<<EOF>>            { return new Symbol(LopriorSymbol.EOF);                 }
