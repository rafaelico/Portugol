package br.univali.portugol.integracao.asa;


/**
* br/univali/portugol/integracao/asa/NoRealPOA.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from D:/Luiz Fernando/Documentos/Projetos/Portugol_X/Codigo-Fonte/Portugol-Integracao/src/br/univali/portugol/integracao/Portugol.idl
* Quarta-feira, 2 de Maio de 2012 07h25min01s BRT
*/


//==========================================================================================//
public abstract class NoRealPOA extends org.omg.PortableServer.Servant
 implements br.univali.portugol.integracao.asa.NoRealOperations, org.omg.CORBA.portable.InvokeHandler
{

  // Constructors

  private static java.util.Hashtable _methods = new java.util.Hashtable ();
  static
  {
    _methods.put ("getValor", new java.lang.Integer (0));
    _methods.put ("getReferenciaCodigo", new java.lang.Integer (1));
    _methods.put ("aceitar", new java.lang.Integer (2));
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
       case 0:  // br/univali/portugol/integracao/asa/NoReal/getValor
       {
         double $result = (double)0;
         $result = this.getValor ();
         out = $rh.createReply();
         out.write_double ($result);
         break;
       }

       case 1:  // br/univali/portugol/integracao/asa/NoExpressao/getReferenciaCodigo
       {
         br.univali.portugol.integracao.asa.TrechoCodigoFonte $result = null;
         $result = this.getReferenciaCodigo ();
         out = $rh.createReply();
         br.univali.portugol.integracao.asa.TrechoCodigoFonteHelper.write (out, $result);
         break;
       }

       case 2:  // br/univali/portugol/integracao/asa/No/aceitar
       {
         try {
           br.univali.portugol.integracao.asa.VisitanteASA visitante = br.univali.portugol.integracao.asa.VisitanteASAHelper.read (in);
           org.omg.CORBA.Any $result = null;
           $result = this.aceitar (visitante);
           out = $rh.createReply();
           out.write_any ($result);
         } catch (br.univali.portugol.integracao.asa.ExcecaoVisitaASA $ex) {
           out = $rh.createExceptionReply ();
           br.univali.portugol.integracao.asa.ExcecaoVisitaASAHelper.write (out, $ex);
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
    "IDL:br/univali/portugol/integracao/asa/NoReal:1.0", 
    "IDL:br/univali/portugol/integracao/asa/NoExpressao:1.0", 
    "IDL:br/univali/portugol/integracao/asa/NoBloco:1.0", 
    "IDL:br/univali/portugol/integracao/asa/No:1.0"};

  public String[] _all_interfaces (org.omg.PortableServer.POA poa, byte[] objectId)
  {
    return (String[])__ids.clone ();
  }

  public NoReal _this() 
  {
    return NoRealHelper.narrow(
    super._this_object());
  }

  public NoReal _this(org.omg.CORBA.ORB orb) 
  {
    return NoRealHelper.narrow(
    super._this_object(orb));
  }


} // class NoRealPOA
