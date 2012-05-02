package br.univali.portugol.integracao.asa;


/**
* br/univali/portugol/integracao/asa/NoParaPOA.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from D:/Luiz Fernando/Documentos/Projetos/Portugol_X/Codigo-Fonte/Portugol-Integracao/src/br/univali/portugol/integracao/Portugol.idl
* Quarta-feira, 2 de Maio de 2012 07h25min01s BRT
*/


//==========================================================================================//
public abstract class NoParaPOA extends org.omg.PortableServer.Servant
 implements br.univali.portugol.integracao.asa.NoParaOperations, org.omg.CORBA.portable.InvokeHandler
{

  // Constructors

  private static java.util.Hashtable _methods = new java.util.Hashtable ();
  static
  {
    _methods.put ("getBlocos", new java.lang.Integer (0));
    _methods.put ("getInicializacao", new java.lang.Integer (1));
    _methods.put ("getIncremento", new java.lang.Integer (2));
    _methods.put ("getCondicao", new java.lang.Integer (3));
    _methods.put ("aceitar", new java.lang.Integer (4));
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
       case 0:  // br/univali/portugol/integracao/asa/NoPara/getBlocos
       {
         br.univali.portugol.integracao.asa.NoBloco $result[] = null;
         $result = this.getBlocos ();
         out = $rh.createReply();
         br.univali.portugol.integracao.asa.ListaNoBlocoHelper.write (out, $result);
         break;
       }

       case 1:  // br/univali/portugol/integracao/asa/NoPara/getInicializacao
       {
         br.univali.portugol.integracao.asa.NoBloco $result = null;
         $result = this.getInicializacao ();
         out = $rh.createReply();
         br.univali.portugol.integracao.asa.NoBlocoHelper.write (out, $result);
         break;
       }

       case 2:  // br/univali/portugol/integracao/asa/NoPara/getIncremento
       {
         br.univali.portugol.integracao.asa.NoExpressao $result = null;
         $result = this.getIncremento ();
         out = $rh.createReply();
         br.univali.portugol.integracao.asa.NoExpressaoHelper.write (out, $result);
         break;
       }

       case 3:  // br/univali/portugol/integracao/asa/NoPara/getCondicao
       {
         br.univali.portugol.integracao.asa.NoExpressao $result = null;
         $result = this.getCondicao ();
         out = $rh.createReply();
         br.univali.portugol.integracao.asa.NoExpressaoHelper.write (out, $result);
         break;
       }

       case 4:  // br/univali/portugol/integracao/asa/No/aceitar
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
    "IDL:br/univali/portugol/integracao/asa/NoPara:1.0", 
    "IDL:br/univali/portugol/integracao/asa/NoBloco:1.0", 
    "IDL:br/univali/portugol/integracao/asa/No:1.0"};

  public String[] _all_interfaces (org.omg.PortableServer.POA poa, byte[] objectId)
  {
    return (String[])__ids.clone ();
  }

  public NoPara _this() 
  {
    return NoParaHelper.narrow(
    super._this_object());
  }

  public NoPara _this(org.omg.CORBA.ORB orb) 
  {
    return NoParaHelper.narrow(
    super._this_object(orb));
  }


} // class NoParaPOA
