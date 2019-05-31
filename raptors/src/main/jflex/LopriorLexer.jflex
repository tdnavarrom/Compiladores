package co.edu.eafit.dis.st0270.s20191.raptors.flex;

import co.edu.eafit.dis.st0270.s20191.raptors.parser.LopriorSymbol;
import java_cup.runtime.Symbol;

%%
%class LopriorLexer
%public
%cup
%line
%column


start = f
rest = [abc]*
%%


{start}{rest} {return new Symbol(LopriorSymbol.FUNCTOR, yytext()); }
.             {return new Symbol(LopriorSymbol.error);             }
<<EOF>>       {return new Symbol(LopriorSymbol.EOF);               }
