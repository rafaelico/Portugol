package br.univali.portugol.integracao.execucao;


/**
* br/univali/portugol/integracao/execucao/_ResultadoExecucaoStub.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from D:/Luiz Fernando/Documentos/Projetos/Portugol_X/Codigo-Fonte/Portugol-Integracao/src/br/univali/portugol/integracao/Portugol.idl
* Quarta-feira, 2 de Maio de 2012 07h25min01s BRT
*/


//==========================================================================================//
public class _ResultadoExecucaoStub extends org.omg.CORBA.portable.ObjectImpl implements br.univali.portugol.integracao.execucao.ResultadoExecucao
{

  public long getTempoExecucao ()
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("getTempoExecucao", true);
                $in = _invoke ($out);
                long $result = $in.read_longlong ();
                return $result;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                return getTempoExecucao (        );
            } finally {
                _releaseReply ($in);
            }
  } // getTempoExecucao

  public br.univali.portugol.integracao.execucao.ModoEncerramento getModoEncerramento ()
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("getModoEncerramento", true);
                $in = _invoke ($out);
                br.univali.portugol.integracao.execucao.ModoEncerramento $result = br.univali.portugol.integracao.execucao.ModoEncerramentoHelper.read ($in);
                return $result;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                return getModoEncerramento (        );
            } finally {
                _releaseReply ($in);
            }
  } // getModoEncerramento

  public br.univali.portugol.integracao.mensagens.ErroExecucao getErro ()
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("getErro", true);
                $in = _invoke ($out);
                br.univali.portugol.integracao.mensagens.ErroExecucao $result = br.univali.portugol.integracao.mensagens.ErroExecucaoHelper.read ($in);
                return $result;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                return getErro (        );
            } finally {
                _releaseReply ($in);
            }
  } // getErro

  // Type-specific CORBA::Object operations
  private static String[] __ids = {
    "IDL:br/univali/portugol/integracao/execucao/ResultadoExecucao:1.0"};

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
} // class _ResultadoExecucaoStub
