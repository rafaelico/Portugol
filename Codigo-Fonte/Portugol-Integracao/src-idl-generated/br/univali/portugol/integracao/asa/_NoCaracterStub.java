package br.univali.portugol.integracao.asa;


/**
* br/univali/portugol/integracao/asa/_NoCaracterStub.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from D:/Luiz Fernando/Documentos/Projetos/Portugol_X/Codigo-Fonte/Portugol-Integracao/src/br/univali/portugol/integracao/Portugol.idl
* Quarta-feira, 2 de Maio de 2012 07h25min01s BRT
*/


//==========================================================================================//
public class _NoCaracterStub extends org.omg.CORBA.portable.ObjectImpl implements br.univali.portugol.integracao.asa.NoCaracter
{

  public char getValor ()
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("getValor", true);
                $in = _invoke ($out);
                char $result = $in.read_char ();
                return $result;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                return getValor (        );
            } finally {
                _releaseReply ($in);
            }
  } // getValor

  public br.univali.portugol.integracao.asa.TrechoCodigoFonte getReferenciaCodigo ()
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("getReferenciaCodigo", true);
                $in = _invoke ($out);
                br.univali.portugol.integracao.asa.TrechoCodigoFonte $result = br.univali.portugol.integracao.asa.TrechoCodigoFonteHelper.read ($in);
                return $result;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                return getReferenciaCodigo (        );
            } finally {
                _releaseReply ($in);
            }
  } // getReferenciaCodigo

  public org.omg.CORBA.Any aceitar (br.univali.portugol.integracao.asa.VisitanteASA visitante) throws br.univali.portugol.integracao.asa.ExcecaoVisitaASA
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("aceitar", true);
                br.univali.portugol.integracao.asa.VisitanteASAHelper.write ($out, visitante);
                $in = _invoke ($out);
                org.omg.CORBA.Any $result = $in.read_any ();
                return $result;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                if (_id.equals ("IDL:br/univali/portugol/integracao/asa/ExcecaoVisitaASA:1.0"))
                    throw br.univali.portugol.integracao.asa.ExcecaoVisitaASAHelper.read ($in);
                else
                    throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                return aceitar (visitante        );
            } finally {
                _releaseReply ($in);
            }
  } // aceitar

  // Type-specific CORBA::Object operations
  private static String[] __ids = {
    "IDL:br/univali/portugol/integracao/asa/NoCaracter:1.0", 
    "IDL:br/univali/portugol/integracao/asa/NoExpressao:1.0", 
    "IDL:br/univali/portugol/integracao/asa/NoBloco:1.0", 
    "IDL:br/univali/portugol/integracao/asa/No:1.0"};

  public String[] _ids ()
  {
    return (String[])__ids.clone ();
  }

  private void readObject (java.io.ObjectInputStream s) throws java.io.IOException
  {
     String str = s.readUTF ();
     String[] args = null;
     java.util.Properties props = null;
     org.omg.CORBA.ORB orb = org.omg.CORBA.ORB.init (args, props);
   try {
     org.omg.CORBA.Object obj = orb.string_to_object (str);
     org.omg.CORBA.portable.Delegate delegate = ((org.omg.CORBA.portable.ObjectImpl) obj)._get_delegate ();
     _set_delegate (delegate);
   } finally {
     orb.destroy() ;
   }
  }

  private void writeObject (java.io.ObjectOutputStream s) throws java.io.IOException
  {
     String[] args = null;
     java.util.Properties props = null;
     org.omg.CORBA.ORB orb = org.omg.CORBA.ORB.init (args, props);
   try {
     String str = orb.object_to_string (this);
     s.writeUTF (str);
   } finally {
     orb.destroy() ;
   }
  }
} // class _NoCaracterStub
