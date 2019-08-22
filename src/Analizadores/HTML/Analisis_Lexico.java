/* The following code was generated by JFlex 1.7.0 */


/*--------- 1ra Area: Codigo de Usuario ---------*/

//--------> Paquetes e importaciones
package Analizadores.HTML;
import java_cup.runtime.*;
import Estructuras.Cola;
import Modelos.Errores;

/*--------- 2da Area: Opciones y Declaraciones ---------*/


/**
 * This class is a scanner generated by 
 * <a href="http://www.jflex.de/">JFlex</a> 1.7.0
 * from the specification file <tt>Lexico.jflex</tt>
 */
public class Analisis_Lexico implements java_cup.runtime.Scanner {

  /** This character denotes the end of file */
  public static final int YYEOF = -1;

  /** initial size of the lookahead buffer */
  private static final int ZZ_BUFFERSIZE = 16384;

  /** lexical states */
  public static final int YYINITIAL = 0;

  /**
   * ZZ_LEXSTATE[l] is the state in the DFA for the lexical state l
   * ZZ_LEXSTATE[l+1] is the state in the DFA for the lexical state l
   *                  at the beginning of a line
   * l is of the form l = 2*k, k a non negative integer
   */
  private static final int ZZ_LEXSTATE[] = { 
     0, 0
  };

  /** 
   * Translates characters to character classes
   */
  private static final char [] ZZ_CMAP = {
     0,  0,  0,  0,  0,  0,  0,  0,  0, 23, 23, 23, 23, 23,  0,  0, 
     0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0, 
    23,  3,  1,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  4,  0, 11, 
     0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  2,  6,  5,  0, 
     0, 13, 16,  0, 14, 12, 21,  0,  7, 15,  0,  0, 10,  9, 19, 17, 
     0,  0,  0,  0,  8, 20, 22,  0,  0, 18,  0,  0,  0,  0,  0,  0, 
     0, 13, 16,  0, 14, 12, 21,  0, 24, 15,  0,  0, 10,  9, 19, 17, 
     0,  0,  0,  0,  8, 20, 25,  0, 23, 18,  0,  0,  0,  0,  0,  0, 
     0,  0,  0,  0,  0, 23,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0, 
     0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0, 
    23,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0, 
     0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0, 
     0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0, 
     0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0, 
     0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0, 
     0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0
  };

  /** 
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\1\0\2\1\1\2\1\3\1\4\2\1\1\5\1\0"+
    "\1\6\10\0\1\7\3\0\1\10\23\0\1\11\17\0"+
    "\1\12\2\0\1\13\1\14\1\15\3\0\1\16\1\17"+
    "\2\0\1\20\1\21\1\22\1\23\1\24\1\25";

  private static int [] zzUnpackAction() {
    int [] result = new int[78];
    int offset = 0;
    offset = zzUnpackAction(ZZ_ACTION_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAction(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /** 
   * Translates a state to a row index in the transition table
   */
  private static final int [] ZZ_ROWMAP = zzUnpackRowMap();

  private static final String ZZ_ROWMAP_PACKED_0 =
    "\0\0\0\32\0\64\0\116\0\150\0\32\0\202\0\234"+
    "\0\32\0\64\0\32\0\266\0\320\0\352\0\u0104\0\u011e"+
    "\0\u0138\0\u0152\0\150\0\32\0\u016c\0\u0186\0\u01a0\0\32"+
    "\0\u01ba\0\u01d4\0\u01ee\0\u0208\0\u0222\0\u023c\0\u0256\0\u0270"+
    "\0\u028a\0\u02a4\0\u02be\0\u02d8\0\u02f2\0\u030c\0\u0326\0\u0340"+
    "\0\u035a\0\u0374\0\u038e\0\32\0\u03a8\0\u03c2\0\u03dc\0\u03f6"+
    "\0\u0410\0\u042a\0\u0444\0\u045e\0\u0478\0\u0492\0\u04ac\0\u04c6"+
    "\0\u04e0\0\u04fa\0\u0514\0\32\0\u052e\0\u0548\0\32\0\32"+
    "\0\32\0\u0562\0\u057c\0\u0596\0\32\0\32\0\u05b0\0\u05ca"+
    "\0\32\0\32\0\32\0\32\0\32\0\32";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[78];
    int offset = 0;
    offset = zzUnpackRowMap(ZZ_ROWMAP_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackRowMap(String packed, int offset, int [] result) {
    int i = 0;  /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int high = packed.charAt(i++) << 16;
      result[j++] = high | packed.charAt(i++);
    }
    return j;
  }

  /** 
   * The transition table of the DFA
   */
  private static final int [] ZZ_TRANS = zzUnpackTrans();

  private static final String ZZ_TRANS_PACKED_0 =
    "\1\2\1\3\1\4\2\2\1\5\1\6\4\2\1\7"+
    "\3\2\1\10\7\2\3\11\32\0\1\12\1\13\30\12"+
    "\3\0\1\14\3\0\1\15\1\16\2\0\1\17\2\0"+
    "\1\20\1\0\1\21\2\0\1\22\4\0\1\15\1\0"+
    "\2\23\1\24\27\23\10\0\1\25\5\0\1\26\4\0"+
    "\1\27\24\0\1\30\17\0\1\31\35\0\1\32\3\0"+
    "\1\33\34\0\1\34\21\0\1\35\10\0\1\36\7\0"+
    "\1\35\20\0\1\37\33\0\1\40\31\0\1\41\27\0"+
    "\1\42\31\0\1\43\33\0\1\44\14\0\1\45\36\0"+
    "\1\46\35\0\1\47\24\0\1\50\31\0\1\51\3\0"+
    "\1\52\36\0\1\53\36\0\1\54\2\0\1\54\16\0"+
    "\1\55\37\0\1\56\15\0\1\57\47\0\1\60\2\0"+
    "\1\60\24\0\1\61\5\0\4\45\1\62\1\0\24\45"+
    "\12\0\1\63\35\0\1\64\25\0\1\65\30\0\1\66"+
    "\35\0\1\67\32\0\1\70\35\0\1\71\34\0\1\72"+
    "\16\0\1\73\24\0\1\74\51\0\1\75\4\0\4\45"+
    "\1\76\1\0\24\45\5\0\1\77\31\0\1\100\40\0"+
    "\1\101\27\0\1\102\35\0\1\103\35\0\1\104\14\0"+
    "\1\105\40\0\1\106\31\0\1\107\31\0\1\110\15\0"+
    "\4\45\1\76\1\111\24\45\5\0\1\112\31\0\1\113"+
    "\31\0\1\114\31\0\1\115\31\0\1\116\24\0";

  private static int [] zzUnpackTrans() {
    int [] result = new int[1508];
    int offset = 0;
    offset = zzUnpackTrans(ZZ_TRANS_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackTrans(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      value--;
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /* error codes */
  private static final int ZZ_UNKNOWN_ERROR = 0;
  private static final int ZZ_NO_MATCH = 1;
  private static final int ZZ_PUSHBACK_2BIG = 2;

  /* error messages for the codes above */
  private static final String ZZ_ERROR_MSG[] = {
    "Unknown internal scanner error",
    "Error: could not match input",
    "Error: pushback value was too large"
  };

  /**
   * ZZ_ATTRIBUTE[aState] contains the attributes of state <code>aState</code>
   */
  private static final int [] ZZ_ATTRIBUTE = zzUnpackAttribute();

  private static final String ZZ_ATTRIBUTE_PACKED_0 =
    "\1\0\1\11\3\1\1\11\2\1\1\11\1\0\1\11"+
    "\10\0\1\11\3\0\1\11\23\0\1\11\17\0\1\11"+
    "\2\0\3\11\3\0\2\11\2\0\6\11";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[78];
    int offset = 0;
    offset = zzUnpackAttribute(ZZ_ATTRIBUTE_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAttribute(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }

  /** the input device */
  private java.io.Reader zzReader;

  /** the current state of the DFA */
  private int zzState;

  /** the current lexical state */
  private int zzLexicalState = YYINITIAL;

  /** this buffer contains the current text to be matched and is
      the source of the yytext() string */
  private char zzBuffer[] = new char[ZZ_BUFFERSIZE];

  /** the textposition at the last accepting state */
  private int zzMarkedPos;

  /** the current text position in the buffer */
  private int zzCurrentPos;

  /** startRead marks the beginning of the yytext() string in the buffer */
  private int zzStartRead;

  /** endRead marks the last character in the buffer, that has been read
      from input */
  private int zzEndRead;

  /** number of newlines encountered up to the start of the matched text */
  private int yyline;

  /** the number of characters up to the start of the matched text */
  private int yychar;

  /**
   * the number of characters from the last newline up to the start of the 
   * matched text
   */
  private int yycolumn;

  /** 
   * zzAtBOL == true iff the scanner is currently at the beginning of a line
   */
  private boolean zzAtBOL = true;

  /** zzAtEOF == true iff the scanner is at the EOF */
  private boolean zzAtEOF;

  /** denotes if the user-EOF-code has already been executed */
  private boolean zzEOFDone;
  
  /** 
   * The number of occupied positions in zzBuffer beyond zzEndRead.
   * When a lead/high surrogate has been read from the input stream
   * into the final zzBuffer position, this will have a value of 1;
   * otherwise, it will have a value of 0.
   */
  private int zzFinalHighSurrogate = 0;

  /* user code: */
    //--------> Codigo de Usuario en sintaxis Java
    public Cola ErroresLexicos = new Cola();



  /**
   * Creates a new scanner
   *
   * @param   in  the java.io.Reader to read input from.
   */
  public Analisis_Lexico(java.io.Reader in) {
    this.zzReader = in;
  }



  /**
   * Refills the input buffer.
   *
   * @return      <code>false</code>, iff there was new input.
   * 
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  private boolean zzRefill() throws java.io.IOException {

    /* first: make room (if you can) */
    if (zzStartRead > 0) {
      zzEndRead += zzFinalHighSurrogate;
      zzFinalHighSurrogate = 0;
      System.arraycopy(zzBuffer, zzStartRead,
                       zzBuffer, 0,
                       zzEndRead-zzStartRead);

      /* translate stored positions */
      zzEndRead-= zzStartRead;
      zzCurrentPos-= zzStartRead;
      zzMarkedPos-= zzStartRead;
      zzStartRead = 0;
    }

    /* is the buffer big enough? */
    if (zzCurrentPos >= zzBuffer.length - zzFinalHighSurrogate) {
      /* if not: blow it up */
      char newBuffer[] = new char[zzBuffer.length*2];
      System.arraycopy(zzBuffer, 0, newBuffer, 0, zzBuffer.length);
      zzBuffer = newBuffer;
      zzEndRead += zzFinalHighSurrogate;
      zzFinalHighSurrogate = 0;
    }

    /* fill the buffer with new input */
    int requested = zzBuffer.length - zzEndRead;
    int numRead = zzReader.read(zzBuffer, zzEndRead, requested);

    /* not supposed to occur according to specification of java.io.Reader */
    if (numRead == 0) {
      throw new java.io.IOException("Reader returned 0 characters. See JFlex examples for workaround.");
    }
    if (numRead > 0) {
      zzEndRead += numRead;
      /* If numRead == requested, we might have requested to few chars to
         encode a full Unicode character. We assume that a Reader would
         otherwise never return half characters. */
      if (numRead == requested) {
        if (Character.isHighSurrogate(zzBuffer[zzEndRead - 1])) {
          --zzEndRead;
          zzFinalHighSurrogate = 1;
        }
      }
      /* potentially more input available */
      return false;
    }

    /* numRead < 0 ==> end of stream */
    return true;
  }

    
  /**
   * Closes the input stream.
   */
  public final void yyclose() throws java.io.IOException {
    zzAtEOF = true;            /* indicate end of file */
    zzEndRead = zzStartRead;  /* invalidate buffer    */

    if (zzReader != null)
      zzReader.close();
  }


  /**
   * Resets the scanner to read from a new input stream.
   * Does not close the old reader.
   *
   * All internal variables are reset, the old input stream 
   * <b>cannot</b> be reused (internal buffer is discarded and lost).
   * Lexical state is set to <tt>ZZ_INITIAL</tt>.
   *
   * Internal scan buffer is resized down to its initial length, if it has grown.
   *
   * @param reader   the new input stream 
   */
  public final void yyreset(java.io.Reader reader) {
    zzReader = reader;
    zzAtBOL  = true;
    zzAtEOF  = false;
    zzEOFDone = false;
    zzEndRead = zzStartRead = 0;
    zzCurrentPos = zzMarkedPos = 0;
    zzFinalHighSurrogate = 0;
    yyline = yychar = yycolumn = 0;
    zzLexicalState = YYINITIAL;
    if (zzBuffer.length > ZZ_BUFFERSIZE)
      zzBuffer = new char[ZZ_BUFFERSIZE];
  }


  /**
   * Returns the current lexical state.
   */
  public final int yystate() {
    return zzLexicalState;
  }


  /**
   * Enters a new lexical state
   *
   * @param newState the new lexical state
   */
  public final void yybegin(int newState) {
    zzLexicalState = newState;
  }


  /**
   * Returns the text matched by the current regular expression.
   */
  public final String yytext() {
    return new String( zzBuffer, zzStartRead, zzMarkedPos-zzStartRead );
  }


  /**
   * Returns the character at position <tt>pos</tt> from the 
   * matched text. 
   * 
   * It is equivalent to yytext().charAt(pos), but faster
   *
   * @param pos the position of the character to fetch. 
   *            A value from 0 to yylength()-1.
   *
   * @return the character at position pos
   */
  public final char yycharat(int pos) {
    return zzBuffer[zzStartRead+pos];
  }


  /**
   * Returns the length of the matched text region.
   */
  public final int yylength() {
    return zzMarkedPos-zzStartRead;
  }


  /**
   * Reports an error that occured while scanning.
   *
   * In a wellformed scanner (no or only correct usage of 
   * yypushback(int) and a match-all fallback rule) this method 
   * will only be called with things that "Can't Possibly Happen".
   * If this method is called, something is seriously wrong
   * (e.g. a JFlex bug producing a faulty scanner etc.).
   *
   * Usual syntax/scanner level error handling should be done
   * in error fallback rules.
   *
   * @param   errorCode  the code of the errormessage to display
   */
  private void zzScanError(int errorCode) {
    String message;
    try {
      message = ZZ_ERROR_MSG[errorCode];
    }
    catch (ArrayIndexOutOfBoundsException e) {
      message = ZZ_ERROR_MSG[ZZ_UNKNOWN_ERROR];
    }

    throw new Error(message);
  } 


  /**
   * Pushes the specified amount of characters back into the input stream.
   *
   * They will be read again by then next call of the scanning method
   *
   * @param number  the number of characters to be read again.
   *                This number must not be greater than yylength()!
   */
  public void yypushback(int number)  {
    if ( number > yylength() )
      zzScanError(ZZ_PUSHBACK_2BIG);

    zzMarkedPos -= number;
  }


  /**
   * Contains user EOF-code, which will be executed exactly once,
   * when the end of file is reached
   */
  private void zzDoEOF() throws java.io.IOException {
    if (!zzEOFDone) {
      zzEOFDone = true;
      yyclose();
    }
  }


  /**
   * Resumes scanning until the next regular expression is matched,
   * the end of input is encountered or an I/O-Error occurs.
   *
   * @return      the next token
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  public java_cup.runtime.Symbol next_token() throws java.io.IOException {
    int zzInput;
    int zzAction;

    // cached fields:
    int zzCurrentPosL;
    int zzMarkedPosL;
    int zzEndReadL = zzEndRead;
    char [] zzBufferL = zzBuffer;
    char [] zzCMapL = ZZ_CMAP;

    int [] zzTransL = ZZ_TRANS;
    int [] zzRowMapL = ZZ_ROWMAP;
    int [] zzAttrL = ZZ_ATTRIBUTE;

    while (true) {
      zzMarkedPosL = zzMarkedPos;

      yychar+= zzMarkedPosL-zzStartRead;

      boolean zzR = false;
      int zzCh;
      int zzCharCount;
      for (zzCurrentPosL = zzStartRead  ;
           zzCurrentPosL < zzMarkedPosL ;
           zzCurrentPosL += zzCharCount ) {
        zzCh = Character.codePointAt(zzBufferL, zzCurrentPosL, zzMarkedPosL);
        zzCharCount = Character.charCount(zzCh);
        switch (zzCh) {
        case '\u000B':  // fall through
        case '\u000C':  // fall through
        case '\u0085':  // fall through
        case '\u2028':  // fall through
        case '\u2029':
          yyline++;
          yycolumn = 0;
          zzR = false;
          break;
        case '\r':
          yyline++;
          yycolumn = 0;
          zzR = true;
          break;
        case '\n':
          if (zzR)
            zzR = false;
          else {
            yyline++;
            yycolumn = 0;
          }
          break;
        default:
          zzR = false;
          yycolumn += zzCharCount;
        }
      }

      if (zzR) {
        // peek one character ahead if it is \n (if we have counted one line too much)
        boolean zzPeek;
        if (zzMarkedPosL < zzEndReadL)
          zzPeek = zzBufferL[zzMarkedPosL] == '\n';
        else if (zzAtEOF)
          zzPeek = false;
        else {
          boolean eof = zzRefill();
          zzEndReadL = zzEndRead;
          zzMarkedPosL = zzMarkedPos;
          zzBufferL = zzBuffer;
          if (eof) 
            zzPeek = false;
          else 
            zzPeek = zzBufferL[zzMarkedPosL] == '\n';
        }
        if (zzPeek) yyline--;
      }
      zzAction = -1;

      zzCurrentPosL = zzCurrentPos = zzStartRead = zzMarkedPosL;
  
      zzState = ZZ_LEXSTATE[zzLexicalState];

      // set up zzAction for empty match case:
      int zzAttributes = zzAttrL[zzState];
      if ( (zzAttributes & 1) == 1 ) {
        zzAction = zzState;
      }


      zzForAction: {
        while (true) {
    
          if (zzCurrentPosL < zzEndReadL) {
            zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL, zzEndReadL);
            zzCurrentPosL += Character.charCount(zzInput);
          }
          else if (zzAtEOF) {
            zzInput = YYEOF;
            break zzForAction;
          }
          else {
            // store back cached positions
            zzCurrentPos  = zzCurrentPosL;
            zzMarkedPos   = zzMarkedPosL;
            boolean eof = zzRefill();
            // get translated positions and possibly new buffer
            zzCurrentPosL  = zzCurrentPos;
            zzMarkedPosL   = zzMarkedPos;
            zzBufferL      = zzBuffer;
            zzEndReadL     = zzEndRead;
            if (eof) {
              zzInput = YYEOF;
              break zzForAction;
            }
            else {
              zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL, zzEndReadL);
              zzCurrentPosL += Character.charCount(zzInput);
            }
          }
          int zzNext = zzTransL[ zzRowMapL[zzState] + zzCMapL[zzInput] ];
          if (zzNext == -1) break zzForAction;
          zzState = zzNext;

          zzAttributes = zzAttrL[zzState];
          if ( (zzAttributes & 1) == 1 ) {
            zzAction = zzState;
            zzMarkedPosL = zzCurrentPosL;
            if ( (zzAttributes & 8) == 8 ) break zzForAction;
          }

        }
      }

      // store back cached position
      zzMarkedPos = zzMarkedPosL;

      if (zzInput == YYEOF && zzStartRead == zzCurrentPos) {
        zzAtEOF = true;
            zzDoEOF();
          { return new java_cup.runtime.Symbol(Simbolos.EOF); }
      }
      else {
        switch (zzAction < 0 ? zzAction : ZZ_ACTION[zzAction]) {
          case 1: 
            { System.out.println("ERROR LEXICO: " + yytext() + " LINEA: " + yyline + " COLUMNA: " + yycolumn);
            } 
            // fall through
          case 22: break;
          case 2: 
            { return new Symbol(Simbolos.abrir, yycolumn, yyline, yytext());
            } 
            // fall through
          case 23: break;
          case 3: 
            { return new Symbol(Simbolos.cerrar, yycolumn, yyline, yytext());
            } 
            // fall through
          case 24: break;
          case 4: 
            { return new Symbol(Simbolos.igual, yycolumn, yyline, yytext());
            } 
            // fall through
          case 25: break;
          case 5: 
            { /* Espacios en blanco se ignoran */
            } 
            // fall through
          case 26: break;
          case 6: 
            { return new Symbol(Simbolos.cadena, yycolumn, yyline, yytext());
            } 
            // fall through
          case 27: break;
          case 7: 
            { return new Symbol(Simbolos.texto, yycolumn, yyline, yytext());
            } 
            // fall through
          case 28: break;
          case 8: 
            { return new Symbol(Simbolos.id, yycolumn, yyline, yytext());
            } 
            // fall through
          case 29: break;
          case 9: 
            { return new Symbol(Simbolos.inicioDiv, yycolumn, yyline, yytext());
            } 
            // fall through
          case 30: break;
          case 10: 
            { return new Symbol(Simbolos.finDiv, yycolumn, yyline, yytext());
            } 
            // fall through
          case 31: break;
          case 11: 
            { return new Symbol(Simbolos.inicioHtml, yycolumn, yyline, yytext());
            } 
            // fall through
          case 32: break;
          case 12: 
            { return new Symbol(Simbolos.inicioHead, yycolumn, yyline, yytext());
            } 
            // fall through
          case 33: break;
          case 13: 
            { return new Symbol(Simbolos.inicioTitle, yycolumn, yyline, yytext());
            } 
            // fall through
          case 34: break;
          case 14: 
            { return new Symbol(Simbolos.inicioBody, yycolumn, yyline, yytext());
            } 
            // fall through
          case 35: break;
          case 15: 
            { return new Symbol(Simbolos.inicioNoufe, yycolumn, yyline, yytext());
            } 
            // fall through
          case 36: break;
          case 16: 
            { return new Symbol(Simbolos.comentarioMultiLinea, yycolumn, yyline, yytext());
            } 
            // fall through
          case 37: break;
          case 17: 
            { return new Symbol(Simbolos.finHtml, yycolumn, yyline, yytext());
            } 
            // fall through
          case 38: break;
          case 18: 
            { return new Symbol(Simbolos.finHead, yycolumn, yyline, yytext());
            } 
            // fall through
          case 39: break;
          case 19: 
            { return new Symbol(Simbolos.finBody, yycolumn, yyline, yytext());
            } 
            // fall through
          case 40: break;
          case 20: 
            { return new Symbol(Simbolos.finTitle, yycolumn, yyline, yytext());
            } 
            // fall through
          case 41: break;
          case 21: 
            { return new Symbol(Simbolos.finNoufe, yycolumn, yyline, yytext());
            } 
            // fall through
          case 42: break;
          default:
            zzScanError(ZZ_NO_MATCH);
        }
      }
    }
  }


}
