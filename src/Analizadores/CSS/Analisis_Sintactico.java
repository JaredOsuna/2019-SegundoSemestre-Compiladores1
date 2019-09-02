
//----------------------------------------------------
// The following code was generated by CUP v0.11b 20160615 (GIT 4ac7450)
//----------------------------------------------------

package Analizadores.CSS;

import java_cup.runtime.Symbol;
import Estructuras.Cola;
import java.util.ArrayList;
import Modelos.*;
import java_cup.runtime.XMLElement;

/** CUP v0.11b 20160615 (GIT 4ac7450) generated parser.
  */
@SuppressWarnings({"rawtypes"})
public class Analisis_Sintactico extends java_cup.runtime.lr_parser {

 public final Class getSymbolContainer() {
    return Simbolos.class;
}

  /** Default constructor. */
  @Deprecated
  public Analisis_Sintactico() {super();}

  /** Constructor which sets the default scanner. */
  @Deprecated
  public Analisis_Sintactico(java_cup.runtime.Scanner s) {super(s);}

  /** Constructor which sets the default scanner. */
  public Analisis_Sintactico(java_cup.runtime.Scanner s, java_cup.runtime.SymbolFactory sf) {super(s,sf);}

  /** Production table. */
  protected static final short _production_table[][] = 
    unpackFromStrings(new String[] {
    "\000\045\000\002\002\004\000\002\002\003\000\002\003" +
    "\004\000\002\003\003\000\002\004\004\000\002\004\004" +
    "\000\002\005\005\000\002\007\004\000\002\007\003\000" +
    "\002\006\006\000\002\006\006\000\002\006\006\000\002" +
    "\006\006\000\002\006\006\000\002\006\006\000\002\006" +
    "\006\000\002\006\006\000\002\006\006\000\002\006\006" +
    "\000\002\010\012\000\002\010\003\000\002\011\003\000" +
    "\002\011\003\000\002\011\003\000\002\011\003\000\002" +
    "\011\003\000\002\011\003\000\002\011\003\000\002\011" +
    "\003\000\002\011\003\000\002\011\003\000\002\011\003" +
    "\000\002\011\003\000\002\011\003\000\002\012\003\000" +
    "\002\012\003\000\002\012\003" });

  /** Access to production table. */
  public short[][] production_table() {return _production_table;}

  /** Parse-action table. */
  protected static final short[][] _action_table = 
    unpackFromStrings(new String[] {
    "\000\120\000\006\031\006\032\007\001\002\000\010\002" +
    "\ufffe\031\ufffe\032\ufffe\001\002\000\004\002\122\001\002" +
    "\000\004\010\012\001\002\000\004\010\012\001\002\000" +
    "\010\002\000\031\006\032\007\001\002\000\010\002\uffff" +
    "\031\uffff\032\uffff\001\002\000\026\013\015\014\022\015" +
    "\021\016\014\017\024\020\020\021\027\022\025\023\026" +
    "\024\016\001\002\000\010\002\ufffc\031\ufffc\032\ufffc\001" +
    "\002\000\004\007\116\001\002\000\004\007\113\001\002" +
    "\000\004\007\110\001\002\000\030\011\ufff9\013\ufff9\014" +
    "\ufff9\015\ufff9\016\ufff9\017\ufff9\020\ufff9\021\ufff9\022\ufff9" +
    "\023\ufff9\024\ufff9\001\002\000\004\007\105\001\002\000" +
    "\004\007\102\001\002\000\004\007\077\001\002\000\030" +
    "\011\075\013\015\014\022\015\021\016\014\017\024\020" +
    "\020\021\027\022\025\023\026\024\016\001\002\000\004" +
    "\007\067\001\002\000\004\007\036\001\002\000\004\007" +
    "\033\001\002\000\004\007\030\001\002\000\004\026\031" +
    "\001\002\000\004\006\032\001\002\000\030\011\ufff2\013" +
    "\ufff2\014\ufff2\015\ufff2\016\ufff2\017\ufff2\020\ufff2\021\ufff2" +
    "\022\ufff2\023\ufff2\024\ufff2\001\002\000\004\026\034\001" +
    "\002\000\004\006\035\001\002\000\030\011\ufff0\013\ufff0" +
    "\014\ufff0\015\ufff0\016\ufff0\017\ufff0\020\ufff0\021\ufff0\022" +
    "\ufff0\023\ufff0\024\ufff0\001\002\000\036\025\051\030\043" +
    "\034\041\035\050\036\045\037\052\040\053\041\056\042" +
    "\042\043\054\044\047\045\046\046\055\047\040\001\002" +
    "\000\004\006\066\001\002\000\010\005\uffe1\006\uffe1\012" +
    "\uffe1\001\002\000\010\005\uffec\006\uffec\012\uffec\001\002" +
    "\000\010\005\uffe6\006\uffe6\012\uffe6\001\002\000\010\005" +
    "\uffe0\006\uffe0\012\uffe0\001\002\000\004\006\uffed\001\002" +
    "\000\010\005\uffea\006\uffea\012\uffea\001\002\000\010\005" +
    "\uffe3\006\uffe3\012\uffe3\001\002\000\010\005\uffe4\006\uffe4" +
    "\012\uffe4\001\002\000\010\005\uffeb\006\uffeb\012\uffeb\001" +
    "\002\000\004\004\057\001\002\000\010\005\uffe9\006\uffe9" +
    "\012\uffe9\001\002\000\010\005\uffe8\006\uffe8\012\uffe8\001" +
    "\002\000\010\005\uffe5\006\uffe5\012\uffe5\001\002\000\010" +
    "\005\uffe2\006\uffe2\012\uffe2\001\002\000\010\005\uffe7\006" +
    "\uffe7\012\uffe7\001\002\000\034\030\043\034\041\035\050" +
    "\036\045\037\052\040\053\041\056\042\042\043\054\044" +
    "\047\045\046\046\055\047\040\001\002\000\004\012\061" +
    "\001\002\000\034\030\043\034\041\035\050\036\045\037" +
    "\052\040\053\041\056\042\042\043\054\044\047\045\046" +
    "\046\055\047\040\001\002\000\004\012\063\001\002\000" +
    "\034\030\043\034\041\035\050\036\045\037\052\040\053" +
    "\041\056\042\042\043\054\044\047\045\046\046\055\047" +
    "\040\001\002\000\004\005\065\001\002\000\004\006\uffee" +
    "\001\002\000\030\011\ufff1\013\ufff1\014\ufff1\015\ufff1\016" +
    "\ufff1\017\ufff1\020\ufff1\021\ufff1\022\ufff1\023\ufff1\024\ufff1" +
    "\001\002\000\010\050\071\051\073\052\070\001\002\000" +
    "\004\006\uffdd\001\002\000\004\006\uffde\001\002\000\004" +
    "\006\074\001\002\000\004\006\uffdf\001\002\000\030\011" +
    "\ufff4\013\ufff4\014\ufff4\015\ufff4\016\ufff4\017\ufff4\020\ufff4" +
    "\021\ufff4\022\ufff4\023\ufff4\024\ufff4\001\002\000\010\002" +
    "\ufffb\031\ufffb\032\ufffb\001\002\000\030\011\ufffa\013\ufffa" +
    "\014\ufffa\015\ufffa\016\ufffa\017\ufffa\020\ufffa\021\ufffa\022" +
    "\ufffa\023\ufffa\024\ufffa\001\002\000\004\033\100\001\002" +
    "\000\004\006\101\001\002\000\030\011\ufff8\013\ufff8\014" +
    "\ufff8\015\ufff8\016\ufff8\017\ufff8\020\ufff8\021\ufff8\022\ufff8" +
    "\023\ufff8\024\ufff8\001\002\000\036\025\051\030\043\034" +
    "\041\035\050\036\045\037\052\040\053\041\056\042\042" +
    "\043\054\044\047\045\046\046\055\047\040\001\002\000" +
    "\004\006\104\001\002\000\030\011\ufff7\013\ufff7\014\ufff7" +
    "\015\ufff7\016\ufff7\017\ufff7\020\ufff7\021\ufff7\022\ufff7\023" +
    "\ufff7\024\ufff7\001\002\000\004\027\106\001\002\000\004" +
    "\006\107\001\002\000\030\011\ufff3\013\ufff3\014\ufff3\015" +
    "\ufff3\016\ufff3\017\ufff3\020\ufff3\021\ufff3\022\ufff3\023\ufff3" +
    "\024\ufff3\001\002\000\004\026\111\001\002\000\004\006" +
    "\112\001\002\000\030\011\uffef\013\uffef\014\uffef\015\uffef" +
    "\016\uffef\017\uffef\020\uffef\021\uffef\022\uffef\023\uffef\024" +
    "\uffef\001\002\000\036\025\051\030\043\034\041\035\050" +
    "\036\045\037\052\040\053\041\056\042\042\043\054\044" +
    "\047\045\046\046\055\047\040\001\002\000\004\006\115" +
    "\001\002\000\030\011\ufff5\013\ufff5\014\ufff5\015\ufff5\016" +
    "\ufff5\017\ufff5\020\ufff5\021\ufff5\022\ufff5\023\ufff5\024\ufff5" +
    "\001\002\000\004\026\117\001\002\000\004\006\120\001" +
    "\002\000\030\011\ufff6\013\ufff6\014\ufff6\015\ufff6\016\ufff6" +
    "\017\ufff6\020\ufff6\021\ufff6\022\ufff6\023\ufff6\024\ufff6\001" +
    "\002\000\010\002\ufffd\031\ufffd\032\ufffd\001\002\000\004" +
    "\002\001\001\002" });

  /** Access to parse-action table. */
  public short[][] action_table() {return _action_table;}

  /** <code>reduce_goto</code> table. */
  protected static final short[][] _reduce_table = 
    unpackFromStrings(new String[] {
    "\000\120\000\010\002\004\003\007\004\003\001\001\000" +
    "\002\001\001\000\002\001\001\000\004\005\120\001\001" +
    "\000\004\005\012\001\001\000\004\004\010\001\001\000" +
    "\002\001\001\000\006\006\016\007\022\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\004\006\075\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\006" +
    "\010\036\011\043\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\004\011\057\001\001\000\002" +
    "\001\001\000\004\011\061\001\001\000\002\001\001\000" +
    "\004\011\063\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\004\012\071\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\006" +
    "\010\102\011\043\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\006\010\113\011\043\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001" });

  /** Access to <code>reduce_goto</code> table. */
  public short[][] reduce_table() {return _reduce_table;}

  /** Instance of action encapsulation class. */
  protected CUP$Analisis_Sintactico$actions action_obj;

  /** Action encapsulation object initializer. */
  protected void init_actions()
    {
      action_obj = new CUP$Analisis_Sintactico$actions(this);
    }

  /** Invoke a user supplied parse action. */
  public java_cup.runtime.Symbol do_action(
    int                        act_num,
    java_cup.runtime.lr_parser parser,
    java.util.Stack            stack,
    int                        top)
    throws java.lang.Exception
  {
    /* call code in generated class */
    return action_obj.CUP$Analisis_Sintactico$do_action(act_num, parser, stack, top);
  }

  /** Indicates start state. */
  public int start_state() {return 0;}
  /** Indicates start production. */
  public int start_production() {return 0;}

  /** <code>EOF</code> Symbol index. */
  public int EOF_sym() {return 0;}

  /** <code>error</code> Symbol index. */
  public int error_sym() {return 1;}



    public Cola TodosLosErrores = new Cola();

    //Metodo al que se llama automaticamente ante algun error sintactico
    public void syntax_error(Symbol s){
        String lexema = s.value.toString();
        int fila = s.right;
        int columna = s.left;
        Errores error = new Errores(lexema,fila,columna,"Token " + lexema + " No esperado", "Sintactico");
        TodosLosErrores.insertar(error);
    }

    //Metodo al que se llama en el momento en el que ya no es posible una recuperacion de errores
    public void unrecovered_syntax_error(Symbol s){

    }


/** Cup generated class to encapsulate user supplied action code.*/
@SuppressWarnings({"rawtypes", "unchecked", "unused"})
class CUP$Analisis_Sintactico$actions {


    

  private final Analisis_Sintactico parser;

  /** Constructor */
  CUP$Analisis_Sintactico$actions(Analisis_Sintactico parser) {
    this.parser = parser;
  }

  /** Method 0 with the actual generated action code for actions 0 to 300. */
  public final java_cup.runtime.Symbol CUP$Analisis_Sintactico$do_action_part00000000(
    int                        CUP$Analisis_Sintactico$act_num,
    java_cup.runtime.lr_parser CUP$Analisis_Sintactico$parser,
    java.util.Stack            CUP$Analisis_Sintactico$stack,
    int                        CUP$Analisis_Sintactico$top)
    throws java.lang.Exception
    {
      /* Symbol object for return from actions */
      java_cup.runtime.Symbol CUP$Analisis_Sintactico$result;

      /* select the action based on the action number */
      switch (CUP$Analisis_Sintactico$act_num)
        {
          /*. . . . . . . . . . . . . . . . . . . .*/
          case 0: // $START ::= S EOF 
            {
              Object RESULT =null;
		int start_valleft = ((java_cup.runtime.Symbol)CUP$Analisis_Sintactico$stack.elementAt(CUP$Analisis_Sintactico$top-1)).left;
		int start_valright = ((java_cup.runtime.Symbol)CUP$Analisis_Sintactico$stack.elementAt(CUP$Analisis_Sintactico$top-1)).right;
		Object start_val = (Object)((java_cup.runtime.Symbol) CUP$Analisis_Sintactico$stack.elementAt(CUP$Analisis_Sintactico$top-1)).value;
		RESULT = start_val;
              CUP$Analisis_Sintactico$result = parser.getSymbolFactory().newSymbol("$START",0, ((java_cup.runtime.Symbol)CUP$Analisis_Sintactico$stack.elementAt(CUP$Analisis_Sintactico$top-1)), ((java_cup.runtime.Symbol)CUP$Analisis_Sintactico$stack.peek()), RESULT);
            }
          /* ACCEPT */
          CUP$Analisis_Sintactico$parser.done_parsing();
          return CUP$Analisis_Sintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 1: // S ::= INICIO 
            {
              Object RESULT =null;

              CUP$Analisis_Sintactico$result = parser.getSymbolFactory().newSymbol("S",0, ((java_cup.runtime.Symbol)CUP$Analisis_Sintactico$stack.peek()), ((java_cup.runtime.Symbol)CUP$Analisis_Sintactico$stack.peek()), RESULT);
            }
          return CUP$Analisis_Sintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 2: // INICIO ::= INICIO CARACTERISTICA 
            {
              Object RESULT =null;

              CUP$Analisis_Sintactico$result = parser.getSymbolFactory().newSymbol("INICIO",1, ((java_cup.runtime.Symbol)CUP$Analisis_Sintactico$stack.elementAt(CUP$Analisis_Sintactico$top-1)), ((java_cup.runtime.Symbol)CUP$Analisis_Sintactico$stack.peek()), RESULT);
            }
          return CUP$Analisis_Sintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 3: // INICIO ::= CARACTERISTICA 
            {
              Object RESULT =null;

              CUP$Analisis_Sintactico$result = parser.getSymbolFactory().newSymbol("INICIO",1, ((java_cup.runtime.Symbol)CUP$Analisis_Sintactico$stack.peek()), ((java_cup.runtime.Symbol)CUP$Analisis_Sintactico$stack.peek()), RESULT);
            }
          return CUP$Analisis_Sintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 4: // CARACTERISTICA ::= identificador CUERPO 
            {
              Object RESULT =null;

              CUP$Analisis_Sintactico$result = parser.getSymbolFactory().newSymbol("CARACTERISTICA",2, ((java_cup.runtime.Symbol)CUP$Analisis_Sintactico$stack.elementAt(CUP$Analisis_Sintactico$top-1)), ((java_cup.runtime.Symbol)CUP$Analisis_Sintactico$stack.peek()), RESULT);
            }
          return CUP$Analisis_Sintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 5: // CARACTERISTICA ::= subidentificador CUERPO 
            {
              Object RESULT =null;

              CUP$Analisis_Sintactico$result = parser.getSymbolFactory().newSymbol("CARACTERISTICA",2, ((java_cup.runtime.Symbol)CUP$Analisis_Sintactico$stack.elementAt(CUP$Analisis_Sintactico$top-1)), ((java_cup.runtime.Symbol)CUP$Analisis_Sintactico$stack.peek()), RESULT);
            }
          return CUP$Analisis_Sintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 6: // CUERPO ::= llaveA L_OPCIONES llaveC 
            {
              Object RESULT =null;

              CUP$Analisis_Sintactico$result = parser.getSymbolFactory().newSymbol("CUERPO",3, ((java_cup.runtime.Symbol)CUP$Analisis_Sintactico$stack.elementAt(CUP$Analisis_Sintactico$top-2)), ((java_cup.runtime.Symbol)CUP$Analisis_Sintactico$stack.peek()), RESULT);
            }
          return CUP$Analisis_Sintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 7: // L_OPCIONES ::= L_OPCIONES OPCIONES 
            {
              Object RESULT =null;

              CUP$Analisis_Sintactico$result = parser.getSymbolFactory().newSymbol("L_OPCIONES",5, ((java_cup.runtime.Symbol)CUP$Analisis_Sintactico$stack.elementAt(CUP$Analisis_Sintactico$top-1)), ((java_cup.runtime.Symbol)CUP$Analisis_Sintactico$stack.peek()), RESULT);
            }
          return CUP$Analisis_Sintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 8: // L_OPCIONES ::= OPCIONES 
            {
              Object RESULT =null;

              CUP$Analisis_Sintactico$result = parser.getSymbolFactory().newSymbol("L_OPCIONES",5, ((java_cup.runtime.Symbol)CUP$Analisis_Sintactico$stack.peek()), ((java_cup.runtime.Symbol)CUP$Analisis_Sintactico$stack.peek()), RESULT);
            }
          return CUP$Analisis_Sintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 9: // OPCIONES ::= border dosPuntos booleano puntoComa 
            {
              Object RESULT =null;

              CUP$Analisis_Sintactico$result = parser.getSymbolFactory().newSymbol("OPCIONES",4, ((java_cup.runtime.Symbol)CUP$Analisis_Sintactico$stack.elementAt(CUP$Analisis_Sintactico$top-3)), ((java_cup.runtime.Symbol)CUP$Analisis_Sintactico$stack.peek()), RESULT);
            }
          return CUP$Analisis_Sintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 10: // OPCIONES ::= borderColor dosPuntos TIPOSCOLOR puntoComa 
            {
              Object RESULT =null;

              CUP$Analisis_Sintactico$result = parser.getSymbolFactory().newSymbol("OPCIONES",4, ((java_cup.runtime.Symbol)CUP$Analisis_Sintactico$stack.elementAt(CUP$Analisis_Sintactico$top-3)), ((java_cup.runtime.Symbol)CUP$Analisis_Sintactico$stack.peek()), RESULT);
            }
          return CUP$Analisis_Sintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 11: // OPCIONES ::= borderWidth dosPuntos numero puntoComa 
            {
              Object RESULT =null;

              CUP$Analisis_Sintactico$result = parser.getSymbolFactory().newSymbol("OPCIONES",4, ((java_cup.runtime.Symbol)CUP$Analisis_Sintactico$stack.elementAt(CUP$Analisis_Sintactico$top-3)), ((java_cup.runtime.Symbol)CUP$Analisis_Sintactico$stack.peek()), RESULT);
            }
          return CUP$Analisis_Sintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 12: // OPCIONES ::= background dosPuntos TIPOSCOLOR puntoComa 
            {
              Object RESULT =null;

              CUP$Analisis_Sintactico$result = parser.getSymbolFactory().newSymbol("OPCIONES",4, ((java_cup.runtime.Symbol)CUP$Analisis_Sintactico$stack.elementAt(CUP$Analisis_Sintactico$top-3)), ((java_cup.runtime.Symbol)CUP$Analisis_Sintactico$stack.peek()), RESULT);
            }
          return CUP$Analisis_Sintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 13: // OPCIONES ::= align dosPuntos ALINEACION puntoComa 
            {
              Object RESULT =null;

              CUP$Analisis_Sintactico$result = parser.getSymbolFactory().newSymbol("OPCIONES",4, ((java_cup.runtime.Symbol)CUP$Analisis_Sintactico$stack.elementAt(CUP$Analisis_Sintactico$top-3)), ((java_cup.runtime.Symbol)CUP$Analisis_Sintactico$stack.peek()), RESULT);
            }
          return CUP$Analisis_Sintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 14: // OPCIONES ::= font dosPuntos cadena puntoComa 
            {
              Object RESULT =null;

              CUP$Analisis_Sintactico$result = parser.getSymbolFactory().newSymbol("OPCIONES",4, ((java_cup.runtime.Symbol)CUP$Analisis_Sintactico$stack.elementAt(CUP$Analisis_Sintactico$top-3)), ((java_cup.runtime.Symbol)CUP$Analisis_Sintactico$stack.peek()), RESULT);
            }
          return CUP$Analisis_Sintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 15: // OPCIONES ::= fontSize dosPuntos numero puntoComa 
            {
              Object RESULT =null;

              CUP$Analisis_Sintactico$result = parser.getSymbolFactory().newSymbol("OPCIONES",4, ((java_cup.runtime.Symbol)CUP$Analisis_Sintactico$stack.elementAt(CUP$Analisis_Sintactico$top-3)), ((java_cup.runtime.Symbol)CUP$Analisis_Sintactico$stack.peek()), RESULT);
            }
          return CUP$Analisis_Sintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 16: // OPCIONES ::= fontColor dosPuntos TIPOSCOLOR puntoComa 
            {
              Object RESULT =null;

              CUP$Analisis_Sintactico$result = parser.getSymbolFactory().newSymbol("OPCIONES",4, ((java_cup.runtime.Symbol)CUP$Analisis_Sintactico$stack.elementAt(CUP$Analisis_Sintactico$top-3)), ((java_cup.runtime.Symbol)CUP$Analisis_Sintactico$stack.peek()), RESULT);
            }
          return CUP$Analisis_Sintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 17: // OPCIONES ::= hight dosPuntos numero puntoComa 
            {
              Object RESULT =null;

              CUP$Analisis_Sintactico$result = parser.getSymbolFactory().newSymbol("OPCIONES",4, ((java_cup.runtime.Symbol)CUP$Analisis_Sintactico$stack.elementAt(CUP$Analisis_Sintactico$top-3)), ((java_cup.runtime.Symbol)CUP$Analisis_Sintactico$stack.peek()), RESULT);
            }
          return CUP$Analisis_Sintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 18: // OPCIONES ::= width dosPuntos numero puntoComa 
            {
              Object RESULT =null;

              CUP$Analisis_Sintactico$result = parser.getSymbolFactory().newSymbol("OPCIONES",4, ((java_cup.runtime.Symbol)CUP$Analisis_Sintactico$stack.elementAt(CUP$Analisis_Sintactico$top-3)), ((java_cup.runtime.Symbol)CUP$Analisis_Sintactico$stack.peek()), RESULT);
            }
          return CUP$Analisis_Sintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 19: // TIPOSCOLOR ::= rgb parentesisA COLORES coma COLORES coma COLORES parentesisC 
            {
              Object RESULT =null;

              CUP$Analisis_Sintactico$result = parser.getSymbolFactory().newSymbol("TIPOSCOLOR",6, ((java_cup.runtime.Symbol)CUP$Analisis_Sintactico$stack.elementAt(CUP$Analisis_Sintactico$top-7)), ((java_cup.runtime.Symbol)CUP$Analisis_Sintactico$stack.peek()), RESULT);
            }
          return CUP$Analisis_Sintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 20: // TIPOSCOLOR ::= COLORES 
            {
              Object RESULT =null;

              CUP$Analisis_Sintactico$result = parser.getSymbolFactory().newSymbol("TIPOSCOLOR",6, ((java_cup.runtime.Symbol)CUP$Analisis_Sintactico$stack.peek()), ((java_cup.runtime.Symbol)CUP$Analisis_Sintactico$stack.peek()), RESULT);
            }
          return CUP$Analisis_Sintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 21: // COLORES ::= red 
            {
              Object RESULT =null;

              CUP$Analisis_Sintactico$result = parser.getSymbolFactory().newSymbol("COLORES",7, ((java_cup.runtime.Symbol)CUP$Analisis_Sintactico$stack.peek()), ((java_cup.runtime.Symbol)CUP$Analisis_Sintactico$stack.peek()), RESULT);
            }
          return CUP$Analisis_Sintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 22: // COLORES ::= pink 
            {
              Object RESULT =null;

              CUP$Analisis_Sintactico$result = parser.getSymbolFactory().newSymbol("COLORES",7, ((java_cup.runtime.Symbol)CUP$Analisis_Sintactico$stack.peek()), ((java_cup.runtime.Symbol)CUP$Analisis_Sintactico$stack.peek()), RESULT);
            }
          return CUP$Analisis_Sintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 23: // COLORES ::= orange 
            {
              Object RESULT =null;

              CUP$Analisis_Sintactico$result = parser.getSymbolFactory().newSymbol("COLORES",7, ((java_cup.runtime.Symbol)CUP$Analisis_Sintactico$stack.peek()), ((java_cup.runtime.Symbol)CUP$Analisis_Sintactico$stack.peek()), RESULT);
            }
          return CUP$Analisis_Sintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 24: // COLORES ::= yellow 
            {
              Object RESULT =null;

              CUP$Analisis_Sintactico$result = parser.getSymbolFactory().newSymbol("COLORES",7, ((java_cup.runtime.Symbol)CUP$Analisis_Sintactico$stack.peek()), ((java_cup.runtime.Symbol)CUP$Analisis_Sintactico$stack.peek()), RESULT);
            }
          return CUP$Analisis_Sintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 25: // COLORES ::= purple 
            {
              Object RESULT =null;

              CUP$Analisis_Sintactico$result = parser.getSymbolFactory().newSymbol("COLORES",7, ((java_cup.runtime.Symbol)CUP$Analisis_Sintactico$stack.peek()), ((java_cup.runtime.Symbol)CUP$Analisis_Sintactico$stack.peek()), RESULT);
            }
          return CUP$Analisis_Sintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 26: // COLORES ::= magenta 
            {
              Object RESULT =null;

              CUP$Analisis_Sintactico$result = parser.getSymbolFactory().newSymbol("COLORES",7, ((java_cup.runtime.Symbol)CUP$Analisis_Sintactico$stack.peek()), ((java_cup.runtime.Symbol)CUP$Analisis_Sintactico$stack.peek()), RESULT);
            }
          return CUP$Analisis_Sintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 27: // COLORES ::= green 
            {
              Object RESULT =null;

              CUP$Analisis_Sintactico$result = parser.getSymbolFactory().newSymbol("COLORES",7, ((java_cup.runtime.Symbol)CUP$Analisis_Sintactico$stack.peek()), ((java_cup.runtime.Symbol)CUP$Analisis_Sintactico$stack.peek()), RESULT);
            }
          return CUP$Analisis_Sintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 28: // COLORES ::= blue 
            {
              Object RESULT =null;

              CUP$Analisis_Sintactico$result = parser.getSymbolFactory().newSymbol("COLORES",7, ((java_cup.runtime.Symbol)CUP$Analisis_Sintactico$stack.peek()), ((java_cup.runtime.Symbol)CUP$Analisis_Sintactico$stack.peek()), RESULT);
            }
          return CUP$Analisis_Sintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 29: // COLORES ::= brown 
            {
              Object RESULT =null;

              CUP$Analisis_Sintactico$result = parser.getSymbolFactory().newSymbol("COLORES",7, ((java_cup.runtime.Symbol)CUP$Analisis_Sintactico$stack.peek()), ((java_cup.runtime.Symbol)CUP$Analisis_Sintactico$stack.peek()), RESULT);
            }
          return CUP$Analisis_Sintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 30: // COLORES ::= white 
            {
              Object RESULT =null;

              CUP$Analisis_Sintactico$result = parser.getSymbolFactory().newSymbol("COLORES",7, ((java_cup.runtime.Symbol)CUP$Analisis_Sintactico$stack.peek()), ((java_cup.runtime.Symbol)CUP$Analisis_Sintactico$stack.peek()), RESULT);
            }
          return CUP$Analisis_Sintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 31: // COLORES ::= gray 
            {
              Object RESULT =null;

              CUP$Analisis_Sintactico$result = parser.getSymbolFactory().newSymbol("COLORES",7, ((java_cup.runtime.Symbol)CUP$Analisis_Sintactico$stack.peek()), ((java_cup.runtime.Symbol)CUP$Analisis_Sintactico$stack.peek()), RESULT);
            }
          return CUP$Analisis_Sintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 32: // COLORES ::= black 
            {
              Object RESULT =null;

              CUP$Analisis_Sintactico$result = parser.getSymbolFactory().newSymbol("COLORES",7, ((java_cup.runtime.Symbol)CUP$Analisis_Sintactico$stack.peek()), ((java_cup.runtime.Symbol)CUP$Analisis_Sintactico$stack.peek()), RESULT);
            }
          return CUP$Analisis_Sintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 33: // COLORES ::= hexadecimal 
            {
              Object RESULT =null;

              CUP$Analisis_Sintactico$result = parser.getSymbolFactory().newSymbol("COLORES",7, ((java_cup.runtime.Symbol)CUP$Analisis_Sintactico$stack.peek()), ((java_cup.runtime.Symbol)CUP$Analisis_Sintactico$stack.peek()), RESULT);
            }
          return CUP$Analisis_Sintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 34: // ALINEACION ::= ALIleft 
            {
              Object RESULT =null;

              CUP$Analisis_Sintactico$result = parser.getSymbolFactory().newSymbol("ALINEACION",8, ((java_cup.runtime.Symbol)CUP$Analisis_Sintactico$stack.peek()), ((java_cup.runtime.Symbol)CUP$Analisis_Sintactico$stack.peek()), RESULT);
            }
          return CUP$Analisis_Sintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 35: // ALINEACION ::= ALIright 
            {
              Object RESULT =null;

              CUP$Analisis_Sintactico$result = parser.getSymbolFactory().newSymbol("ALINEACION",8, ((java_cup.runtime.Symbol)CUP$Analisis_Sintactico$stack.peek()), ((java_cup.runtime.Symbol)CUP$Analisis_Sintactico$stack.peek()), RESULT);
            }
          return CUP$Analisis_Sintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 36: // ALINEACION ::= ALIcenter 
            {
              Object RESULT =null;

              CUP$Analisis_Sintactico$result = parser.getSymbolFactory().newSymbol("ALINEACION",8, ((java_cup.runtime.Symbol)CUP$Analisis_Sintactico$stack.peek()), ((java_cup.runtime.Symbol)CUP$Analisis_Sintactico$stack.peek()), RESULT);
            }
          return CUP$Analisis_Sintactico$result;

          /* . . . . . .*/
          default:
            throw new Exception(
               "Invalid action number "+CUP$Analisis_Sintactico$act_num+"found in internal parse table");

        }
    } /* end of method */

  /** Method splitting the generated action code into several parts. */
  public final java_cup.runtime.Symbol CUP$Analisis_Sintactico$do_action(
    int                        CUP$Analisis_Sintactico$act_num,
    java_cup.runtime.lr_parser CUP$Analisis_Sintactico$parser,
    java.util.Stack            CUP$Analisis_Sintactico$stack,
    int                        CUP$Analisis_Sintactico$top)
    throws java.lang.Exception
    {
              return CUP$Analisis_Sintactico$do_action_part00000000(
                               CUP$Analisis_Sintactico$act_num,
                               CUP$Analisis_Sintactico$parser,
                               CUP$Analisis_Sintactico$stack,
                               CUP$Analisis_Sintactico$top);
    }
}

}
