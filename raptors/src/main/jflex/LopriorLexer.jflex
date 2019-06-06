package co.edu.eafit.dis.st0270.s20191.raptors.flex;

import co.edu.eafit.dis.st0270.s20191.raptors.parser.LopriorSymbol;
import co.edu.eafit.dis.st0270.s20191.raptors.LopriorMain;

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
s_cond = ">"
s_bicond = "<>"
s_and = "*"
s_or = "+"
s_comma = ","
lparen  = "("
rparen  = ")"
comment = "#"{com}*{LineTerminator}?

com = [^\r\n]

min = [a-z]
digit = [0-9]

mindigit = ({min} | {digit})*
maxdigit = ({startp} | {digit})*

LineTerminator = \r|\n|\r\n
WhiteSpace     = {LineTerminator} | [ \t\n]

%%

{lparen}           {LopriorMain lm= new LopriorMain(); if(lm.s)System.out.println("["+yyline+","+yycolumn+","+"associative"+",\""+yytext()+"\"]"); return new Symbol(LopriorSymbol.LPAREN, yytext());    }
{rparen}           {LopriorMain lm= new LopriorMain(); if(lm.s)System.out.println("["+yyline+","+yycolumn+","+"associative"+",\""+yytext()+"\"]"); return new Symbol(LopriorSymbol.RPAREN, yytext());    }
{s_for_all}        {LopriorMain lm= new LopriorMain(); if(lm.s)System.out.println("["+yyline+","+yycolumn+","+"quantifier"+",\""+yytext()+"\"]"); return new Symbol(LopriorSymbol.FORALL, yytext());    }
{s_exist}          {LopriorMain lm= new LopriorMain(); if(lm.s)System.out.println("["+yyline+","+yycolumn+","+"quantifier"+",\""+yytext()+"\"]"); return new Symbol(LopriorSymbol.EXIST, yytext());     }
{s_negation}       {LopriorMain lm= new LopriorMain(); if(lm.s)System.out.println("["+yyline+","+yycolumn+","+"operator"+",\""+yytext()+"\"]"); return new Symbol(LopriorSymbol.NEGATION, yytext());  }
{startv}{mindigit} {LopriorMain lm= new LopriorMain(); if(lm.s)System.out.println("["+yyline+","+yycolumn+","+"variable"+",\""+yytext()+"\"]"); return new Symbol(LopriorSymbol.VARIABLE, yytext());  } 
{startp}{maxdigit} {LopriorMain lm= new LopriorMain(); if(lm.s)System.out.println("["+yyline+","+yycolumn+","+"predicate"+",\""+yytext()+"\"]"); return new Symbol(LopriorSymbol.PREDICADO, yytext()); }
{s_cond}           {LopriorMain lm= new LopriorMain(); if(lm.s)System.out.println("["+yyline+","+yycolumn+","+"operator"+",\""+yytext()+"\"]"); return new Symbol(LopriorSymbol.COND, yytext());      }
{s_bicond}         {LopriorMain lm= new LopriorMain(); if(lm.s)System.out.println("["+yyline+","+yycolumn+","+"operator"+",\""+yytext()+"\"]"); return new Symbol(LopriorSymbol.BICOND, yytext());    }
{s_and}            {LopriorMain lm= new LopriorMain(); if(lm.s)System.out.println("["+yyline+","+yycolumn+","+"operator"+",\""+yytext()+"\"]"); return new Symbol(LopriorSymbol.AND, yytext());       }
{s_or}             {LopriorMain lm= new LopriorMain(); if(lm.s)System.out.println("["+yyline+","+yycolumn+","+"operator"+",\""+yytext()+"\"]"); return new Symbol(LopriorSymbol.OR, yytext());        }
{s_comma}          {LopriorMain lm= new LopriorMain(); if(lm.s)System.out.println("["+yyline+","+yycolumn+","+"separator"+",\""+yytext()+"\"]"); return new Symbol(LopriorSymbol.SEPARATOR, yytext()); }
{startf}{mindigit} {LopriorMain lm= new LopriorMain(); if(lm.s)System.out.println("["+yyline+","+yycolumn+","+"functor"+",\""+yytext()+"\"]"); return new Symbol(LopriorSymbol.FUNCTOR, yytext());   }
{startn}{mindigit} {LopriorMain lm= new LopriorMain(); if(lm.s)System.out.println("["+yyline+","+yycolumn+","+"name"+",\""+yytext()+"\"]"); return new Symbol(LopriorSymbol.NOMBRE, yytext());    }
   
{comment}          {                                                       }                                                
{WhiteSpace}       {                                                       }
.                  { return new Symbol(LopriorSymbol.error);               }
<<EOF>>            { return new Symbol(LopriorSymbol.EOF);                 }