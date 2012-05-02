package br.univali.portugol.integracao.execucao;


/**
* br/univali/portugol/integracao/execucao/SaidaPOA.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from D:/Luiz Fernando/Documentos/Projetos/Portugol_X/Codigo-Fonte/Portugol-Integracao/src/br/univali/portugol/integracao/Portugol.idl
* Quarta-feira, 2 de Maio de 2012 07h25min01s BRT
*/


//==========================================================================================//
public abstract class SaidaPOA extends org.omg.PortableServer.Servant
 implements br.univali.portugol.integracao.execucao.SaidaOperations, org.omg.CORBA.portable.InvokeHandler
{

  // Constructors

  private static java.util.Hashtable _methods = new java.util.Hashtable ();
  static
  {
    _methods.put ("limpar", new java.lang.Integer (0));
    _methods.put ("escreverCadeia", new java.lang.Integer (1));
    _methods.put ("escreverLogico", new java.lang.Integer (2));
    _methods.put ("escreverInteiro", new java.lang.Integer (3));
    _methods.put ("escreverReal", new java.lang.Integer (4));
    _methods.put ("escreverCaracter", new java.lang.Integer (5));
  }

  public org.omg.CORBA.portable.OutputStream _invoke (String $method,
                                org.omg.CORBA.portable.InputStream in,
                                org.omg.CORBA.portable.ResponseHandler $rh)
  {
    org.omg.CORBA.portable.OutputStream out = null;
    java.lang.Integer __method = (java.lang.Integer)_methods.get ($method);
    if (__method == null)
      throw new org.omg.CORBA.BAD_OPERATION (0, org.omg.CORBA.CompletionStatus.COMPLETED_MAYBE);

    switch (__method.intValue ())
    {
       case 0:  // br/univali/portugol/integracao/execucao/Saida/limpar
       {
         try {
           this.limpar ();
           out = $rh.createReply();
         } catch (br.univali.portugol.integracao.Excecao $ex) {
           out = $rh.createExceptionReply ();
           br.univali.portugol.integracao.ExcecaoHelper.write (out, $ex);
         }
         break;
       }

       case 1:  // br/univali/portugol/integracao/execucao/Saida/escreverCadeia
       {
         try {
           String valor = in.read_string ();
           this.escreverCadeia (valor);
           out = $rh.createReply();
         } catch (br.univali.portugol.integracao.Excecao $ex) {
           out = $rh.createExceptionReply ();
           br.univali.portugol.integracao.ExcecaoHelper.write (out, $ex);
         }
         break;
       }

       case 2:  // br/univali/portugol/integracao/execucao/Saida/escreverLogico
       {
         try {
           boolean valor = in.read_boolean ();
           this.escreverLogico (valor);
           out = $rh.createReply();
         } catch (br.univali.portugol.integracao.Excecao $ex) {
           out = $rh.createExceptionReply ();
           br.univali.portugol.integracao.ExcecaoHelper.write (out, $ex);
         }
         break;
       }

       case 3:  // br/univali/portugol/integracao/execucao/Saida/escreverInteiro
       {
         try {
           int valor = in.read_long ();
           this.escreverInteiro (valor);
           out = $rh.createReply();
         } catch (br.univali.portugol.integracao.Excecao $ex) {
           out = $rh.createExceptionReply ();
           br.univali.portugol.integracao.ExcecaoHelper.write (out, $ex);
         }
         break;
       }

       case 4:  // br/univali/portugol/integracao/execucao/Saida/escreverReal
       {
         try {
           double valor = in.read_double ();
           this.escreverReal (valor);
           out = $rh.createReply();
         } catch (br.univali.portugol.integracao.Excecao $ex) {
           out = $rh.createExceptionReply ();
           br.univali.portugol.integracao.ExcecaoHelper.write (out, $ex);
         }
         break;
       }

       case 5:  // br/univali/portugol/integracao/execucao/Saida/escreverCaracter
       {
         try {
           char valor = in.read_char ();
           this.escreverCaracter (valor);
           out = $rh.createReply();
         } catch (br.univali.portugol.integracao.Excecao $ex) {
           out = $rh.createExceptionReply ();
           br.univali.portugol.integracao.ExcecaoHelper.write (out, $ex);
         }
         break;
       }

       default:
         throw new org.omg.CORBA.BAD_OPERATION (0, org.omg.CORBA.CompletionStatus.COMPLETED_MAYBE);
    }

    return out;
  } // _invoke

  // Type-specific CORBA::Object operations
  private static String[] __ids = {
    "IDL:br/univali/portugol/integracao/execucao/Saida:1.0"};

  public String[] _all_interfaces (org.omg.PortableServer.POA poa, byte[] objectId)
  {
    return (String[])__ids.clone ();
  }

  public Saida _this() 
  {
    return SaidaHelper.narrow(
    super._this_object());
  }

  public Saida _this(org.omg.CORBA.ORB orb) 
  {
    return SaidaHelper.narrow(
    super._this_object(orb));
  }


} // class SaidaPOA
